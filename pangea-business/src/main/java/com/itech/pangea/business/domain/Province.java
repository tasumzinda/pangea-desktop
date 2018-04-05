package com.itech.pangea.business.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author Judge Muzinda
 */
@Entity
@Table(name = "province")
public class Province extends BaseName {

    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "province")
    @JsonIgnore
    private Set<District> districts = new HashSet<>();
    @Transient
    private Long code;

    public Set<District> getDistricts() {
        return districts;
    }

    public void setDistricts(Set<District> districts) {
        this.districts = districts;
    }
    
    public Long getCode(){
        return super.getId();
    }
}