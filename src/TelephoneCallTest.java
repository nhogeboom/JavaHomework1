import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class TelephoneCallTest {

	@Test
	public void testCalculateCost_pass() {
		TelephoneCall telephoneCall = new TelephoneCall();
		double actual = telephoneCall.calculateCost(3.5,15);
		double expected = 52.5;
		assertEquals(actual, expected,0.01);
	}

}
