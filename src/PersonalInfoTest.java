import static org.junit.Assert.*;

import org.junit.Test;


public class PersonalInfoTest {

	@Test
	public void personalInfoTest() {
		PersonalInfo personalInfo = new PersonalInfo();
		String concatentatedString = personalInfo.concatenateString("Hello","World");
		String expected = "HelloWorld";
		assertEquals(concatentatedString, expected);
	}

}
