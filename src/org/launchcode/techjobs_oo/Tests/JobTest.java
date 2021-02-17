package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static java.awt.geom.Path2D.contains;
import static org.junit.Assert.*;
import static org.launchcode.techjobs_oo.CoreCompetency.*;

public class JobTest {
    Job testJob1;
    Job testJob2;
    Job testJob3;
    Job testJob4;

    @Before
    public void createJob() {
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void testSettingJobId() {
        assertEquals(1, testJob2.getId() - testJob1.getId(),.001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(true, testJob3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals(testJob3, testJob4);
    }

    @Test
    public void testJobsForNewLine() {
        assertEquals('\n', testJob3.toString().charAt(0));
    }

    @Test
    public void testToStringMethod() {
        assertEquals(testJob3.toString() , "\nID: " + testJob3.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n");
    }

}
