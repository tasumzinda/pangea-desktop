/*
 * Copyright 2016 Judge Muzinda.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.itech.pangea.business.util.dto;

import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Facility;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Period;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.util.DateUtil;

/**
 *
 * @author Judge Muzinda
 */
public class VisitReportSearchDTO implements Serializable {

    private Province province;
    private District district;
    private Facility facility;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date startDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date endDate;
    private Mentor mentor;
    private Period period;

    public VisitReportSearchDTO() {
    }

    public VisitReportSearchDTO(Province province, District district,Facility facility, Date startDate, Date endDate, Mentor mentor, Period period) {
        this.province = province;
        this.district = district;
        this.facility = facility;
        this.startDate = startDate;
        this.endDate = endDate;
        this.mentor = mentor;
        this.period = period;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public static VisitReportSearchDTO getInstance(VisitReportSearchDTO dto) {
        if(dto.getStartDate() == null || dto.getEndDate() == null){
            dto.setStartDate(null);
            dto.setEndDate(null);
        }
        return new VisitReportSearchDTO(dto.getProvince(), dto.getDistrict(), dto.getFacility(), dto.getStartDate(), dto.getEndDate(), dto.getMentor(), dto.getPeriod());
    }

    public String getQueryString(VisitReportSearchDTO dto) {
        StringBuilder query = new StringBuilder("");
        int position = 0;
        if (dto.getProvince() != null) {
            if (position == 0) {
                query.append("?province=");
                query.append(dto.getProvince().getId());
                position++;
            } else {
                query.append("&province=");
                query.append(dto.getProvince().getId());
            }
        }
        if (dto.getDistrict() != null) {
            if (position == 0) {
                query.append("?district=");
                query.append(dto.getDistrict().getId());
                position++;
            } else {
                query.append("&district=");
                query.append(dto.getDistrict().getId());
            }
        }
        if (dto.getFacility()!= null) {
            if (position == 0) {
                query.append("?facility=");
                query.append(dto.getFacility().getId());
                position++;
            } else {
                query.append("&facility=");
                query.append(dto.getFacility().getId());
            }
        }
        if (dto.getStartDate() != null) {
            if (position == 0) {
                query.append("?startDate=");
                query.append(DateUtil.getStringFromDate(dto.getStartDate()));
                position++;
            } else {
                query.append("&startDate=");
                query.append(DateUtil.getStringFromDate(dto.getStartDate()));
            }
        }
        if (dto.getEndDate() != null) {
            if (position == 0) {
                query.append("?endDate=");
                query.append(DateUtil.getStringFromDate(dto.getEndDate()));
                position++;
            } else {
                query.append("&endDate=");
                query.append(DateUtil.getStringFromDate(dto.getEndDate()));
            }
        }
        if (dto.getMentor()!= null) {
            if (position == 0) {
                query.append("?mentor=");
                query.append(dto.getMentor().getId());
                position++;
            } else {
                query.append("&mentor=");
                query.append(dto.getMentor().getId());
            }
        }
        if (dto.getPeriod()!= null) {
            if (position == 0) {
                query.append("?period=");
                query.append(dto.getPeriod().getId());
                position++;
            } else {
                query.append("&period=");
                query.append(dto.getPeriod().getId());
            }
        }
        return query.toString();
    }
}
