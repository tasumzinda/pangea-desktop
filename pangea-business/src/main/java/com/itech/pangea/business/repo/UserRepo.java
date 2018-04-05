/*
 * Copyright 2015 Edward Zengeni.
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
package com.itech.pangea.business.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.itech.pangea.business.domain.District;
import com.itech.pangea.business.domain.User;

/**
 *
 * @author Edward Zengeni
 */
public interface UserRepo extends AbstractRepo<User, Long> {

    @Query("from User p where p.active=:active Order By p.userName ASC")
    public List<User> getOptAll(@Param("active") Boolean active);

    @Query("from User p left join fetch p.userRoles where p.userName=:userName and p.active=:active")
    public User findByUserName(@Param("userName") String userName, @Param("active") Boolean active);
    
  

//    @Query("from User p where p.userName=:userName")
//    public boolean hasDuplicateUserName(User user, Boolean exists);
    public List<User> findByDistrict(District district);
}
