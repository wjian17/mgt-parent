package com.zxyh.mgt.jpa.pojo;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by wjian17 on 2019/8/30.
 */

@Entity
@Table(name = "A_TEST", schema = "ZXYH")
public class ATestPojo {

    private String errtype;
    private String checkdate;
    private String trandate;
    private String trantime;
    private String devid;
    private String channelid;
    private String busstype;
    private String datasource;
    private String batchno;
    private String refno;
    private String devstan;
    private String srvstan;
    private String serseqno;
    private String trancode;
    private String settledate;
    private String settletime;
    private String frontdate;
    private String fronttime;
    private String accdate;
    private String isscode;
    private String acqcode;
    private String cardno;
    private String cardno2;
    private BigDecimal tranamt;
    private BigDecimal stlamt;
    private BigDecimal replaceamt;
    private BigDecimal oritranamt;
    private BigDecimal tranfee;
    private BigDecimal getfee;
    private BigDecimal takefee;
    private BigDecimal otherfee;
    private BigDecimal receiveamt;
    private BigDecimal payamt;
    private String issuebrc;
    private String issuebrc2;
    private String brc;
    private String acctorient;
    private String matchmode;
    private String validf;
    private String trancode1;

    @Id
    @Basic
    @Column(name = "ERRTYPE", nullable = true, length = 32)
    public String getErrtype() {
        return errtype;
    }

    public void setErrtype(String errtype) {
        this.errtype = errtype;
    }

    @Basic
    @Column(name = "CHECKDATE", nullable = true, length = 32)
    public String getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    @Basic
    @Column(name = "TRANDATE", nullable = true, length = 32)
    public String getTrandate() {
        return trandate;
    }

    public void setTrandate(String trandate) {
        this.trandate = trandate;
    }

    @Basic
    @Column(name = "TRANTIME", nullable = true, length = 32)
    public String getTrantime() {
        return trantime;
    }

    public void setTrantime(String trantime) {
        this.trantime = trantime;
    }

    @Basic
    @Column(name = "DEVID", nullable = true, length = 32)
    public String getDevid() {
        return devid;
    }

    public void setDevid(String devid) {
        this.devid = devid;
    }

    @Basic
    @Column(name = "CHANNELID", nullable = true, length = 32)
    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    @Basic
    @Column(name = "BUSSTYPE", nullable = true, length = 32)
    public String getBusstype() {
        return busstype;
    }

    public void setBusstype(String busstype) {
        this.busstype = busstype;
    }

    @Basic
    @Column(name = "DATASOURCE", nullable = true, length = 32)
    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    @Basic
    @Column(name = "BATCHNO", nullable = true, length = 32)
    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    @Basic
    @Column(name = "REFNO", nullable = true, length = 32)
    public String getRefno() {
        return refno;
    }

    public void setRefno(String refno) {
        this.refno = refno;
    }

    @Basic
    @Column(name = "DEVSTAN", nullable = true, length = 32)
    public String getDevstan() {
        return devstan;
    }

    public void setDevstan(String devstan) {
        this.devstan = devstan;
    }

    @Basic
    @Column(name = "SRVSTAN", nullable = true, length = 32)
    public String getSrvstan() {
        return srvstan;
    }

    public void setSrvstan(String srvstan) {
        this.srvstan = srvstan;
    }

    @Basic
    @Column(name = "SERSEQNO", nullable = true, length = 32)
    public String getSerseqno() {
        return serseqno;
    }

    public void setSerseqno(String serseqno) {
        this.serseqno = serseqno;
    }

    @Basic
    @Column(name = "TRANCODE", nullable = true, length = 32)
    public String getTrancode() {
        return trancode;
    }

    public void setTrancode(String trancode) {
        this.trancode = trancode;
    }

    @Basic
    @Column(name = "SETTLEDATE", nullable = true, length = 32)
    public String getSettledate() {
        return settledate;
    }

    public void setSettledate(String settledate) {
        this.settledate = settledate;
    }

    @Basic
    @Column(name = "SETTLETIME", nullable = true, length = 32)
    public String getSettletime() {
        return settletime;
    }

    public void setSettletime(String settletime) {
        this.settletime = settletime;
    }

    @Basic
    @Column(name = "FRONTDATE", nullable = true, length = 32)
    public String getFrontdate() {
        return frontdate;
    }

    public void setFrontdate(String frontdate) {
        this.frontdate = frontdate;
    }

    @Basic
    @Column(name = "FRONTTIME", nullable = true, length = 32)
    public String getFronttime() {
        return fronttime;
    }

