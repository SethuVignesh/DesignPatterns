package com.newtra.designpatterns;

/**
 * Created by vset0001 on 6/20/2015.
 */
public class BeanFair {
    public String getRatePerKm() {
        return ratePerKm;
    }

    public String getMinKm() {
        return minKm;
    }

    public String getMinRate() {
        return minRate;
    }

    public String getCab() {
        return cab;
    }

    //    private String mLocation="";
//    private String mShift="";
//    private String mCabType="";
    private String ratePerKm="";
    private String minKm="";
    private String minRate="";
private String cab="";
    public void setCab(String cab) {
        this.cab = cab;
    }

    public void setMinRate(String minRate) {
        this.minRate = minRate;
    }

    public void setMinKm(String minKm) {
        this.minKm = minKm;
    }

    public void setRatePerKm(String ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}