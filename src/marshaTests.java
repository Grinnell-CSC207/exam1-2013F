import static org.junit.Assert.*;

import org.junit.Test;

public class VTTest {

	/**
	 * Marsha's tests
	 */
	@Test
	public void test() throws Exception{
		VT newVT = new VT();
		//add values
		newVT.set(100, 100);
		//add at ridiculous index. This works on my computer, 
		//but may not work on others
		newVT.set((Integer.MAX_VALUE -1) / 32, 123456);
		
		assertEquals("reasonable index", 100, newVT.get(100));
		assertEquals("ridiculous index", 123456,
				newVT.get((Integer.MAX_VALUE -1) / 32));
		//Justus is testing for adding at MAX_VALUE
	} // test
} //VTTest
