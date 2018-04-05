package com.itech.pangea.business.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.repo.ProvinceRepo;
import com.itech.pangea.business.service.ProvinceService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.NameIdDTO;

/**
 *
 * @author Judge Muzinda
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Repository
public class ProvinceServiceImpl implements ProvinceService {

    @Resource
    private ProvinceRepo provinceRepo;
    @Resource
    private UserService userService;
    
    @Override
    public List<Province> getAll() {
        return provinceRepo.getOptAll(Boolean.TRUE);
    }

    @Override
    public Province get(Long id) {
        if(id == null){
            throw new IllegalStateException("Item to be does not exist :"+id);
        }
        return provinceRepo.findOne(id);
    }

    @Override
    public void delete(Province t) {
        if(t.getId() == null){
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        provinceRepo.save(t);
    }

    @Override
    public List<Province> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Province save(Province t) {
        if(t.getId() == null){
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return provinceRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return provinceRepo.save(t);
    }   

    @Override
    public Province getByName(String name) {
        return provinceRepo.getProvinceByName(name);
    }

    @Override
    public Boolean checkDuplicate(Province current, Province old) {
        if(current.getId() != null){
            /**
             * @param current is in existence
             */
            if(!current.getName().equals(old.getName())){
                if(provinceRepo.getProvinceByName(current.getName()) != null){
                    return true;
                }
            }
            
        }else if(current.getId() == null){
            /**
             * @param current is new
             */
            if(provinceRepo.getProvinceByName(current.getName()) != null){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public List<NameIdDTO> getProvinces(){
        ArrayList<NameIdDTO> list = new ArrayList<>();
        for(Province p : getAll()){
            list.add(new NameIdDTO(p.getName(), p.getId()));
        }
        return list;
    }
}