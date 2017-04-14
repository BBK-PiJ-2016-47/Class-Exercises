package doublylinkedlist;

import static org.junit.Assert.*;

import org.junit.Test;


public class HospitalManager03Test {

	@Test
	public void addPatient_Single() {
		HospitalManager03 test = new HospitalManager03();
		Patient toby = new Patient("Toby", 39, "social anxiety");
		test.addPatient(toby);
		assertTrue(test.count == 1);
		assertEquals(test.head, toby);
	}
	
	@Test
	public void addPatient_Multiple() {
		HospitalManager03 test = new HospitalManager03();
		Patient toby = new Patient("Toby", 39, "social anxiety");
		Patient michael = new Patient("Michael", 55, "punched by employee");
        Patient pam = new Patient("Pam", 26, "alcohol-related injury at Chilis");
		test.addPatient(toby);
		test.addPatient(michael);
		test.addPatient(pam);
		assertTrue(test.count == 3);
		assertEquals(test.head, toby);
		assertEquals(test.current, pam);
	}
	
	@Test
	public void deletePatient_Single() {
		HospitalManager03 test = new HospitalManager03();
		Patient toby = new Patient("Toby", 39, "social anxiety");
		test.addPatient(toby);
		test.deletePatient("Toby");
		assertTrue(test.count == 0);
	}
	@Test
	public void deletePatient_Multiple() {
		HospitalManager03 test = new HospitalManager03();
		Patient toby = new Patient("Toby", 39, "social anxiety");
		Patient michael = new Patient("Michael", 55, "punched by employee");
        Patient pam = new Patient("Pam", 26, "alcohol-related injury at Chilis");
		test.addPatient(toby);
		test.addPatient(michael);
		test.addPatient(pam);
		test.deletePatient("Toby");		
		assertTrue(test.count == 2);
		assertEquals(test.head, michael);
		test.deletePatient("Pam");
		assertTrue(test.count == 1);
	}
	
	@Test
	public void deletePatient_None() {
		HospitalManager03 test = new HospitalManager03();
		Patient toby = new Patient("Toby", 39, "social anxiety");
		test.addPatient(toby);
		test.deletePatient("Andy");
		assertTrue(test.count == 1);
	}

}
