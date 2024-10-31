package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer {

    // fields
    private int id;
    private static int nextId = 1;
    private String value;

    //constructors
    public Employer() {
        id = nextId;
        nextId++;
    }

    public Employer(String value) {
//        this(); calls the first constructor, it initializes the ID, doing this in any Employer object makes it a default behavior
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() { return value;
//        //*******************************
//        if (value == null) {
//            return "Data not available";
//        }
//        return value;
//
//        //    *******************************
//        //    if value is null, return Data not available, else return value
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

}
