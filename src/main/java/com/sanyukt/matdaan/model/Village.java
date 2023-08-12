package com.sanyukt.matdaan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "village")

public class Village {
    @Id
    private String village_name;
    private String taluk;
    private String ward_no;
    private String pincode;

    public Village(String village_name, String taluk, String ward_no, String pincode) {
        this.village_name = village_name;
        this.taluk = taluk;
        this.ward_no = ward_no;
        this.pincode = pincode;
    }

    public Village() {
    }

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    public String getTaluk() {
        return taluk;
    }

    public void setTaluk(String taluk) {
        this.taluk = taluk;
    }

    public String getWard_no() {
        return ward_no;
    }

    public void setWard_no(String ward_no) {
        this.ward_no = ward_no;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
