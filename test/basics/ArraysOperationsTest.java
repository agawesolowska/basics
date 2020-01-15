package basics;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ArraysOperationsTest {
	// unit tests of arrays operations

	private int xParameter;
	private int[] array1, array2, array3;

	@Before
	public void setUp() {
		xParameter = 5;
		array1 = new int[] {};
		array2 = new int[] { 2, 1, 9, 8, 6, 3, 7 };
		array3 = new int[] { 1, -5, 6, 0, -9, 7, 8 };
	}

	@Test
	public void testCalculateSumOfArrays() {
		assertEquals(0, ArraysOperations.calculateSum(array1));
		assertEquals(36, ArraysOperations.calculateSum(array2));
		assertEquals(8, ArraysOperations.calculateSum(array3));
	}

	@Test
	public void testCalculateAvgOfArrays() {
		assertEquals(0.00, ArraysOperations.calculateAvg(array1), 0.01);
		assertEquals(5.14, ArraysOperations.calculateAvg(array2), 0.01);
		assertEquals(1.14, ArraysOperations.calculateAvg(array3), 0.01);
	}

	@Test
	public void testFindMinOfArrays() {
		assertEquals(null, ArraysOperations.findMin(array1));
		assertEquals(Integer.valueOf(1), ArraysOperations.findMin(array2));
		assertEquals(Integer.valueOf(-9), ArraysOperations.findMin(array3));
	}

	@Test
	public void testFindMaxOfArrays() {
		assertEquals(null, ArraysOperations.findMax(array1));
		assertEquals(Integer.valueOf(9), ArraysOperations.findMax(array2));
		assertEquals(Integer.valueOf(8), ArraysOperations.findMax(array3));
	}

	@Test
	public void testCalculateAmpOfArrays() {
		assertEquals(null, ArraysOperations.calculateAmp(array1));
		assertEquals(Integer.valueOf(8), ArraysOperations.calculateAmp(array2));
		assertEquals(Integer.valueOf(17), ArraysOperations.calculateAmp(array3));
	}

	@Test
	public void testCalculateSumOfEvenNumbersOfArrays() {
		assertEquals(0, ArraysOperations.calculateSumOfEvenNumbers(array1));
		assertEquals(16, ArraysOperations.calculateSumOfEvenNumbers(array2));
		assertEquals(14, ArraysOperations.calculateSumOfEvenNumbers(array3));
	}

	@Test
	public void testFindTheFirstLargerInArrays() {
		assertEquals(null, ArraysOperations.findTheFirstLarger(array1, xParameter));
		assertEquals(Integer.valueOf(9), ArraysOperations.findTheFirstLarger(array2, xParameter));
		assertEquals(Integer.valueOf(6), ArraysOperations.findTheFirstLarger(array3, xParameter));
	}

	@Test
	public void testHowManyLargerInArrays() {
		assertEquals(0, ArraysOperations.howManyLarger(array1, xParameter));
		assertEquals(4, ArraysOperations.howManyLarger(array2, xParameter));
		assertEquals(3, ArraysOperations.howManyLarger(array3, xParameter));
	}

	@Test
	public void testFindAllLargerInArrays() {
		List<Integer> emptyList = Arrays.asList();
		List<Integer> expectedInCaseOfArray2 = Arrays.asList(9, 8, 6, 7);
		List<Integer> expectedInCaseOfArray3 = Arrays.asList(6, 7, 8);
		
		assertEquals(emptyList, ArraysOperations.findAllLarger(array1, xParameter));
		assertEquals(expectedInCaseOfArray2, ArraysOperations.findAllLarger(array2, xParameter));
		assertEquals(expectedInCaseOfArray3, ArraysOperations.findAllLarger(array3, xParameter));
	}

	@Test
	public void testCalculateSumOfLargerInArrays() {
		assertEquals(0, ArraysOperations.calculateSumOfLarger(array1, xParameter));
		assertEquals(30, ArraysOperations.calculateSumOfLarger(array2, xParameter));
		assertEquals(21, ArraysOperations.calculateSumOfLarger(array3, xParameter));
	}

	@Test
	public void testFindTheFirstDivisibleInArrays() {
		assertEquals(null, ArraysOperations.findTheFirstDivisible(array1, xParameter));
		assertEquals(null, ArraysOperations.findTheFirstDivisible(array2, xParameter));
		assertEquals(Integer.valueOf(-5), ArraysOperations.findTheFirstDivisible(array3, xParameter));
	}

	@Test
	public void testHowManyDivisibleInArrays() {
		assertEquals(0, ArraysOperations.howManyDivisible(array1, xParameter));
		assertEquals(0, ArraysOperations.howManyDivisible(array2, xParameter));
		assertEquals(2, ArraysOperations.howManyDivisible(array3, xParameter));
	}

	@Test
	public void testFindAllDivisibleInArrays() {
		List<Integer> emptyList = Arrays.asList();
		List<Integer> expectedInCaseOfArray3 = Arrays.asList(-5, 0);
		
		assertEquals(emptyList, ArraysOperations.findAllDivisible(array1, xParameter));
		assertEquals(emptyList, ArraysOperations.findAllDivisible(array2, xParameter));
		assertEquals(expectedInCaseOfArray3, ArraysOperations.findAllDivisible(array3, xParameter));
	}

	@Test
	public void testFindTheFirstCommonElementOfArrays() {
		assertEquals(null, ArraysOperations.findTheFirstCommonElement(array1, array2));
		assertEquals(Integer.valueOf(1), ArraysOperations.findTheFirstCommonElement(array2, array3));
	}

	@Test
	public void testFindAllSharedElementsInArrays() {
		List<Integer> emptyList = Arrays.asList();
		List<Integer> expectedInCaseOfArrays2And3 = Arrays.asList(1, 8, 6, 7);
		
		assertEquals(emptyList, ArraysOperations.findAllSharedElements(array1, array2));
		assertEquals(expectedInCaseOfArrays2And3, ArraysOperations.findAllSharedElements(array2, array3));
	}

}
