package com.zxyh.mgt.jpa.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by wjian17 on 2019/8/30.
 */
public class EapEntryCtrlPojoPK implements Serializable {
    private String ectAppname;
    private String ectUserid;

    @Column(name = "ECT_APPNAME", nullable = false, length = 20)
    @Id
    public String getEctAppname() {
        return ectAppname;
    }

    public void setEctAppname(String ectAppname) {
        this.ectAppname = ectAppname;
    }

    @Column(name = "ECT_USERID", nullable = false, length = 36)
    @Id
    public String getEctUserid() {
        return ectUserid;
    }

    public void setEctUserid(String ectUserid) {
        this.ectUserid = ectUserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EapEntryCtrlPojoPK that = (EapEntryCtrlPojoPK) o;

        if (ectAppname != null ? !ectAppname.equals(that.ectAppname) : that.ectAppname != null) return false;
        if (ectUserid != null ? !ectUserid.equals(that.ectUserid) : that.ectUserid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ectAppname != null ? ectAppname.hashCode() : 0;
        result = 31 * result + (ectUserid != null ? ectUserid.hashCode() : 0);
        return result;
    }
}
