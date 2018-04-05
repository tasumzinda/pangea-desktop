package com.itech.pangea.business.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author Judge Muzinda
 */
@Entity
public class District extends BaseName {

    private static final long serialVersionUID = 1L;
    @ManyToOne
    private Province province;
    @ManyToMany(mappedBy = "districts")
    @JsonIgnore
    private Set<Mentor> mentors = new HashSet<>();    
    @OneToMany(mappedBy = "district")
    @JsonIgnore
    private Set<Facility> facilitys = new HashSet<>();

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Set<Facility> getFacilitys() {
        return facilitys;
    }

    public void setFacilitys(Set<Facility> facilitys) {
        this.facilitys = facilitys;
    }

    public Set<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(Set<Mentor> mentors) {
        this.mentors = mentors;
    }

}