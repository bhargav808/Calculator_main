package calculatorApp;

import static org.junit.Assert.*;

 import org.junit.Test;

public class CalculatorTest {
	
 
 
	@Test
	public void testSubtract() {
	int a = 20; int b = 10; 
	int expectedResult = 10; 
	long result = calculator.sub(a, b);
     assertEquals(expectedResult, result);
	}
	
	@Test
	public void TestAdd() {
	int a = 20; int b = 10; 
	int expectedResult = 30; 
	long result = calculator.add(a, b);
     assertEquals(expectedResult, result);
	}
	@Test
	public void TestDivison() {
	int a = 10; int b = 20; 
	double expectedResult = 0.5; 
	double result = calculator.div(a, b);
     assertEquals(expectedResult, result,0.0005);
	}
	
	@Test
	public void TestMultiply() {
	int a = 10; int b = 20; 
	long expectedResult = 200; 
	long result = calculator.mul(a, b);
     assertEquals(expectedResult, result);
	}

}
