package PragatiTraining.CICDDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTestCases {

	Calculator cal = new Calculator();
	@Test
	public void testDivision() {
		int actualResult = cal.division(10, 5);
		Assert.assertEquals(actualResult, 2);
	}
}
