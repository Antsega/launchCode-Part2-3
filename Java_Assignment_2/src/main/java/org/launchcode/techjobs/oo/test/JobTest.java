package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    // initialize objects
    Employer ACME;
    Location Desert;
    PositionType qualityControl;
    CoreCompetency Persistence;
    Job job1;
    Job job2;

    @Test
    public void testSettingJobId() {
        Job job1test = new Job();
        Job job2test = new Job();
        assertNotEquals(job1test.getId(), job2test.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        // create objects to be evaluated
        Employer ACME = new Employer("ACME");
        Location Desert = new Location("Desert");
        PositionType qualityControl = new PositionType("Quality control");
        CoreCompetency Persistence = new CoreCompetency("Persistence");
        Job job1 = new Job("Product tester", new Employer(ACME.getValue()), new Location(Desert.getValue()), new PositionType(qualityControl.getValue()), new CoreCompetency(Persistence.getValue()));

        // checks type of class
        assertTrue(job1 instanceof Job);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        // checks values
        assertEquals(job1.getName(), "Product tester");
        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality() {
        // create objects to be evaluated
        Employer ACME = new Employer("ACME");
        Location Desert = new Location("Desert");
        PositionType qualityControl = new PositionType("Quality control");
        CoreCompetency Persistence = new CoreCompetency("Persistence");
        Job job1 = new Job("Product tester", new Employer(ACME.getValue()), new Location(Desert.getValue()), new PositionType(qualityControl.getValue()), new CoreCompetency(Persistence.getValue()));
        Job job2 = new Job("Product tester", new Employer(ACME.getValue()), new Location(Desert.getValue()), new PositionType(qualityControl.getValue()), new CoreCompetency(Persistence.getValue()));

        // evaluates equals
        // test passes if identical objects are not equal (id not the same)
        assertFalse(job1.equals(job2));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        // create objects to be evaluated
        Employer ACME = new Employer("ACME");
        Location Desert = new Location("Desert");
        PositionType qualityControl = new PositionType("Quality control");
        CoreCompetency Persistence = new CoreCompetency("Persistence");
        Job job1 = new Job("Product tester", new Employer(ACME.getValue()), new Location(Desert.getValue()), new PositionType(qualityControl.getValue()), new CoreCompetency(Persistence.getValue()));
        Job job2 = new Job("", new Employer(ACME.getValue()), new Location(Desert.getValue()), new PositionType(qualityControl.getValue()), new CoreCompetency(Persistence.getValue()));

        assertEquals(job1.toString(), "ID: 0 \n");
        assertEquals(job1.toStringName(), "Name: " + job1.getName() + " \n");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Employer ACME = new Employer("ACME");
        Location Desert = new Location("Desert");
        PositionType qualityControl = new PositionType("Quality control");
        CoreCompetency Persistence = new CoreCompetency("Persistence");
        Job job1 = new Job("Product tester", new Employer(ACME.getValue()), new Location(Desert.getValue()), new PositionType(qualityControl.getValue()), new CoreCompetency(Persistence.getValue()));
        Job job2 = new Job("", new Employer(ACME.getValue()), new Location(Desert.getValue()), new PositionType(qualityControl.getValue()), new CoreCompetency(Persistence.getValue()));

        assertEquals(ACME.toString(), job1.getEmployer().toString());
        assertEquals(Desert.toString(), job1.getLocation().toString());
        assertEquals(qualityControl.toString(), job1.getPositionType().toString());
        assertEquals(Persistence.toString(), job1.getCoreCompetency().toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Employer ACME = new Employer("ACME");
        Location Desert = new Location("Desert");
        PositionType qualityControl = new PositionType("Quality control");
        CoreCompetency Persistence = new CoreCompetency("Persistence");
        Job job2 = new Job("", new Employer(ACME.getValue()), new Location(Desert.getValue()), new PositionType(qualityControl.getValue()), new CoreCompetency(Persistence.getValue()));

        assertEquals(job2.toStringName(), "Name: Data not available \n");
    }
}
