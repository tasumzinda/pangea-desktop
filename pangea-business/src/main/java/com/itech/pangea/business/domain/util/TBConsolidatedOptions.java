/*
 * Copyright 2016 User.
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
package com.itech.pangea.business.domain.util;

import com.itech.pangea.business.util.StringUtils;

/**
 *
 * @author User
 */
public enum TBConsolidatedOptions {

    TX_TB_NUMERATOR_REPORT(1), TB_STAT_REPORT_KNOWN_POSITIVES(2), TB_ART_DENOMINATOR_REPORT(3), TB_ART_NUMERATOR_REPORT(4), TX_RET_FORM_NUMERATOR(6), TX_RET_FORM_DENOMINATOR(7), TX_PVLS_FORM_NUMERATOR(8), TX_PVLS_FORM_DENOMINATOR(9), TX_CURR_REPORT(10), SUPPLEMENTARY_INDICATOR(11), TB_STAT_REPORT_NEWLY_TESTED_POSITIVES(12), TB_STAT_REPORT_NEWLY_TESTED_NEGATIVE(13), /*TBSTAT_REPORT_NEW_TB_CASES(14),*/ TX_TB_DENOMINATOR_REPORT(15), HTS_TST_PITC_INTPATIENT_POSITIVE(16), HTS_TST_PITC_INTPATIENT_NEGATIVE(17), HTS_TST_TB_CLINICS_POSITIVE(18), HTS_TST_TB_CLINICS_NEGATIVE(19), HTS_TST_ANC_CLINICS_POSITIVE(20), HTS_TST_ANC_CLINICS_NEGATIVE(21), PMTCT_STAT_KNOWN_POSITIVE(22), PMTCT_STAT_NEWLY_TESTED_POSITIVE(23), PMTCT_STAT_NEW_NEGATIVES(24), PMTCT_STAT_DENOMINATOR(25), PMTCT_STAT_NUMERATOR(26), PMTCT_EID(27), TX_NEW(28), PMTCT_FO_FORM_REPORT(29), PMTCT_ART_FORM_REPORT(30), TB_STAT_REPORT_DENOMINATOR(31);

    private final Integer code;

    private TBConsolidatedOptions(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static TBConsolidatedOptions get(Integer code) {
        for (TBConsolidatedOptions item : values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        throw new IllegalArgumentException("Parameter not recognized");
    }

    public String getName() {
        return super.name();
    }
}
