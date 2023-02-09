package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{
    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        String string = "Position Type: ";
        if (getValue().equals("")) string += "Data not available \n";
        else string += getValue() + " \n";
        return string;
    }
}
