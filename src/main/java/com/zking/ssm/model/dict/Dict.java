package com.zking.ssm.model.dict;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Dict implements Serializable{
    private Integer dictId;

    private String dictType;

    private String dictItem;

    private String dictValue;

    private Integer dictIsEdittable;

    public Dict(Integer dictId, String dictType, String dictItem, String dictValue, Integer dictIsEdittable) {
        this.dictId = dictId;
        this.dictType = dictType;
        this.dictItem = dictItem;
        this.dictValue = dictValue;
        this.dictIsEdittable = dictIsEdittable;
    }

    public Dict() {
        super();
    }

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Integer getDictIsEdittable() {
        return dictIsEdittable;
    }

    public void setDictIsEdittable(Integer dictIsEdittable) {
        this.dictIsEdittable = dictIsEdittable;
    }
}