package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min = 3, max = 20)
    private String location;

    public Employer() {
    }

    public @NotNull @Size(min = 3, max = 20) String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @Size(min = 3, max = 20) String location) {
        this.location = location;
    }
}
