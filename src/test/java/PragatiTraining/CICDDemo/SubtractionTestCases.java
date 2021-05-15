package PragatiTraining.CICDDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTestCases {
	Calculator cal = new Calculator();
	@Test
	public void testSubtraction() {
		int actualResult = cal.subtraction(15, 5);
		Assert.assertEquals(actualResult,10);
	}
}
