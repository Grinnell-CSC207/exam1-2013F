import static org.junit.Assert.*;

import org.junit.Test;

public class JGSTests {

	@Test
	public void test() throws Exception {
		// Construct a VT
		VT vt = new VT();

		// Add values
		vt.set(0, "zero");
		vt.set(1, "one");
		vt.set(3, "three");
		vt.set(15, "fifteen");

		// Add things beyond current end
		vt.set(16, "sixteen");
		vt.set(17, "seventeen");
		vt.set(42, "forty-two");

		// Add things at negative indices
		try {
			vt.set(-1, "negative");
			fail("Should have caught negative index exception");
		} catch (Exception e) {
			// Successfully caught exception!
		}

		// Add things at really high indices
		try {
			vt.set(Integer.MAX_VALUE, "REALLY BIG NUMBER");
			fail("Should have caught large index exception");
		} catch (Exception e) {
			// Successfully caught exception!
		}

		// Get values
		assertEquals("zero", vt.get(0));
		assertEquals("three", vt.get(3));
		assertEquals("fifteen", vt.get(15));
		assertEquals("sixteen", vt.get(16));
		assertEquals("seventeen", vt.get(17));
		assertEquals("forty-two", vt.get(42));

		// Get nulls
		assertEquals(null, vt.get(2));
		assertEquals(null, vt.get(10));
		assertEquals(null, vt.get(18));
		assertEquals(null, vt.get(100));

		// Get at negative indices
		try {
			vt.get(-1);
			fail("Should have caught negative index exception");
		} catch (Exception e) {
			// Successfully caught exception!
		}

		// Modify values
		vt.set(0, "my hero");
		vt.set(17, "young and sweet");
		vt.set(42, "the answer");

		// Get modified values
		assertEquals("my hero", vt.get(0));
		assertEquals("young and sweet", vt.get(17));
		assertEquals("the answer", vt.get(42));
	} // test
} // JGSTests
