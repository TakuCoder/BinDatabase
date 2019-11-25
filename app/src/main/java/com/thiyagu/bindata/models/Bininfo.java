package com.thiyagu.bindata.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bininfo {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("bank")
    @Expose
    private String bank;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("bin")
    @Expose
    private String bin;
    @SerializedName("vendor")
    @Expose
    private String vendor;
    @SerializedName("type")
    @Expose
    private String type;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}