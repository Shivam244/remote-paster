package com.codekarigar.remotePaster.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Bin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String binName;

    private Integer pin;

    private String binData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBinName() {
        return binName;
    }

    public void setBinName(String binName) {
        this.binName = binName;
    }

    public String getBinData() {
        return binData;
    }

    public void setBinData(String binData) {
        this.binData = binData;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }
}
