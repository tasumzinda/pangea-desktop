/*
 * Copyright 2018 tasu.
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
package com.itech.pangea.business.util.dto;

import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.itech.pangea.business.domain.util.CallOutcome;

/**
 *
 * @author Tasu Muzinda
 */
public class CallDTO implements Serializable {

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateCalled;
    private CallOutcome callOutcome;
    private Long id;

    public Date getDateCalled() {
        return dateCalled;
    }

    public void setDateCalled(Date dateCalled) {
        this.dateCalled = dateCalled;
    }

    public CallOutcome getCallOutcome() {
        return callOutcome;
    }

    public void setCallOutcome(CallOutcome callOutcome) {
        this.callOutcome = callOutcome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

    public CallDTO getInstance(CallDTO callDTO) {
        CallDTO dto = new CallDTO();
        dto.setCallOutcome(callDTO.getCallOutcome());
        dto.setDateCalled(callDTO.getDateCalled());
        dto.setId(callDTO.getId());
        return dto;
    }

}
