package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

    public CoreCompetency(String value) {
        super(value);
    }

    // Custom toString
    @Override
    public String toString() {
        String string = "Core Competency: ";
        if (getValue().equals("")) string += "Data not available \n";
        else string += getValue() + " \n";
        return string;
    }


}
