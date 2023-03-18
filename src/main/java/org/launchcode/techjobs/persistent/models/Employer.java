package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Location cannot be blank.")
    @Size(max = 50, message = "Location must be less than 50 characters.")

    private String location;

    public Employer() { }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