    public void setFronttime(String fronttime) {
        this.fronttime = fronttime;
    }

    @Basic
    @Column(name = "ACCDATE", nullable = true, length = 32)
    public String getAccdate() {
        return accdate;
    }

    public void setAccdate(String accdate) {
        this.accdate = accdate;
    }

    @Basic
    @Column(name = "ISSCODE", nullable = true, length = 32)
    public String getIsscode() {
        return isscode;
    }

    public void setIsscode(String isscode) {
        this.isscode = isscode;
    }

    @Basic
    @Column(name = "ACQCODE", nullable = true, length = 32)
    public String getAcqcode() {
        return acqcode;
    }

    public void setAcqcode(String acqcode) {
        this.acqcode = acqcode;
    }

    @Basic
    @Column(name = "CARDNO", nullable = true, length = 32)
    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    @Basic
    @Column(name = "CARDNO2", nullable = true, length = 32)
    public String getCardno2() {
        return cardno2;
    }

    public void setCardno2(String cardno2) {
        this.cardno2 = cardno2;
    }

    @Basic
    @Column(name = "TRANAMT", nullable = true, precision = 2)
    public BigDecimal getTranamt() {
        return tranamt;
    }

    public void setTranamt(BigDecimal tranamt) {
        this.tranamt = tranamt;
    }

    @Basic
    @Column(name = "STLAMT", nullable = true, precision = 2)
    public BigDecimal getStlamt() {
        return stlamt;
    }

    public void setStlamt(BigDecimal stlamt) {
        this.stlamt = stlamt;
    }

    @Basic
    @Column(name = "REPLACEAMT", nullable = true, precision = 2)
    public BigDecimal getReplaceamt() {
        return replaceamt;
    }

    public void setReplaceamt(BigDecimal replaceamt) {
        this.replaceamt = replaceamt;
    }

    @Basic
    @Column(name = "ORITRANAMT", nullable = true, precision = 2)
    public BigDecimal getOritranamt() {
        return oritranamt;
    }

    public void setOritranamt(BigDecimal oritranamt) {
        this.oritranamt = oritranamt;
    }

    @Basic
    @Column(name = "TRANFEE", nullable = true, precision = 2)
    public BigDecimal getTranfee() {
        return tranfee;
    }

    public void setTranfee(BigDecimal tranfee) {
        this.tranfee = tranfee;
    }

    @Basic
    @Column(name = "GETFEE", nullable = true, precision = 2)
    public BigDecimal getGetfee() {
        return getfee;
    }

    public void setGetfee(BigDecimal getfee) {
        this.getfee = getfee;
    }

    @Basic
    @Column(name = "TAKEFEE", nullable = true, precision = 2)
    public BigDecimal getTakefee() {
        return takefee;
    }

    public void setTakefee(BigDecimal takefee) {
        this.takefee = takefee;
    }

    @Basic
    @Column(name = "OTHERFEE", nullable = true, precision = 2)
    public BigDecimal getOtherfee() {
        return otherfee;
    }

    public void setOtherfee(BigDecimal otherfee) {
        this.otherfee = otherfee;
    }

    @Basic
    @Column(name = "RECEIVEAMT", nullable = true, precision = 2)
    public BigDecimal getReceiveamt() {
        return receiveamt;
    }

    public void setReceiveamt(BigDecimal receiveamt) {
        this.receiveamt = receiveamt;
    }

    @Basic
    @Column(name = "PAYAMT", nullable = true, precision = 2)
    public BigDecimal getPayamt() {
        return payamt;
    }

    public void setPayamt(BigDecimal payamt) {
        this.payamt = payamt;
    }

    @Basic
    @Column(name = "ISSUEBRC", nullable = true, length = 32)
    public String getIssuebrc() {
        return issuebrc;
    }

    public void setIssuebrc(String issuebrc) {
        this.issuebrc = issuebrc;
    }

    @Basic
    @Column(name = "ISSUEBRC2", nullable = true, length = 32)
    public String getIssuebrc2() {
        return issuebrc2;
    }

    public void setIssuebrc2(String issuebrc2) {
        this.issuebrc2 = issuebrc2;
    }

    @Basic
    @Column(name = "BRC", nullable = true, length = 32)
    public String getBrc() {
        return brc;
    }

    public void setBrc(String brc) {
        this.brc = brc;
    }

    @Basic
    @Column(name = "ACCTORIENT", nullable = true, length = 32)
    public String getAcctorient() {
        return acctorient;
    }

