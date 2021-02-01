package Lab01_Gradebook;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	// Create class objects
	GradeBook g1;
	GradeBook g2;
	GradeBook g3;

	/*
	 * Create the data sets to be used in the tests cases.
	 */
	@Before
	public void setUp() throws Exception {

		g1 = new GradeBook(5);
		g1.addScore(80);
		g1.addScore(75);

		g2 = new GradeBook(5);
		g2.addScore(64);
		g2.addScore(90);
		g2.addScore(72);

		g3 = new GradeBook(5);
		g3.addScore(82);
		g3.addScore(52);
		g3.addScore(92);
		g3.addScore(72);

	}

	/*
	 * After the tests run, all the data will be expunged so new data can be used
	 * from scratch.
	 */
	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
		g3 = null;
	}

	/*
	 * Test will determine if the sum of all the values are equal to the function
	 * that should calculate the sum.
	 */
	@Test
	public void testSum() {
		assertEquals(155, g1.sum(), .0001);
		assertEquals(226, g2.sum(), .0001);
		assertEquals(298, g3.sum(), .0001);
	}

	/*
	 * Test will determine if the lowest value in the data set of each object is
	 * correctly determined by the function.
	 */
	@Test
	public void testMinimum() {
		assertEquals(75, g1.minimum(), .001);
		assertEquals(64, g2.minimum(), .001);
		assertEquals(52, g3.minimum(), .001);
	}

	/*
	 * Test will determine if the toString function correctly displays all the
	 * information in the data set.
	 */
	@Test
	public void addScoreTest() {
		assertEquals("80.0 75.0 ", g1.toString());
		assertEquals("64.0 90.0 72.0 ", g2.toString());
		assertEquals("82.0 52.0 92.0 72.0 ", g3.toString());
	}

	/*
	 * Test will determine if the final grade is correctly evaluated after meeting
	 * the criteria of dropping the lowest score in each data set.
	 */
	@Test
	public void finalScoreTest() {
		assertEquals(80, g1.finalScore(), .001);
		assertEquals(162, g2.finalScore(), .001);
		assertEquals(246, g3.finalScore(), .001);
	}
	/**
	 * void test() { fail("Not yet implemented"); }
	 **/

}
