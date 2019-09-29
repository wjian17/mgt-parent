package com.zxyh.mgt.jpa.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by wjian17 on 2019/8/30.
 */
@Entity
@Table(name = "BP_TRAN_CONTROL", schema = "ZXYH", catalog = "")
public class BpTranControlPojo implements Serializable {
    private String bsnCode;
    private String bsnName;
    private String activitieId;
    private String operId;
    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private String runStatus;
    private String runResult;

    @Id
    @SequenceGenerator(name = "PK_SEQ_TBL", sequenceName = "SEQ_PUBLIC_SYS",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="PK_SEQ_TBL")
    @Column(name = "BSN_CODE", nullable = false, length = 20)
    public String getBsnCode() {
        return bsnCode;
    }

    public void setBsnCode(String bsnCode) {
        this.bsnCode = bsnCode;
    }

    @Basic
    @Column(name = "BSN_NAME", nullable = false, length = 200)
    public String getBsnName() {
        return bsnName;
    }

    public void setBsnName(String bsnName) {
        this.bsnName = bsnName;
    }

    @Basic
    @Column(name = "ACTIVITIE_ID", nullable = true, length = 100)
    public String getActivitieId() {
        return activitieId;
    }

    public void setActivitieId(String activitieId) {
        this.activitieId = activitieId;
    }

    @Basic
    @Column(name = "OPER_ID", nullable = true, length = 100)
    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    @Basic
    @Column(name = "START_DATE", nullable = true, length = 8)
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "START_TIME", nullable = true, length = 6)
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "END_DATE", nullable = true, length = 8)
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "END_TIME", nullable = true, length = 6)
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "RUN_STATUS", nullable = true, length = 1)
    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    @Basic
    @Column(name = "RUN_RESULT", nullable = true, length = 1)
    public String getRunResult() {
        return runResult;
    }

    public void setRunResult(String runResult) {
        this.runResult = runResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BpTranControlPojo that = (BpTranControlPojo) o;

        if (bsnCode != null ? !bsnCode.equals(that.bsnCode) : that.bsnCode != null) return false;
        if (bsnName != null ? !bsnName.equals(that.bsnName) : that.bsnName != null) return false;
        if (activitieId != null ? !activitieId.equals(that.activitieId) : that.activitieId != null) return false;
        if (operId != null ? !operId.equals(that.operId) : that.operId != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (runStatus != null ? !runStatus.equals(that.runStatus) : that.runStatus != null) return false;
        if (runResult != null ? !runResult.equals(that.runResult) : that.runResult != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bsnCode != null ? bsnCode.hashCode() : 0;
        result = 31 * result + (bsnName != null ? bsnName.hashCode() : 0);
        result = 31 * result + (activitieId != null ? activitieId.hashCode() : 0);
        result = 31 * result + (operId != null ? operId.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (runStatus != null ? runStatus.hashCode() : 0);
        result = 31 * result + (runResult != null ? runResult.hashCode() : 0);
        return result;
    }
}
