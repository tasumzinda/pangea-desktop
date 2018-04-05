package com.itech.pangea.business.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * Created by tdhla on 10/25/2016.
 */
@Entity
public class PMTCTFOForm extends BaseEntity {

    @ManyToOne
    private Facility facility;
    @Transient
    private String datec;
    private String name;
    @ManyToOne
    private Period period;
    private Long numerator;
    private Long denominator;
    private Long hivInfected;
    private Long hivUnInfected;
    private Long hivUnknown;
    private Long died;
    @Temporal(TemporalType.DATE)
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

    public Long getDenominator() {
        return denominator;
    }

    public void setDenominator(Long denominator) {
        this.denominator = denominator;
    }

    public Long getHivInfected() {
        return hivInfected;
    }

    public void setHivInfected(Long hivInfected) {
        this.hivInfected = hivInfected;
    }

    public Long getHivUnInfected() {
        return hivUnInfected;
    }

    public void setHivUnInfected(Long hivUnInfected) {
        this.hivUnInfected = hivUnInfected;
    }

    public Long getHivUnknown() {
        return hivUnknown;
    }

    public void setHivUnknown(Long hivUnknown) {
        this.hivUnknown = hivUnknown;
    }

    public Long getDied() {
        return died;
    }

    public void setDied(Long died) {
        this.died = died;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }
    
}