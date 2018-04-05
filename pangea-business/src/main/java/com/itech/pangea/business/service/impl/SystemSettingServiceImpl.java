/*
 * Copyright 2015 Judge Muzinda.
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
package com.itech.pangea.business.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.SystemSetting;
import com.itech.pangea.business.repo.SystemSettingRepo;
import com.itech.pangea.business.service.SystemSettingService;
import com.itech.pangea.business.service.UserService;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class SystemSettingServiceImpl implements SystemSettingService {
    
    @Resource
    private SystemSettingRepo systemSettingRepo;
    @Resource
    private UserService userService;

    @Override
    public List<SystemSetting> getAll() {
        return systemSettingRepo.findAll();
    }

    @Override
    public SystemSetting get(Long id) {
        if(id == null){
            throw new IllegalStateException("Item to be does not exist :"+id);
        }
        return systemSettingRepo.findOne(id);
    }

    @Override
    public SystemSetting getItem() {
        Integer numSettings = systemSettingRepo.numSettings();
        if(numSettings > 1){
            throw new IllegalStateException("Only expected one record/ row for settings found :"+numSettings);
        }else if(numSettings <= 0){
            return new SystemSetting();
        }
        return getAll().get(0);
    }
    
    @Override
    public void delete(SystemSetting t) {
        if(t.getId() == null){
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        systemSettingRepo.save(t);
    }

    @Override
    public List<SystemSetting> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SystemSetting save(SystemSetting t) {
        if(t.getId() == null){
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return systemSettingRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return systemSettingRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(SystemSetting current, SystemSetting old) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}