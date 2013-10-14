import static org.junit.Assert.*;

import org.junit.Test;


public class MirasTests {


		@Test
		public void test() throws Exception{
			VT veeTee = new VT();
			
			veeTee.set(1, new String("apple"));
			veeTee.set(3,  new String("banana"));
			
			assertEquals(new String("banana"), veeTee.get(3));
			assertEquals(new String("apple"), veeTee.get(1));
			assertEquals("unfilled before filled",
					null, veeTee.get(0));
			assertEquals("unfilled between filled",
					null, veeTee.get(2));
			assertEquals("unfilled after filled", null, veeTee.get(4));
			assertEquals("uninitialized",
					null, veeTee.get(18));
			try{
				veeTee.get(-1);
				fail("doesn't throw error for negative indexes");
			}catch(Exception e){
				
			}
		}
}
