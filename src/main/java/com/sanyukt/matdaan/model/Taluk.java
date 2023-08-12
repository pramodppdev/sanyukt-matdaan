package com.sanyukt.matdaan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "taluk")

public class Taluk {
    @Id
    private String taluk_id;
    private String taluk_name;
    private String district;
    private String zone;

    public Taluk(String taluk_id, String taluk_name, String district, String zone) {
        this.taluk_id = taluk_id;
        this.taluk_name = taluk_name;
        this.district = district;
        this.zone = zone;
    }

    public Taluk() {
    }

    public String getTaluk_id() {
        return taluk_id;
    }

    public void setTaluk_id(String taluk_id) {
        this.taluk_id = taluk_id;
    }

    public String getTaluk_name() {
        return taluk_name;
    }

    public void setTaluk_name(String taluk_name) {
        this.taluk_name = taluk_name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
