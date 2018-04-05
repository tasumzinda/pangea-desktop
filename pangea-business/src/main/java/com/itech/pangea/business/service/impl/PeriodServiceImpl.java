package com.itech.pangea.business.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.repo.PeriodRepo;
import com.itech.pangea.business.service.PeriodService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.DateUtil;
import static com.itech.pangea.business.util.DateUtil.*;

/**
 *
 * @author Edward Zengeni
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class PeriodServiceImpl implements PeriodService {

    @Resource
    private PeriodRepo periodRepo;
    @Resource
    private UserService userService;

    @Transactional
    @Override
    public Period save(Period t) {
        if (t.getId() == null) {
            t.setDateCreated(new Date());
            return periodRepo.save(t);
        }
        t.setDateModified(new Date());
        return periodRepo.save(t);
    }

    @Override
    public Period constructPeriod(Date startDate) {
        Period period = new Period();
        period.setStartDate(DateUtil.getPeriodStart(startDate));
        period.setEndDate(DateUtil.getPeriodEnd(startDate));
        return period;
    }

    @Override
    public Period get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist");
        }
        return periodRepo.findOne(id);
    }

    @Override
    public void delete(Period t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        periodRepo.save(t);
    }

    @Override
    public List<Period> getPageable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Period> getAll() {
        return periodRepo.getOptAll(Boolean.TRUE);
    }

    @Override
    public Boolean checkDuplicate(Period current, Period old) {
        if (periodRepo.getByStartDateAndEndDate(current.getStartDate(), current.getEndDate()).size() >= 1) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public Period getLatestPeriod() {
        for (Period p : getAll()) {
            return p;
        }
        return null;
    }

    @Override
    public Period getCurrentPeriod(Date currentDate) {
        return getLatestPeriod();
    }

    @Override
    public List<Period> getActivePeriods() {
        return periodRepo.getOptAll(Boolean.TRUE);
    }

    @Override
    public Period getByStartAndEndDate(Date startDate, Date endDate) {
        return periodRepo.getByByPeriod(startDate, endDate);
    }

    @Override
    @Deprecated
    public List<Period> getLastTwelveMonths() {
        /**
         * inefficient method, efficient method will be used in next version
         * method will be eliminated in next version
         */
        List<Period> items = new ArrayList<>();
        int count = 0;
        for (Period p : getAll()) {
            if (count < 12) {
                items.add(p);
            }
            count++;
        }
        return items;
    }

    @Override
    public List<Period> getPastPeriod(int monthsPast) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateRenewalPeriod() {
        /**
         * check if table has any records
         */
        if (getAll().size() <= 0) {
            for (Integer year : YEAR_RANGE) {
                Period p = new Period(getDate(year, Boolean.TRUE), getDate(year, Boolean.FALSE));
                save(p);
            }
        } else {
            Date lastStartDate = getLatestPeriod().getStartDate();
            for (Integer year : getInitialDateRange(getYearFromDate(lastStartDate))) {
                Period p = new Period(getDate(year, Boolean.TRUE), getDate(year, Boolean.FALSE));
                if (!checkDuplicate(p, p)) {
                    save(p);
                }
            }
        }
    }

    @Override
    public void deActivateStalePeriods() {
        for (Period p : getActivePeriods()) {
            Integer year = getYearFromDate(p.getEndDate());
            if (CURRENT_YEAR - year > 1) {
                p.setActive(Boolean.FALSE);
                save(p);
            }
        }
    }

    @Override
    public Period getPeriodByYear(Integer year) {
        for (Period r : periodRepo.getPeriodByStartDate(getDate(year, Boolean.TRUE))) {
            return r;
        }
        return null;
    }

    @Override
    public Period getByStartDate(Date startDate) {
        return periodRepo.findByStartDate(startDate);
    }

}
