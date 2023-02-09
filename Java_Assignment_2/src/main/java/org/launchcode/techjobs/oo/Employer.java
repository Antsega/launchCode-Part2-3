package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField{

    public Employer(String value) {
        super(value);
    }

    // Custom toString
    @Override
    public String toString() {
        String string = "Employer: ";
        if (getValue().equals("")) string += "Data not available \n";
        else string += getValue() + " \n";
        return string;
    }
}
