package PragatiTraining.CICDDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTestCases {

	Calculator cal = new Calculator();
	@Test
	public void testAddition() {
		int actualResult = cal.addition(5, 5);
		Assert.assertEquals(actualResult,20);
	}
}
