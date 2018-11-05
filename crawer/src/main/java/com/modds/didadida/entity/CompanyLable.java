package com.modds.didadida.entity;

import javax.persistence.Entity;

@Entity
public class CompanyLable extends BaseEntity{

    private String lable;

    public String getLable() {
        return lable;
    }

    public CompanyLable setLable(String lable) {
        this.lable = lable;
        return this;
    }
}
