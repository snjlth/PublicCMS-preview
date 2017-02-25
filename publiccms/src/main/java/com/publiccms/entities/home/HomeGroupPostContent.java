package com.publiccms.entities.home;
// Generated 2016-11-12 18:33:49 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.generator.annotation.GeneratorColumn;

/**
 * HomeGroupPostContent generated by hbm2java
 */
@Entity
@Table(name = "home_group_post_content")
public class HomeGroupPostContent implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "帖子")
    private long postId;
    @GeneratorColumn(title = "内容")
    private String content;

    public HomeGroupPostContent() {
    }

    public HomeGroupPostContent(long postId) {
        this.postId = postId;
    }

    public HomeGroupPostContent(long postId, String content) {
        this.postId = postId;
        this.content = content;
    }

    @Id

    @Column(name = "post_id", unique = true, nullable = false)
    public long getPostId() {
        return this.postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Column(name = "content")
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
