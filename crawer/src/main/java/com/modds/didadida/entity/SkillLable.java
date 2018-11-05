package com.modds.didadida.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SkillLable {
    @Id
    private Long id;
    private String lable;

    public Long getId() {
        return id;
    }

    public SkillLable setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLable() {
        return lable;
    }

    public SkillLable setLable(String lable) {
        this.lable = lable;
        return this;
    }
}
