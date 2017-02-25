package com.publiccms.entities.cms;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.publiccms.common.spi.Static;
import com.sanluan.common.generator.annotation.GeneratorColumn;

/**
 * CmsCategory generated by hbm2java
 */
@Entity
@Table(name = "cms_category")
public class CmsCategory implements java.io.Serializable, Static {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Integer id;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @GeneratorColumn(title = "名称")
    private String name;
    @GeneratorColumn(title = "父分类", condition = true)
    private Integer parentId;
    @GeneratorColumn(title = "分类类型", condition = true)
    private Integer typeId;
    @GeneratorColumn(title = "子分类")
    private String childIds;
    @GeneratorColumn(title = "标签ID")
    private String tagTypeIds;
    @GeneratorColumn(title = "编码")
    private String code;
    @GeneratorColumn(title = "模板路径")
    private String templatePath;
    @GeneratorColumn(title = "路径")
    private String path;
    @GeneratorColumn(title = "外链")
    private boolean onlyUrl;
    @GeneratorColumn(title = "有静态化")
    private boolean hasStatic;
    @GeneratorColumn(title = "地址")
    private String url;
    @GeneratorColumn(title = "内容路径")
    private String contentPath;
    @GeneratorColumn(title = "每页数据")
    private Integer pageSize;
    @GeneratorColumn(title = "允许投稿", condition = true)
    private boolean allowContribute;
    @GeneratorColumn(title = "排序")
    private int sort;
    @GeneratorColumn(title = "是否隐藏", condition = true)
    private boolean hidden;
    @GeneratorColumn(title = "是否删除", condition = true)
    private boolean disabled;
    @GeneratorColumn(title = "内容数")
    private int contents;
    @GeneratorColumn(title = "扩展ID")
    private Integer extendId;

    public CmsCategory() {
    }

    public CmsCategory(int siteId, String name, String path, boolean onlyUrl, boolean hasStatic, 
            boolean allowContribute, int sort, boolean hidden, boolean disabled, int contents) {
        this.siteId = siteId;
        this.name = name;
        this.path = path;
        this.onlyUrl = onlyUrl;
        this.hasStatic = hasStatic;
        this.allowContribute = allowContribute;
        this.sort = sort;
        this.hidden = hidden;
        this.disabled = disabled;
        this.contents = contents;
    }

    public CmsCategory(int siteId, String name, Integer parentId, Integer typeId, String childIds, String tagTypeIds,
            String code, String templatePath, String path, boolean onlyUrl, boolean hasStatic, String url, String contentPath,
            Integer pageSize, boolean allowContribute, int sort, boolean hidden, boolean disabled, int contents, Integer extendId) {
        this.siteId = siteId;
        this.name = name;
        this.parentId = parentId;
        this.typeId = typeId;
        this.childIds = childIds;
        this.tagTypeIds = tagTypeIds;
        this.code = code;
        this.templatePath = templatePath;
        this.path = path;
        this.onlyUrl = onlyUrl;
        this.hasStatic = hasStatic;
        this.url = url;
        this.contentPath = contentPath;
        this.pageSize = pageSize;
        this.allowContribute = allowContribute;
        this.sort = sort;
        this.hidden = hidden;
        this.disabled = disabled;
        this.contents = contents;
        this.extendId = extendId;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "parent_id")
    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Column(name = "type_id")
    public Integer getTypeId() {
        return this.typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Column(name = "child_ids", length = 65535)
    public String getChildIds() {
        return this.childIds;
    }

    public void setChildIds(String childIds) {
        this.childIds = childIds;
    }

    @Column(name = "tag_type_ids", length = 65535)
    public String getTagTypeIds() {
        return this.tagTypeIds;
    }

    public void setTagTypeIds(String tagTypeIds) {
        this.tagTypeIds = tagTypeIds;
    }

    @Column(name = "code", length = 50)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "template_path")
    public String getTemplatePath() {
        return this.templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    @Column(name = "path", nullable = false, length = 2000)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column(name = "only_url", nullable = false)
    public boolean isOnlyUrl() {
        return this.onlyUrl;
    }

    public void setOnlyUrl(boolean onlyUrl) {
        this.onlyUrl = onlyUrl;
    }

    @Column(name = "has_static", nullable = false)
    public boolean isHasStatic() {
        return this.hasStatic;
    }

    public void setHasStatic(boolean hasStatic) {
        this.hasStatic = hasStatic;
    }

    @Column(name = "url", length = 2048)
    public String getUrl() {
        return this.url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "content_path", length = 500)
    public String getContentPath() {
        return this.contentPath;
    }

    public void setContentPath(String contentPath) {
        this.contentPath = contentPath;
    }

    @Column(name = "page_size")
    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Column(name = "allow_contribute", nullable = false)
    public boolean isAllowContribute() {
        return this.allowContribute;
    }

    public void setAllowContribute(boolean allowContribute) {
        this.allowContribute = allowContribute;
    }

    @Column(name = "sort", nullable = false)
    public int getSort() {
        return this.sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Column(name = "hidden", nullable = false)
    public boolean isHidden() {
        return this.hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Column(name = "contents", nullable = false)
    public int getContents() {
        return this.contents;
    }

    public void setContents(int contents) {
        this.contents = contents;
    }

    @Column(name = "extend_id")
    public Integer getExtendId() {
        return this.extendId;
    }

    public void setExtendId(Integer extendId) {
        this.extendId = extendId;
    }

}
