import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class FlowerBedTest {

	@Test
	public void testCalculateCircumference_pass() {
		FlowerBed flowerBed = new FlowerBed();
		double actual = flowerBed.calculateCircumference(1.0);
		double expected = 6.28;
		assertEquals(actual, expected, 0.01);
	}
	
	public void testCalculateCircumference_fail() {
		FlowerBed flowerBed = new FlowerBed();
		double actual = flowerBed.calculateCircumference(1.0);
		double expected = 6.0;
		assertThat(actual, not(equalTo(expected)));
	}

}