    public void setAcctorient(String acctorient) {
        this.acctorient = acctorient;
    }

    @Basic
    @Column(name = "MATCHMODE", nullable = true, length = 32)
    public String getMatchmode() {
        return matchmode;
    }

    public void setMatchmode(String matchmode) {
        this.matchmode = matchmode;
    }

    @Basic
    @Column(name = "VALIDF", nullable = true, length = 32)
    public String getValidf() {
        return validf;
    }

    public void setValidf(String validf) {
        this.validf = validf;
    }

    @Basic
    @Column(name = "TRANCODE1", nullable = true, length = 32)
    public String getTrancode1() {
        return trancode1;
    }

    public void setTrancode1(String trancode1) {
        this.trancode1 = trancode1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ATestPojo aTestPojo = (ATestPojo) o;

        if (errtype != null ? !errtype.equals(aTestPojo.errtype) : aTestPojo.errtype != null) return false;
        if (checkdate != null ? !checkdate.equals(aTestPojo.checkdate) : aTestPojo.checkdate != null) return false;
        if (trandate != null ? !trandate.equals(aTestPojo.trandate) : aTestPojo.trandate != null) return false;
        if (trantime != null ? !trantime.equals(aTestPojo.trantime) : aTestPojo.trantime != null) return false;
        if (devid != null ? !devid.equals(aTestPojo.devid) : aTestPojo.devid != null) return false;
        if (channelid != null ? !channelid.equals(aTestPojo.channelid) : aTestPojo.channelid != null) return false;
        if (busstype != null ? !busstype.equals(aTestPojo.busstype) : aTestPojo.busstype != null) return false;
        if (datasource != null ? !datasource.equals(aTestPojo.datasource) : aTestPojo.datasource != null) return false;
        if (batchno != null ? !batchno.equals(aTestPojo.batchno) : aTestPojo.batchno != null) return false;
        if (refno != null ? !refno.equals(aTestPojo.refno) : aTestPojo.refno != null) return false;
        if (devstan != null ? !devstan.equals(aTestPojo.devstan) : aTestPojo.devstan != null) return false;
        if (srvstan != null ? !srvstan.equals(aTestPojo.srvstan) : aTestPojo.srvstan != null) return false;
        if (serseqno != null ? !serseqno.equals(aTestPojo.serseqno) : aTestPojo.serseqno != null) return false;
        if (trancode != null ? !trancode.equals(aTestPojo.trancode) : aTestPojo.trancode != null) return false;
        if (settledate != null ? !settledate.equals(aTestPojo.settledate) : aTestPojo.settledate != null) return false;
        if (settletime != null ? !settletime.equals(aTestPojo.settletime) : aTestPojo.settletime != null) return false;
        if (frontdate != null ? !frontdate.equals(aTestPojo.frontdate) : aTestPojo.frontdate != null) return false;
        if (fronttime != null ? !fronttime.equals(aTestPojo.fronttime) : aTestPojo.fronttime != null) return false;
        if (accdate != null ? !accdate.equals(aTestPojo.accdate) : aTestPojo.accdate != null) return false;
        if (isscode != null ? !isscode.equals(aTestPojo.isscode) : aTestPojo.isscode != null) return false;
        if (acqcode != null ? !acqcode.equals(aTestPojo.acqcode) : aTestPojo.acqcode != null) return false;
        if (cardno != null ? !cardno.equals(aTestPojo.cardno) : aTestPojo.cardno != null) return false;
        if (cardno2 != null ? !cardno2.equals(aTestPojo.cardno2) : aTestPojo.cardno2 != null) return false;
        if (tranamt != null ? !tranamt.equals(aTestPojo.tranamt) : aTestPojo.tranamt != null) return false;
        if (stlamt != null ? !stlamt.equals(aTestPojo.stlamt) : aTestPojo.stlamt != null) return false;
        if (replaceamt != null ? !replaceamt.equals(aTestPojo.replaceamt) : aTestPojo.replaceamt != null) return false;
        if (oritranamt != null ? !oritranamt.equals(aTestPojo.oritranamt) : aTestPojo.oritranamt != null) return false;
        if (tranfee != null ? !tranfee.equals(aTestPojo.tranfee) : aTestPojo.tranfee != null) return false;
        if (getfee != null ? !getfee.equals(aTestPojo.getfee) : aTestPojo.getfee != null) return false;
        if (takefee != null ? !takefee.equals(aTestPojo.takefee) : aTestPojo.takefee != null) return false;
        if (otherfee != null ? !otherfee.equals(aTestPojo.otherfee) : aTestPojo.otherfee != null) return false;
        if (receiveamt != null ? !receiveamt.equals(aTestPojo.receiveamt) : aTestPojo.receiveamt != null) return false;
        if (payamt != null ? !payamt.equals(aTestPojo.payamt) : aTestPojo.payamt != null) return false;
        if (issuebrc != null ? !issuebrc.equals(aTestPojo.issuebrc) : aTestPojo.issuebrc != null) return false;
        if (issuebrc2 != null ? !issuebrc2.equals(aTestPojo.issuebrc2) : aTestPojo.issuebrc2 != null) return false;
        if (brc != null ? !brc.equals(aTestPojo.brc) : aTestPojo.brc != null) return false;
        if (acctorient != null ? !acctorient.equals(aTestPojo.acctorient) : aTestPojo.acctorient != null) return false;
        if (matchmode != null ? !matchmode.equals(aTestPojo.matchmode) : aTestPojo.matchmode != null) return false;
        if (validf != null ? !validf.equals(aTestPojo.validf) : aTestPojo.validf != null) return false;
        if (trancode1 != null ? !trancode1.equals(aTestPojo.trancode1) : aTestPojo.trancode1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = errtype != null ? errtype.hashCode() : 0;
        result = 31 * result + (checkdate != null ? checkdate.hashCode() : 0);
        result = 31 * result + (trandate != null ? trandate.hashCode() : 0);
        result = 31 * result + (trantime != null ? trantime.hashCode() : 0);
        result = 31 * result + (devid != null ? devid.hashCode() : 0);
        result = 31 * result + (channelid != null ? channelid.hashCode() : 0);
        result = 31 * result + (busstype != null ? busstype.hashCode() : 0);
        result = 31 * result + (datasource != null ? datasource.hashCode() : 0);
        result = 31 * result + (batchno != null ? batchno.hashCode() : 0);
        result = 31 * result + (refno != null ? refno.hashCode() : 0);
        result = 31 * result + (devstan != null ? devstan.hashCode() : 0);
        result = 31 * result + (srvstan != null ? srvstan.hashCode() : 0);
        result = 31 * result + (serseqno != null ? serseqno.hashCode() : 0);
        result = 31 * result + (trancode != null ? trancode.hashCode() : 0);
        result = 31 * result + (settledate != null ? settledate.hashCode() : 0);
        result = 31 * result + (settletime != null ? settletime.hashCode() : 0);
        result = 31 * result + (frontdate != null ? frontdate.hashCode() : 0);
        result = 31 * result + (fronttime != null ? fronttime.hashCode() : 0);
        result = 31 * result + (accdate != null ? accdate.hashCode() : 0);
        result = 31 * result + (isscode != null ? isscode.hashCode() : 0);
        result = 31 * result + (acqcode != null ? acqcode.hashCode() : 0);
        result = 31 * result + (cardno != null ? cardno.hashCode() : 0);
        result = 31 * result + (cardno2 != null ? cardno2.hashCode() : 0);
        result = 31 * result + (tranamt != null ? tranamt.hashCode() : 0);
        result = 31 * result + (stlamt != null ? stlamt.hashCode() : 0);
        result = 31 * result + (replaceamt != null ? replaceamt.hashCode() : 0);
        result = 31 * result + (oritranamt != null ? oritranamt.hashCode() : 0);
        result = 31 * result + (tranfee != null ? tranfee.hashCode() : 0);
        result = 31 * result + (getfee != null ? getfee.hashCode() : 0);
        result = 31 * result + (takefee != null ? takefee.hashCode() : 0);
        result = 31 * result + (otherfee != null ? otherfee.hashCode() : 0);
        result = 31 * result + (receiveamt != null ? receiveamt.hashCode() : 0);
        result = 31 * result + (payamt != null ? payamt.hashCode() : 0);
        result = 31 * result + (issuebrc != null ? issuebrc.hashCode() : 0);
        result = 31 * result + (issuebrc2 != null ? issuebrc2.hashCode() : 0);
        result = 31 * result + (brc != null ? brc.hashCode() : 0);
        result = 31 * result + (acctorient != null ? acctorient.hashCode() : 0);
        result = 31 * result + (matchmode != null ? matchmode.hashCode() : 0);
        result = 31 * result + (validf != null ? validf.hashCode() : 0);
        result = 31 * result + (trancode1 != null ? trancode1.hashCode() : 0);
        return result;
    }
}
