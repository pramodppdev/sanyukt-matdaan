package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "voting_citizens")
public class Citizen {

    @Id
    private long aadhaar;
    private String name;
    private long mobile;
    private String voterId;
    private String username;
    private String password;

    public Citizen() {
    }

    public Citizen(long aadhaar, String name, long mobile, String voterId, String username, String password) {
        this.aadhaar = aadhaar;
        this.name = name;
        this.mobile = mobile;
        this.voterId = voterId;
        this.username = username;
        this.password = password;
    }

    public long getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
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
}
