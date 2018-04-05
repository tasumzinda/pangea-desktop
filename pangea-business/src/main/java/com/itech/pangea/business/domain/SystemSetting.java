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
package com.itech.pangea.business.domain;

import javax.persistence.Entity;

/**
 *
 * @author Judge Muzinda
 */
@Entity
public class SystemSetting extends BaseEntity {
    
    private String odkDataDownloadUrl;
    private String downloadUserName;
    private String downloadPassword;
    private Integer notificationDate;
    private String rapidProUrl;
    private String rapidProAuthorisationUrl;

    public String getOdkDataDownloadUrl() {
        return odkDataDownloadUrl;
    }

    public void setOdkDataDownloadUrl(String odkDataDownloadUrl) {
        this.odkDataDownloadUrl = odkDataDownloadUrl;
    }

    public String getDownloadUserName() {
        return downloadUserName;
    }

    public void setDownloadUserName(String downloadUserName) {
        this.downloadUserName = downloadUserName;
    }

    public String getDownloadPassword() {
        return downloadPassword;
    }

    public void setDownloadPassword(String downloadPassword) {
        this.downloadPassword = downloadPassword;
    }

    public Integer getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(Integer notificationDate) {
        this.notificationDate = notificationDate;
    }

    public String getRapidProUrl() {
        return rapidProUrl;
    }

    public void setRapidProUrl(String rapidProUrl) {
        this.rapidProUrl = rapidProUrl;
    }

    public String getRapidProAuthorisationUrl() {
        return rapidProAuthorisationUrl;
    }

    public void setRapidProAuthorisationUrl(String rapidProAuthorisationUrl) {
        this.rapidProAuthorisationUrl = rapidProAuthorisationUrl;
    }
}