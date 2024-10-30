package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job1, test_job2);
    }


@Test
public void testJobConstructorSetsAllFields() {
    Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertEquals("Product tester", newJob.getName());
    assertEquals("ACME", newJob.getEmployer().getValue());
    assertEquals("Desert", newJob.getLocation().getValue());
    assertEquals("Quality control", newJob.getPositionType().getValue());
    assertEquals("Persistence", newJob.getCoreCompetency().getValue());

    assertTrue(newJob.getName() instanceof String);
    assertTrue(newJob.getEmployer() instanceof Employer);
    assertTrue((newJob.getLocation() instanceof Location));
    assertTrue(newJob.getPositionType() instanceof PositionType);
    assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);

}
@Test
    public void testJobsForEquality() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertFalse(test_job1.equals(test_job2));
    }

}
