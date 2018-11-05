package com.modds.didadida.entity;

import javax.persistence.Entity;

@Entity
public class IndustryLable extends BaseEntity{
    private String lable;

    public String getLable() {
        return lable;
    }

    public IndustryLable setLable(String lable) {
        this.lable = lable;
        return this;
    }
}
