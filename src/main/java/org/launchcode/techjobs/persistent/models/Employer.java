package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {



    @NotNull
    @Size(min = 3, max = 50, message = "Location has to be between 3 and 50 characters")
    private String location;

    public Employer(){}



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
