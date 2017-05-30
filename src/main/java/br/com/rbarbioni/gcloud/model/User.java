package br.com.rbarbioni.gcloud.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by renan on 27/05/17.
 */

public class User {

    private Long id;

    private String name;

    private String email;

    protected User(){}

    @JsonCreator
    public User(@JsonProperty String name, @JsonProperty String email) {
        this();
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
