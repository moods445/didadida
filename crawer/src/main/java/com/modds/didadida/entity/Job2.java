package com.modds.didadida.entity;

public class Job2 {
    private String tile;
    private String job_duties;
    private String capacityRequirements;
    private String skillRequirements;
    private String jobAddress;
    private String jobPublish;

    private String minMonthlySalary;
    private String maxMonthlySalary;
    /**
     * 地区
     * 北京 上海
     */
    private String city;
    private String minExperience;
    private String maxExperience;
    private String minimumEducation;
    /**
     * 工作性质
     * 兼职 全职
     */
    private String natureOfWork;

    public String getTile() {
        return tile;
    }

    public Job2 setTile(String tile) {
        this.tile = tile;
        return this;
    }

    public String getJob_duties() {
        return job_duties;
    }

    public Job2 setJob_duties(String job_duties) {
        this.job_duties = job_duties;
        return this;
    }

    public String getCapacityRequirements() {
        return capacityRequirements;
    }

    public Job2 setCapacityRequirements(String capacityRequirements) {
        this.capacityRequirements = capacityRequirements;
        return this;
    }

    public String getSkillRequirements() {
        return skillRequirements;
    }

    public Job2 setSkillRequirements(String skillRequirements) {
        this.skillRequirements = skillRequirements;
        return this;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public Job2 setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
        return this;
    }

    public String getJobPublish() {
        return jobPublish;
    }

    public Job2 setJobPublish(String jobPublish) {
        this.jobPublish = jobPublish;
        return this;
    }
}
