

import static org.junit.Assert.*;

import org.junit.Test;


public class TestLastWord {
	@Test
	public void testSeveralSpacesAtEnd() {
		LastWord lastWord = new LastWord();
		
		int result = lastWord.lengthOfLastWord("This is a test  ");
		assertEquals(result, 4);
		
		
	}

}
