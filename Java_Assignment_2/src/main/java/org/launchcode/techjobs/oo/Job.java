package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    public Job() {
        this.id = nextId;
        nextId++;
    }
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        // initializes vairables
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Job job = (Job) o;
//
//        if (id != job.id) return false;
//        if (!name.equals(job.name)) return false;
//        if (!employer.equals(job.employer)) return false;
//        if (!location.equals(job.location)) return false;
//        if (!positionType.equals(job.positionType)) return false;
//        return coreCompetency.equals(job.coreCompetency);
//    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public String getEmployerName() { return this.employer.toString();}

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        String[] categories = new String[]{"ID: ","Name: ", "Employer: ", "Location: ", "Position Type: ", "Core Competency: "};
        String string = "";

        for (int i = 0; i < 1; i++) {
            if (getName().equals("") || getName().equals(" ")) string += "Data not available \n";
            if (getEmployer().equals("") || getEmployer().equals(" ")) string += "Data not available \n";
            if (getEmployerName().equals("") || getEmployerName().equals(" ")) string += "Data not available \n";
            if (getName().equals("") || getName().equals(" ")) string += "Data not available \n";
            if (getLocation().equals("") || getLocation().equals(" ")) string += "Data not available \n";
        else string += categories[0] + getId() + "\n" +
                    categories[1] + getName() + "\n" +
                    getEmployer() +
                    getLocation() +
                    getPositionType() +
                    getCoreCompetency();
    }
        return string;
    }

    public String toStringName() {
        String string = "Name: ";
        if (getName().equals("") || getName().equals(" ")) string += "Data not available \n";
        else string += getName() + " \n";
        return string;
    }
}
