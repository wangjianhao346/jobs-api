package pers.wong.jobs.entity;

import java.util.Date;

public class TalentMarket {
    private Integer pid;

    private Integer userId;

    private String ability;

    private Float wantSalaryFloor;

    private Float wantSalaryCeiling;

    private String status;

    private Date createtime;

    private String isDeleted;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability == null ? null : ability.trim();
    }

    public Float getWantSalaryFloor() {
        return wantSalaryFloor;
    }

    public void setWantSalaryFloor(Float wantSalaryFloor) {
        this.wantSalaryFloor = wantSalaryFloor;
    }

    public Float getWantSalaryCeiling() {
        return wantSalaryCeiling;
    }

    public void setWantSalaryCeiling(Float wantSalaryCeiling) {
        this.wantSalaryCeiling = wantSalaryCeiling;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }
}