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
import com.itech.pangea.business.domain.TrainingTopic;
import com.itech.pangea.business.repo.TrainingTopicRepo;
import com.itech.pangea.business.service.TrainingTopicService;
import com.itech.pangea.business.service.UserService;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class TrainingTopicServiceImpl implements TrainingTopicService {
    
    @Resource
    private TrainingTopicRepo trainingTopicRepo;
    @Resource
    private UserService userService;
    
    @Override
    public List<TrainingTopic> getAll() {
        return trainingTopicRepo.findByActiveOrderByNameAsc(Boolean.TRUE);
    }

    @Override
    public TrainingTopic get(Long id) {
        if(id == null){
            throw new IllegalStateException("Item to be does not exist :"+id);
        }
        return trainingTopicRepo.findOne(id);
    }

    @Override
    public void delete(TrainingTopic t) {
        if(t.getId() == null){
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        trainingTopicRepo.save(t);
    }

    @Override
    public List<TrainingTopic> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TrainingTopic save(TrainingTopic t) {
        if(t.getId() == null){
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            return trainingTopicRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        return trainingTopicRepo.save(t);
    }   

    @Override
    public Boolean checkDuplicate(TrainingTopic current, TrainingTopic old) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}