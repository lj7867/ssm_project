package com.zking.ssm.model.module;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class Module implements Serializable{
    private String id;

    private String pid;

    private String icon;

    private String title;

    @JsonProperty("href")
    private String url;

    private String mType;

    private Integer tip;

    public Module(String id, String pid, String icon, String title, String url, String mType, Integer tip) {
        this.id = id;
        this.pid = pid;
        this.icon = icon;
        this.title = title;
        this.url = url;
        this.mType = mType;
        this.tip = tip;
    }

    public Module() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public Integer getTip() {
        return tip;
    }

    public void setTip(Integer tip) {
        this.tip = tip;
    }
}