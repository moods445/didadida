package com.modds.didadida.entity;

import javax.persistence.Entity;

@Entity
public class PositionLable extends BaseEntity {

    private String lable;

    public String getLable() {
        return lable;
    }

    public PositionLable setLable(String lable) {
        this.lable = lable;
        return this;
    }
}
