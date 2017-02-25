package com.publiccms.entities.home;
// Generated 2016-11-13 14:04:11 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sanluan.common.generator.annotation.GeneratorColumn;

/**
 * HomeGroupApplyId generated by hbm2java
 */
@Embeddable
public class HomeGroupApplyId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "群组")
    private long groupId;
    @GeneratorColumn(title = "用户")
    private long userId;

    public HomeGroupApplyId() {
    }

    public HomeGroupApplyId(long groupId, long userId) {
        this.groupId = groupId;
        this.userId = userId;
    }

    @Column(name = "group_id", nullable = false)
    public long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof HomeGroupApplyId))
            return false;
        HomeGroupApplyId castOther = (HomeGroupApplyId) other;

        return (this.getGroupId() == castOther.getGroupId()) && (this.getUserId() == castOther.getUserId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getGroupId();
        result = 37 * result + (int) this.getUserId();
        return result;
    }

}
