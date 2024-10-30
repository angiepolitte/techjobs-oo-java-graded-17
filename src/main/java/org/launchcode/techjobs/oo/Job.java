package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
//fields
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
//    constructors
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

//    public Job(String name, String employerName, String locationName, String positionTypeName, String coreCompetencyName) {
//        this(); // Calls the first constructor to initialize 'id'
//        this.name = name;
//        this.employer = new Employer(employerName); // Create new Employer object
//        this.location = new Location(locationName); // Create new Location object
//        this.positionType = new PositionType(positionTypeName); // Create new PositionType object
//        this.coreCompetency = new CoreCompetency(coreCompetencyName); // Create new CoreCompetency object
//    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
//    @Override
//    public String toString() {
//        String newLine = System.lineSeparator();
//        return "Job: " newLine + getId() +
//                newLine + getName()
//                newLine + getEmployer() +
//                newLine + getLocation() +
//                newLine + getPositionType() +
//                newLine + getCoreCompetency() +
//                newLine;
//
//    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
//    getters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

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
}
