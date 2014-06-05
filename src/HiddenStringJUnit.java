import static org.junit.Assert.*;

import org.junit.Test;


public class HiddenStringJUnit {

	@Test
	public void testMultiply() {

		 // MyClass is tested
		 HiddenString tester = new HiddenString("Hi There!");
		   
		 // 
	  assertEquals("-- -----! is expected", "-- -----!", tester.getS());
	  assertEquals("'2' is expected output", 2, tester.show("h"));
	  assertEquals("'0' is expected output", 0, tester.show("d"));
	  assertEquals("false is expected", false, tester.allFound());
	  assertEquals("h- -h---! is expected", "h- -h---!", tester.getS());
	  assertEquals("Hi There! is expected", "Hi There!", tester.getHiddenString());
	  tester.show("t"); tester.show("e");
	  assertEquals("h- the-e! is exptected", "h- the-e!", tester.getS());
	  tester.show("i");
	  assertEquals("1 is expected", 1, tester.show("r"));
	  assertEquals("true is the expected output", true, tester.allFound());
	  assertEquals("hi there! is expected output", "hi there!", tester.getS());

	
	} 
}


