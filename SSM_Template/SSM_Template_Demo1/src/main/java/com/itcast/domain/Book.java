package com.itcast.domain;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer bid;
    private String bname;
    private String bwriter;
    private String bprise;
    private Integer btype;
    private String brecommend;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBwriter() {
        return bwriter;
    }

    public void setBwriter(String bwriter) {
        this.bwriter = bwriter;
    }

    public String getBprise() {
        return bprise;
    }

    public void setBprise(String bprise) {
        this.bprise = bprise;
    }

    public Integer getBtype() {
        return btype;
    }

    public void setBtype(Integer btype) {
        this.btype = btype;
    }

    public String getBrecommend() {
        return brecommend;
    }

    public void setBrecommend(String brecommend) {
        this.brecommend = brecommend;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bwriter='" + bwriter + '\'' +
                ", bprise='" + bprise + '\'' +
                ", btype=" + btype +
                ", brecommend='" + brecommend + '\'' +
                '}';
    }
}
