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
package com.itech.pangea.business.repo;

import org.springframework.data.repository.CrudRepository;
import com.itech.pangea.business.domain.Mentor;

/**
 *
 * @author Judge Muzinda
 */
public interface MentorReportRepo extends CrudRepository<Mentor, Long> {
    
    /*@Query("selec count(v) from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.facility.district=:district")
    public Integer getByMentorAndDistrict(@Param("mentor") Mentor mentor, @Param("district") District district);
    
    @Query("selec count(v) from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.visitStatus=:visitStatus")
    public Integer getByMentorAndVisitStatus(@Param("mentor") Mentor mentor, @Param("visitStatus") VisitStatus visitStatus);
    
    @Query("selec count(v) from Visit v left join fetch v.mentors vm where :mentor in (vm) and v.visitFailReason=:visitFailReason")
    public Integer getByMentorAndVisitFailReason(@Param("mentor") Mentor mentor, @Param("visitFailReason") VisitFailReason visitFailReason);*/
}