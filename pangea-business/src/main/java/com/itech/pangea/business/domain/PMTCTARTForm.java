package com.itech.pangea.business.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by tdhla on 10/25/2016.
 */
@Entity
public class PMTCTARTForm extends BaseEntity {

    @ManyToOne
    private Facility facility;
    @Transient
    private String datec;
    private String name;
    @ManyToOne
    private Period period;
    private Long numerator;
    private Long artnew;
    private Long artTreatment;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateSubmitted;

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String getDatec() {
        return datec;
    }

    public void setDatec(String datec) {
        this.datec = datec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Long getNumerator() {
        return numerator;
    }

    public void setNumerator(Long numerator) {
        this.numerator = numerator;
    }

    public Long getArtnew() {
        return artnew;
    }

    public void setArtnew(Long artnew) {
        this.artnew = artnew;
    }

    public Long getArtTreatment() {
        return artTreatment;
    }

    public void setArtTreatment(Long artTreatment) {
        this.artTreatment = artTreatment;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }
    
}