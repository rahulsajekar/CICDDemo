package PragatiTraining.CICDDemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MultiplicationTestCases {
	Calculator cal = new Calculator();
	@Test
	public void testMultiplication() {
		int actualResult = cal.multiplication(10, 20);
		Assert.assertEquals(actualResult, 200);
	}
}
