package com.modds.didadida.entity;

import javax.persistence.Entity;

/**
 * 工作信息
 */
@Entity
public class Job extends BaseEntity {

    private Long adWord;
    private Long appShow;
    private Long approve;
    private String businessZones;
    /**
     * 城市
     */
    private String city;
    private String companyFullName;
    /**
     *
     */
    private Long companyId;
//    private List<CompanyLable> companyLabelList;
    /**
     * 公司 logo
     */
    private String companyLogo;
    private String companyShortName;
    /**
     * 公司大小
     */
    private String companySize;
    private Long deliver;
    /**
     * 区
     */
    private String district;
    /**
     * 学历
     */
    private String education;
    private String jobExplain;
    /**
     * 融资情况
     */
    private String financeStage;
    private String firstType;
    private String formatCreateTime;
    private String gradeDescription;
    private String hitags;
    private String imState;
    /**
     * 所属行业
     */
    private String industryField;
    //    private List<IndustryLable> industryLables;
    private Long isSchoolJob;
    /**
     * 工作性质
     */
    private String jobNature;
    private Long lastLogin;
    private String latitude;
    private String linestaion;
    private String longitude;
    private Long pcShow;
    private String plus;
    private String positionAdvantage;
    private Long positionId;
//    private List<PositionLable> positionLables;
    /**
     * 职位名称
     */
    private String positionName;
    private String promotionScoreExplain;
    private Long publisherId;
    private Long resumeProcessDay;
    private Long resumeProcessRate;
    /**
     * 薪水
     */
    private String salary;
    private Long score;
    private String secondType;
    //    private List<SkillLable> skillLables;
    private String stationname;
    private String subwayline;
    private String thirdType;
    /**
     * 工作年限
     */
    private String workYear;


    public Long getAdWord() {
        return adWord;
    }

    public Job setAdWord(Long adWord) {
        this.adWord = adWord;
        return this;
    }

    public Long getAppShow() {
        return appShow;
    }

    public Job setAppShow(Long appShow) {
        this.appShow = appShow;
        return this;
    }

    public Long getApprove() {
        return approve;
    }

    public Job setApprove(Long approve) {
        this.approve = approve;
        return this;
    }

    public String getBusinessZones() {
        return businessZones;
    }

    public Job setBusinessZones(String businessZones) {
        this.businessZones = businessZones;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Job setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCompanyFullName() {
        return companyFullName;
    }

    public Job setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public Job setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }


    public String getCompanyLogo() {
        return companyLogo;
    }

    public Job setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
        return this;
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public Job setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
        return this;
    }

    public String getCompanySize() {
        return companySize;
    }

    public Job setCompanySize(String companySize) {
        this.companySize = companySize;
        return this;
    }


    public Long getDeliver() {
        return deliver;
    }

    public Job setDeliver(Long deliver) {
        this.deliver = deliver;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public Job setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public Job setEducation(String education) {
        this.education = education;
        return this;
    }

    public String getJobExplain() {
        return jobExplain;
    }

    public Job setJobExplain(String jobExplain) {
        this.jobExplain = jobExplain;
        return this;
    }

    public String getFinanceStage() {
        return financeStage;
    }

    public Job setFinanceStage(String financeStage) {
        this.financeStage = financeStage;
        return this;
    }

    public String getFirstType() {
        return firstType;
    }

    public Job setFirstType(String firstType) {
        this.firstType = firstType;
        return this;
    }

    public String getFormatCreateTime() {
        return formatCreateTime;
    }

    public Job setFormatCreateTime(String formatCreateTime) {
        this.formatCreateTime = formatCreateTime;
        return this;
    }

    public String getGradeDescription() {
        return gradeDescription;
    }

    public Job setGradeDescription(String gradeDescription) {
        this.gradeDescription = gradeDescription;
        return this;
    }

    public String getHitags() {
        return hitags;
    }

    public Job setHitags(String hitags) {
        this.hitags = hitags;
        return this;
    }

    public String getImState() {
        return imState;
    }

    public Job setImState(String imState) {
        this.imState = imState;
        return this;
    }

    public String getIndustryField() {
        return industryField;
    }

    public Job setIndustryField(String industryField) {
        this.industryField = industryField;
        return this;
    }


    public Long getIsSchoolJob() {
        return isSchoolJob;
    }

    public Job setIsSchoolJob(Long isSchoolJob) {
        this.isSchoolJob = isSchoolJob;
        return this;
    }

    public String getJobNature() {
        return jobNature;
    }

    public Job setJobNature(String jobNature) {
        this.jobNature = jobNature;
        return this;
    }

    public Long getLastLogin() {
        return lastLogin;
    }

    public Job setLastLogin(Long lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public Job setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLinestaion() {
        return linestaion;
    }

    public Job setLinestaion(String linestaion) {
        this.linestaion = linestaion;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public Job setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public Long getPcShow() {
        return pcShow;
    }

    public Job setPcShow(Long pcShow) {
        this.pcShow = pcShow;
        return this;
    }

    public String getPlus() {
        return plus;
    }

    public Job setPlus(String plus) {
        this.plus = plus;
        return this;
    }

    public String getPositionAdvantage() {
        return positionAdvantage;
    }

    public Job setPositionAdvantage(String positionAdvantage) {
        this.positionAdvantage = positionAdvantage;
        return this;
    }

    public Long getPositionId() {
        return positionId;
    }

    public Job setPositionId(Long positionId) {
        this.positionId = positionId;
        return this;
    }


    public String getPositionName() {
        return positionName;
    }

    public Job setPositionName(String positionName) {
        this.positionName = positionName;
        return this;
    }

    public String getPromotionScoreExplain() {
        return promotionScoreExplain;
    }

    public Job setPromotionScoreExplain(String promotionScoreExplain) {
        this.promotionScoreExplain = promotionScoreExplain;
        return this;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public Job setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    public Long getResumeProcessDay() {
        return resumeProcessDay;
    }

    public Job setResumeProcessDay(Long resumeProcessDay) {
        this.resumeProcessDay = resumeProcessDay;
        return this;
    }

    public Long getResumeProcessRate() {
        return resumeProcessRate;
    }

    public Job setResumeProcessRate(Long resumeProcessRate) {
        this.resumeProcessRate = resumeProcessRate;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public Job setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    public Long getScore() {
        return score;
    }

    public Job setScore(Long score) {
        this.score = score;
        return this;
    }

    public String getSecondType() {
        return secondType;
    }

    public Job setSecondType(String secondType) {
        this.secondType = secondType;
        return this;
    }


    public String getStationname() {
        return stationname;
    }

    public Job setStationname(String stationname) {
        this.stationname = stationname;
        return this;
    }

    public String getSubwayline() {
        return subwayline;
    }

    public Job setSubwayline(String subwayline) {
        this.subwayline = subwayline;
        return this;
    }

    public String getThirdType() {
        return thirdType;
    }

    public Job setThirdType(String thirdType) {
        this.thirdType = thirdType;
        return this;
    }

    public String getWorkYear() {
        return workYear;
    }

    public Job setWorkYear(String workYear) {
        this.workYear = workYear;
        return this;
    }
}

