package com.sanyukt.matdaan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "district")
public class District {

    @Id
    private String district_id;
    private String district_name;
    private String state;
    private String zone;

    public District(String district_id, String district_name, String state, String zone) {
        this.district_id = district_id;
        this.district_name = district_name;
        this.state = state;
        this.zone = zone;
    }

    public District() {
    }

    public String getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(String district_id) {
        this.district_id = district_id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
