package com.itech.pangea.business.service.impl;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.User;
import com.itech.pangea.business.repo.UserRepo;
import com.itech.pangea.business.service.UserService;

/**
 *
 * @author Judge Muzinda
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements UserService {

    final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    private UserRepo userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.getOptAll(Boolean.TRUE);
    }

    @Override
    public User get(Long id) {
        return userRepo.findOne(id);
    }

    @Override
    public void delete(User t) {
        if (t.getId() == null) {
            throw new IllegalStateException("Item to be deleted is in an inconsistent state");
        }
        t.setActive(Boolean.FALSE);
        userRepo.save(t);
    }

    @Override
    public List<User> getPageable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public User save(User t) {
        if (t.getId() == null) {
            t.setCreatedBy(getCurrentUser());
            t.setDateCreated(new Date());
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            String hashedPassword = encoder.encode(t.getPassword());
            t.setPassword(hashedPassword);
            return userRepo.save(t);
        }
        t.setModifiedBy(getCurrentUser());
        t.setDateModified(new Date());
        return userRepo.save(t);
    }

    @Override
    @Transactional
    public User changePassword(User t) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPassword = encoder.encode(t.getPassword());
        t.setPassword(hashedPassword);
        t.setModifiedBy(getCurrentUser());
        t.setDateModified(new Date());
        return userRepo.save(t);
    }

    @Override
    public Boolean checkDuplicate(User current, User old) {
        if(current.getId() != null){
            /**
             * @param current is in existence
             */
            if(!current.getUserName().equals(old.getUserName())){
                if(findByUserName(current.getUserName()) != null){
                    return true;
                }
            }
            
        }else if(current.getId() == null){
            /**
             * @param current is new
             */
            if(findByUserName(current.getUserName()) != null){
                return true;
            }
        }
        return false;
    }

    @Override
    public User findByUserName(String name) {
        return userRepo.findByUserName(name, Boolean.TRUE);
    }
   

    @Override
    public User getCurrentUser() {
        String username = getCurrentUsername();
        if (username == null) {
            return null;
        }
        User user = findByUserName(username);
        if (user == null) {
            return null;
        }
        return user;
    }

    @Override
    public String getCurrentUsername() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated() || authentication.getPrincipal() == null) {
            return null;
        }
        if (authentication.getPrincipal() instanceof String) {
            String principal = (String) authentication.getPrincipal();

            if (principal.compareTo("anonymousUser") != 0) {
                return null;
            }
            return principal;
        }
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return userDetails.getUsername();
    }

    @Override
    public List<User> getByDistrict(District d) {
        return userRepo.findByDistrict(d);
    }
    
    @Override
    public void changeUserName(){
      for(User t : getAll()){
          String userName = t.getUserName();
          userName = userName.replace("@itech.co.zw", "@pzat.org");
          t.setUserName(userName);
          save(t);
      }
    }
}
