package basics;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests of math functions.
 * 
 * @author Aga
 *
 */
public class MathFunctionsTest {

	@Test
	public void testNumberLength() {
		assertEquals(1, MathFunctions.numberLength(1));
		assertEquals(4, MathFunctions.numberLength(1023));
	}

	@Test
	public void testSumOfNextOddNumbers() {
		assertEquals(1, MathFunctions.sumOfNextOddNumbers(1));
		assertEquals(25, MathFunctions.sumOfNextOddNumbers(5));
	}

	@Test
	public void testIsPrime() {
		assertFalse(MathFunctions.isPrime(1));
		assertTrue(MathFunctions.isPrime(2));
		assertFalse(MathFunctions.isPrime(8));
		assertTrue(MathFunctions.isPrime(79));
	}

	@Test
	public void testFibonacciSequence() {
		assertEquals(0, MathFunctions.fibonacciSequence(0));
		assertEquals(1, MathFunctions.fibonacciSequence(1));
		assertEquals(1, MathFunctions.fibonacciSequence(2));
		assertEquals(2, MathFunctions.fibonacciSequence(3));
		assertEquals(4181, MathFunctions.fibonacciSequence(19));
		assertEquals(12586269025L, MathFunctions.fibonacciSequence(50));
	}

	@Test
	public void testFibonacciSequenceBigInteger() {
		assertEquals(BigInteger.ZERO, MathFunctions.fibonacciSequenceBigInteger(0));
		assertEquals(BigInteger.ONE, MathFunctions.fibonacciSequenceBigInteger(1));
		assertEquals(BigInteger.valueOf(1), MathFunctions.fibonacciSequenceBigInteger(2));
		assertEquals(BigInteger.valueOf(2), MathFunctions.fibonacciSequenceBigInteger(3));
		assertEquals(BigInteger.valueOf(4181), MathFunctions.fibonacciSequenceBigInteger(19));
		assertEquals(BigInteger.valueOf(12586269025L), MathFunctions.fibonacciSequenceBigInteger(50));
	}

}
