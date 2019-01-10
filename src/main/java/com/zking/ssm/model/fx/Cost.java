package com.zking.ssm.model.fx;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Cost extends Ladder implements Serializable{
    private String costId;

    private String costName;

    private String costAllow;

    private String costStair;

    private Integer costPeriod;

    private Integer costFate;

    private String costPrint;

    private String costToll;

    private Float costMoney;

    private String costItem;

    private Float costRate;

    private Integer costExceed;

    private String costWay;

    private Integer zssyl;

    public Cost(String costId, String costName, String costAllow, String costStair, Integer costPeriod, Integer costFate, String costPrint, String costToll, Float costMoney, String costItem, Float costRate, Integer costExceed, String costWay) {
        this.costId = costId;
        this.costName = costName;
        this.costAllow = costAllow;
        this.costStair = costStair;
        this.costPeriod = costPeriod;
        this.costFate = costFate;
        this.costPrint = costPrint;
        this.costToll = costToll;
        this.costMoney = costMoney;
        this.costItem = costItem;
        this.costRate = costRate;
        this.costExceed = costExceed;
        this.costWay = costWay;
    }

    public Cost() {
        super();
    }

    public String getCostId() {
        return costId;
    }

    public void setCostId(String costId) {
        this.costId = costId;
    }

    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    public String getCostAllow() {
        return costAllow;
    }

    public void setCostAllow(String costAllow) {
        this.costAllow = costAllow;
    }

    public String getCostStair() {
        return costStair;
    }

    public void setCostStair(String costStair) {
        this.costStair = costStair;
    }

    public Integer getCostPeriod() {
        return costPeriod;
    }

    public void setCostPeriod(Integer costPeriod) {
        this.costPeriod = costPeriod;
    }

    public Integer getCostFate() {
        return costFate;
    }

    public void setCostFate(Integer costFate) {
        this.costFate = costFate;
    }

    public String getCostPrint() {
        return costPrint;
    }

    public void setCostPrint(String costPrint) {
        this.costPrint = costPrint;
    }

    public String getCostToll() {
        return costToll;
    }

    public void setCostToll(String costToll) {
        this.costToll = costToll;
    }

    public Float getCostMoney() {
        return costMoney;
    }

    public void setCostMoney(Float costMoney) {
        this.costMoney = costMoney;
    }

    public String getCostItem() {
        return costItem;
    }

    public void setCostItem(String costItem) {
        this.costItem = costItem;
    }

    public Float getCostRate() {
        return costRate;
    }

    public void setCostRate(Float costRate) {
        this.costRate = costRate;
    }

    public Integer getCostExceed() {
        return costExceed;
    }

    public void setCostExceed(Integer costExceed) {
        this.costExceed = costExceed;
    }

    public String getCostWay() {
        return costWay;
    }

    public void setCostWay(String costWay) {
        this.costWay = costWay;
    }

    public Integer getZssyl() {
        return zssyl;
    }

    public void setZssyl(Integer zssyl) {
        this.zssyl = zssyl;
    }
}