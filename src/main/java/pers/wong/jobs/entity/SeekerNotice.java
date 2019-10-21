package pers.wong.jobs.entity;

import java.util.Date;

public class SeekerNotice {
    private Integer pid;

    private Integer userId;

    private Integer recruitInfoId;

    private String jobStatus;

    private String userRead;

    private String comRead;

    private String message;

    private Date updateTime;

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

    public Integer getRecruitInfoId() {
        return recruitInfoId;
    }

    public void setRecruitInfoId(Integer recruitInfoId) {
        this.recruitInfoId = recruitInfoId;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus == null ? null : jobStatus.trim();
    }

    public String getUserRead() {
        return userRead;
    }

    public void setUserRead(String userRead) {
        this.userRead = userRead == null ? null : userRead.trim();
    }

    public String getComRead() {
        return comRead;
    }

    public void setComRead(String comRead) {
        this.comRead = comRead == null ? null : comRead.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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