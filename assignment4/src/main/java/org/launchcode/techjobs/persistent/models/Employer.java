package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    // Ensures location is not blank
    @NotBlank
    @Size(min=3)
    private String location;

    // Constructor
    public Employer() {}

    // list cannot change
    @OneToMany(mappedBy = "employer")
    private List<Job> jobs = new ArrayList<>();

    // Get/Setters
    public String getLocation() {return this.location;}
    public void setLocation(String location) {this.location = location;}

    public List<Job> getJobs() {
        return jobs;
    }

}
