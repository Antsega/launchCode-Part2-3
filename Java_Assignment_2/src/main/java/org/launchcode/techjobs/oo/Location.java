package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField{
    public Location(String aString) {
        super(aString);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        String string = "Location: ";
        if (getValue().equals("")) string += "Data not available \n";
        else string += getValue() + " \n";
        return string;
    }

}
