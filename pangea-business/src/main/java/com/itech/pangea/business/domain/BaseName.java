/*
 * Copyright 2014 Judge Muzinda.
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

package com.itech.pangea.business.domain;

import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import com.itech.pangea.business.util.StringUtils;

/**
 *
 * @author Judge Muzinda
 */
@MappedSuperclass
abstract public class BaseName extends BaseEntity {
    
    private String name;
    private String description;
    
    public BaseName(){
        
    }
    
    public BaseName(User createdBy, User modifiedBy, Date dateCreated, Date dateModified, String name){
        super(createdBy, modifiedBy, dateCreated, dateModified);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Transient
    public String getShortName(){
        String raw = name.trim();
        if(raw.split("\\s").length > 1){
            String output = "";
            String [] arr = raw.split("\\s");
            if(arr[0].length() >= 3){
                output += arr[0].substring(0, 3);
            }
            if(arr[1].length() >= 3){
                output += " "+arr[1];
            }
            return StringUtils.toCamelCase2(output);
        }
        if(name.length() >= 7)
            return getName().substring(0, 6);
        return getName();
    }
    
}