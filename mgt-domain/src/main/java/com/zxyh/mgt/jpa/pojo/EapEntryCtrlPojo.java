package com.zxyh.mgt.jpa.pojo;

import javax.persistence.*;

/**
 * Created by wjian17 on 2019/8/30.
 */
@Entity
@Table(name = "EAP_ENTRY_CTRL", schema = "ZXYH", catalog = "")
@IdClass(EapEntryCtrlPojoPK.class)
public class EapEntryCtrlPojo {
    private String ectAppname;
    private String ectUserid;
    private String ectLogontime;
    private String ectSessionid;
    private String ectServer;
    private String ectClient;

    @Id
    @Column(name = "ECT_APPNAME", nullable = false, length = 20)
    public String getEctAppname() {
        return ectAppname;
    }

    public void setEctAppname(String ectAppname) {
        this.ectAppname = ectAppname;
    }

    @Id
    @Column(name = "ECT_USERID", nullable = false, length = 36)
    public String getEctUserid() {
        return ectUserid;
    }

    public void setEctUserid(String ectUserid) {
        this.ectUserid = ectUserid;
    }

    @Basic
    @Column(name = "ECT_LOGONTIME", nullable = false, length = 14)
    public String getEctLogontime() {
        return ectLogontime;
    }

    public void setEctLogontime(String ectLogontime) {
        this.ectLogontime = ectLogontime;
    }

    @Basic
    @Column(name = "ECT_SESSIONID", nullable = false, length = 100)
    public String getEctSessionid() {
        return ectSessionid;
    }

    public void setEctSessionid(String ectSessionid) {
        this.ectSessionid = ectSessionid;
    }

    @Basic
    @Column(name = "ECT_SERVER", nullable = false, length = 30)
    public String getEctServer() {
        return ectServer;
    }

    public void setEctServer(String ectServer) {
        this.ectServer = ectServer;
    }

    @Basic
    @Column(name = "ECT_CLIENT", nullable = false, length = 50)
    public String getEctClient() {
        return ectClient;
    }

    public void setEctClient(String ectClient) {
        this.ectClient = ectClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EapEntryCtrlPojo that = (EapEntryCtrlPojo) o;

        if (ectAppname != null ? !ectAppname.equals(that.ectAppname) : that.ectAppname != null) return false;
        if (ectUserid != null ? !ectUserid.equals(that.ectUserid) : that.ectUserid != null) return false;
        if (ectLogontime != null ? !ectLogontime.equals(that.ectLogontime) : that.ectLogontime != null) return false;
        if (ectSessionid != null ? !ectSessionid.equals(that.ectSessionid) : that.ectSessionid != null) return false;
        if (ectServer != null ? !ectServer.equals(that.ectServer) : that.ectServer != null) return false;
        if (ectClient != null ? !ectClient.equals(that.ectClient) : that.ectClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ectAppname != null ? ectAppname.hashCode() : 0;
        result = 31 * result + (ectUserid != null ? ectUserid.hashCode() : 0);
        result = 31 * result + (ectLogontime != null ? ectLogontime.hashCode() : 0);
        result = 31 * result + (ectSessionid != null ? ectSessionid.hashCode() : 0);
        result = 31 * result + (ectServer != null ? ectServer.hashCode() : 0);
        result = 31 * result + (ectClient != null ? ectClient.hashCode() : 0);
        return result;
    }
}
