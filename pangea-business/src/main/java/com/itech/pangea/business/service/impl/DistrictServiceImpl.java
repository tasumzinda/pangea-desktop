package com.itech.pangea.business.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.repo.DistrictRepo;
import com.itech.pangea.business.service.DistrictService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.DistrictDTO;
import com.itech.pangea.business.util.dto.NameIdDTO;

/**
 *
 * @author Edward Zengeni
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class DistrictServiceImpl implements DistrictService {

    @Resource
    private DistrictRepo districtRepo;
    @Resource
    private UserService userService;

    @Override
    @Transactional
    public District save(District t) {
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return districtRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return districtRepo.save(t);
    }

    @Override
    public List<District> getAll() {
        return districtRepo.getOptAll(Boolean.TRUE);
    }

    @Override
    public District get(Long id) {
        if (id == null) {
            throw new IllegalStateException("Item to be does not exist");
        }
        return districtRepo.findOne(id);
    }

    @Override
    public void delete(District t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        districtRepo.save(t);
    }

    @Override
    public List<District> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<District> getDistrictByProvince(Province province) {
        return districtRepo.getOptByProvince(province);
    }

    @Override
    public Boolean checkDuplicate(District current, District old) {
        if(current.getId() != null){
            /**
             * @param current is in existence
             */
            if(!current.getName().equalsIgnoreCase(old.getName())){
                if(districtRepo.getByNameAndProvince(current.getName(), current.getProvince()) != null){
                    return true;
                }
            }
            
        }else if(current.getId() == null){
            /**
             * @param current is new
             */
            if(districtRepo.getByNameAndProvince(current.getName(), current.getProvince()) != null){
                return true;
            }
        }
        return false;
    }

    @Override
    public District getByNameAndProvince(String name, Province province) {
        return districtRepo.getByNameAndProvince(name, province);
    }

    @Override
    public List<NameIdDTO> getByParent(List<District> districts) {
        List<NameIdDTO> items = new ArrayList<>();
        for(District district : districts){
            items.add(new NameIdDTO(district.getName(), district.getId()));
        }
        return items;
    }
    
    @Override
    public List<DistrictDTO> getDistricts(){
        List<DistrictDTO> list = new ArrayList<>();
        for(District item : getAll()){
            list.add(new DistrictDTO(item.getName(), item.getId(), new NameIdDTO(item.getProvince().getName(), item.getProvince().getId())));
        }
        return list;
    }

}
