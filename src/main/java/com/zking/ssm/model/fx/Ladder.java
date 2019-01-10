package com.zking.ssm.model.fx;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Ladder implements Serializable{
    private Integer lid;

    private String costId;

    private Integer la;

    private Float laa;

    private Integer lb;

    private Float lbb;

    private Integer lc;

    private Float lcc;

    private Integer ld;

    private Float ldd;

    private Integer le;

    private Float lee;

    public Ladder(Integer lid, String costId, Integer la, Float laa, Integer lb, Float lbb, Integer lc, Float lcc, Integer ld, Float ldd, Integer le, Float lee) {
        this.lid = lid;
        this.costId = costId;
        this.la = la;
        this.laa = laa;
        this.lb = lb;
        this.lbb = lbb;
        this.lc = lc;
        this.lcc = lcc;
        this.ld = ld;
        this.ldd = ldd;
        this.le = le;
        this.lee = lee;
    }

    public Ladder() {
        super();
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getCostId() {
        return costId;
    }

    public void setCostId(String costId) {
        this.costId = costId;
    }

    public Integer getLa() {
        return la;
    }

    public void setLa(Integer la) {
        this.la = la;
    }

    public Float getLaa() {
        return laa;
    }

    public void setLaa(Float laa) {
        this.laa = laa;
    }

    public Integer getLb() {
        return lb;
    }

    public void setLb(Integer lb) {
        this.lb = lb;
    }

    public Float getLbb() {
        return lbb;
    }

    public void setLbb(Float lbb) {
        this.lbb = lbb;
    }

    public Integer getLc() {
        return lc;
    }

    public void setLc(Integer lc) {
        this.lc = lc;
    }

    public Float getLcc() {
        return lcc;
    }

    public void setLcc(Float lcc) {
        this.lcc = lcc;
    }

    public Integer getLd() {
        return ld;
    }

    public void setLd(Integer ld) {
        this.ld = ld;
    }

    public Float getLdd() {
        return ldd;
    }

    public void setLdd(Float ldd) {
        this.ldd = ldd;
    }

    public Integer getLe() {
        return le;
    }

    public void setLe(Integer le) {
        this.le = le;
    }

    public Float getLee() {
        return lee;
    }

    public void setLee(Float lee) {
        this.lee = lee;
    }
}