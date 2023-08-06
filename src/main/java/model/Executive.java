package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "voting_executive")
public class Executive {

    @Id
    private String id;
    private String username;
    private String password;
    private long mobile;
    private String face_id;
    private String bio_id;
    private String executive_name;
    private String designation;
    private String area;

    public Executive() {
    }

    public Executive(String id, String username, String password, long mobile, String face_id, String bio_id, String executive_name, String designation, String area) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.face_id = face_id;
        this.bio_id = bio_id;
        this.executive_name = executive_name;
        this.designation = designation;
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getFace_id() {
        return face_id;
    }

    public void setFace_id(String face_id) {
        this.face_id = face_id;
    }

    public String getBio_id() {
        return bio_id;
    }

    public void setBio_id(String bio_id) {
        this.bio_id = bio_id;
    }

    public String getExecutive_name() {
        return executive_name;
    }

    public void setExecutive_name(String executive_name) {
        this.executive_name = executive_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
