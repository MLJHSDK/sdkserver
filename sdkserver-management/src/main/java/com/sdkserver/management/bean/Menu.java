package com.sdkserver.management.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by management on 2017/12/28.
 */
public class Menu implements Serializable {
    @ApiModelProperty(value = "专家姓名_中文", example = "专家姓名-中文", required = false, dataType = "Integer")
    private Long id;

    @ApiModelProperty(value = "专家姓名_中文", example = "专家姓名-中文", required = false, dataType = "String")
    private String url;

    @ApiModelProperty(value = "专家姓名_中文", example = "专家姓名-中文", required = false, dataType = "String")
    private String path;

    @ApiModelProperty(value = "专家姓名_中文", example = "专家姓名-中文", required = false, dataType = "Object")
    private Object component;

    @ApiModelProperty(value = "专家姓名_中文", example = "专家姓名-中文", required = false, dataType = "String")
    private String name;

    @ApiModelProperty(value = "专家姓名_中文", example = "专家姓名-中文", required = false, dataType = "String")
    private String iconCls;

    @ApiModelProperty(value = "父id", example = "专家姓名-中文", required = false, dataType = "Integer")
    private Long parentId;

    private List<Role> roles;
    private List<Menu> children;
    private MenuMeta meta;

    public MenuMeta getMeta() {
        return meta;
    }

    public void setMeta(MenuMeta meta) {
        this.meta = meta;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonIgnore
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public Object getComponent() {
        return component;
    }

    public void setComponent(Object component) {
        this.component = component;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    @JsonIgnore
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @JsonIgnore
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
