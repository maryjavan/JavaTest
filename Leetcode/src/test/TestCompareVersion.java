import static org.junit.Assert.*;

import org.junit.Test;


public class TestCompareVersion {
	@Test
	public void testCompareVersion() {
		SomeClass someClass = new SomeClass();
		
		assertEquals(1,someClass.compareVersion("12.123", "1.12"));
				
		
	}

}
