package com.vkursinbu.vkursinbu.Pojo;

public class PojoVkursi   {

        private Integer r030;
        private String txt;
        private Double rate;
        private String cc;
        private String exchangedate;
        private int priority;

        public PojoVkursi(Integer r030, String txt, Double rate, String cc, String exchangedate) {
            this.r030 = r030;
            this.txt = txt;
            this.rate = rate;
            this.cc = cc;
            this.exchangedate = exchangedate;
        }

        public PojoVkursi() {
        }

    public Integer getR030() {
        return r030;
    }

    public void setR030(Integer r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }



}

