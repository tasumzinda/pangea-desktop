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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.Designation;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.Mentor;
import com.itech.pangea.business.domain.Province;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.domain.UserRole;
import com.itech.pangea.business.domain.util.MentorRole;
import com.itech.pangea.business.repo.MentorRepo;
import com.itech.pangea.business.service.DistrictService;
import com.itech.pangea.business.service.MentorService;
import com.itech.pangea.business.service.UserRoleService;
import com.itech.pangea.business.service.UserService;
import com.itech.pangea.business.util.dto.NameIdDTO;
import com.itech.pangea.business.util.dto.SearchNationalDTO;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class MentorServiceImpl implements MentorService {

    @Resource
    private MentorRepo mentorRepo;
    @Resource
    private UserService userService;
    @Resource
    private UserRoleService userRoleService;
    @Resource
    private DistrictService districtService;
    final Logger logger = LoggerFactory.getLogger(MentorServiceImpl.class);

    @Override
    public List<Mentor> getAll() {
        return mentorRepo.findByActiveOpt(Boolean.TRUE);
    }

    @Override
    public Mentor get(Long id) {
        return mentorRepo.getItem(id);
    }

    @Override
    public void delete(Mentor t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        mentorRepo.save(t);
    }

    @Override
    public List<Mentor> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public Mentor save(Mentor t) {
        if (t.getMentorRole() != null && t.getMentorRole().equals(MentorRole.NATIONAL)) {
            t.setDistricts(getProvinceMentors(t));
        }
        if (t.getId() == null) {
            t.setCreatedBy(userService.getCurrentUser());
            t.setDateCreated(new Date());
            t.setEmail(t.getUserName());
            userService.save(createMentorUser(t));
            return mentorRepo.save(t);
        }
        t.setModifiedBy(userService.getCurrentUser());
        t.setDateModified(new Date());
        t.setEmail(t.getUserName());
        return mentorRepo.save(t);
    }

    private Set<District> getProvinceMentors(Mentor m) {
        Set<District> items = new HashSet<>();
        if (m.getProvince() != null) {
            for (District district : districtService.getDistrictByProvince(m.getProvince())) {
                items.add(district);
            }
        }
        return items;
    }

    @Transactional
    @Override
    public void updateMentor(Mentor m) {

        save(m);
    }

    public User createMentorUser(Mentor mentor) {
        User user = new User();
        user.setUserName(mentor.getUserName());
        user.setFirstName(mentor.getFirstName());
        user.setLastName(mentor.getLastName());
        user.setPassword(mentor.getFirstName());
        Set<UserRole> userRoles = new HashSet<>();
        userRoles.add(userRoleService.getByName("ROLE_REST"));

        user.setUserRoles(userRoles);
        return user;
    }

    @Override
    public Boolean checkDuplicate(Mentor current, Mentor old) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mentor> getByDistrict(District district) {
        return mentorRepo.getByDistrict(district);
    }

    @Override
    public List<Mentor> getByProvince(Province province) {
        List<Mentor> mentors = new ArrayList<>();
        for (Mentor m : getAll()) {
            District d = null;
            for (District district : m.getDistricts()) {
                //d = district;
                logger.debug("Province", district.getProvince().getName());
                if(district.getProvince().equals(province)){
                    mentors.add(m);
                }
                break;
            }
            /*if (d.getProvince().equals(province)) {
                mentors.add(m);
            }*/
        }
        return mentors;
    }

    @Override
    public List<Mentor> get(SearchNationalDTO dto) {
        if (dto.getDistrict() != null) {
            return getByDistrict(dto.getDistrict());
        } else if (dto.getProvince() != null) {
            return getByProvince(dto.getProvince());
        }
        return getAll();
    }

    @Override
    public Mentor getByNationalId(String nationalId) {
        return mentorRepo.findByNationalId(nationalId);
    }

    @Override
    public Mentor getByEmail(String email) {
        return mentorRepo.findByEmail(email);
    }

    @Override
    public NameIdDTO getMentor(Mentor item) {
        return new NameIdDTO(item.getName(), item.getId());
    }

    @Override
    public Boolean getDistricts(Mentor mentor) {
        if (mentorRepo.findMentorDistricts(mentor).size() >= 1) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public List<Mentor> getByDistrictAndDesignation(District district, Designation designation) {
        return mentorRepo.findByDistrictAndDesignation(district, designation);
    }
    
    @Override
    public void changeUserName(){
      for(Mentor t : getAll()){
          save(t);
      }
    }

}
