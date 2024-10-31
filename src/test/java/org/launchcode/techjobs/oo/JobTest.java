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

@Test
    public void testToStringStartsAndEndsWithNewLine() {
        String newLine = System.lineSeparator();
        Job test_job = new Job();
        assertTrue(newLine, test_job.toString().startsWith(newLine));
        assertTrue(newLine, test_job.toString().endsWith(newLine));


}

@Test
    public void testToStringContainsCorrectLabelsAndData() {
    Job newJob = new Job("Android Developer", new Employer("Meta"), new Location("Remote"), new PositionType("Quality control"), new CoreCompetency("Kotlin"));
    String newLine = System.lineSeparator();
    String expectedToStringOutput = newLine + "ID: " + newJob.getId() +
            newLine + "Name: Android Developer" +
            newLine + "Employer: Meta" +
            newLine + "Location: Remote" +
            newLine + "Position Type: Quality control" +
            newLine + "Core Competency: Kotlin" +
            newLine;
    assertEquals(expectedToStringOutput, newJob.toString());
}

@Test
    public void testToStringHandlesEmptyField() {
    Job newJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    String newLine = System.lineSeparator();
    String expectedToStringOutput =
            newLine + "ID: " + newJob.getId() +
            newLine + "Name: Data not available" +
            newLine + "Employer: Data not available" +
            newLine + "Location: Data not available" +
            newLine + "Position Type: Data not available" +
            newLine + "Core Competency: Data not available" +
            newLine;
    assertEquals(expectedToStringOutput, newJob.toString());

}

}
