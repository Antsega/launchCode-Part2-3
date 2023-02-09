package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.Objects;

abstract public class JobField {
    private final int id;
    private String value;
    private static int nextId;

    public JobField() {
        id=nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = (value.equals("") || value.equals(" ") || value.equals(null) ? "Data not available " : value);
    }

    @Override
    public String toString() {
        return this.value;
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
        return Objects.hash(id);
    }

    public int getId() {
        return this.id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }
}
