package com.publiccms.entities.cms;

// Generated 2016-3-2 16:22:41 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.generator.annotation.GeneratorColumn;

/**
 * CmsVoteItem generated by hbm2java
 */
@Entity
@Table(name = "cms_vote_item")
public class CmsVoteItem implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "投票", condition = true)
    private int voteId;
    @GeneratorColumn(title = "标题")
    private String title;
    @GeneratorColumn(title = "描述")
    private String description;
    @GeneratorColumn(title = "分数", order = true)
    private int scores;
    @GeneratorColumn(title = "顺序", order = true)
    private int sort;

    public CmsVoteItem() {
    }

    public CmsVoteItem(int voteId, String title, int scores, int sort) {
        this.voteId = voteId;
        this.title = title;
        this.scores = scores;
        this.sort = sort;
    }

    public CmsVoteItem(int voteId, String title, String description, int scores, int sort) {
        this.voteId = voteId;
        this.title = title;
        this.description = description;
        this.scores = scores;
        this.sort = sort;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "vote_id", nullable = false)
    public int getVoteId() {
        return this.voteId;
    }

    public void setVoteId(int voteId) {
        this.voteId = voteId;
    }

    @Column(name = "title", nullable = false, length = 100)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", length = 300)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "scores", nullable = false)
    public int getScores() {
        return this.scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Column(name = "sort", nullable = false)
    public int getSort() {
        return this.sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

}
