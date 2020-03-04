package Mihelich.Jacob.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	//test numerator returns zero
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath mathObject = new SimpleMath();
		assertEquals(0,mathObject.divide(0,7),.01);
		fail("calculaton error numerator should return zero");
	}
	
	//test numerator returns decimal value
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath mathObject = new SimpleMath();
		assertEquals(.25,mathObject.divide(1,4),.01);
		fail("wrong answer");	
	}
	
	//test zero denominator throws exception
		@Test
		public void testThatSmallerDenominatorThrowsException() {
			SimpleMath mathObject = new SimpleMath();
			assertEquals(.25,mathObject.divide(6,0),.01);
			fail("can not divide by zero");	
		}

}
