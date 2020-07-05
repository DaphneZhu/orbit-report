package org.launchcode.javawebdevtechjobspersistent.models;


import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

public class Employer extends AbstractEntity {

    @NotEmpty
    @Max(120)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
