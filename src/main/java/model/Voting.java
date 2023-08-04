package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "votepramod")
public class Voting {
    @Id
    private String id;
    private String name;
    private String cast;

    public Voting() {
    }

    public Voting(String id, String name, String cast) {
        this.id = id;
        this.name = name;
        this.cast = cast;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
}
