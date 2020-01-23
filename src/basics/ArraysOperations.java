package basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Container for arrays operations.
 * 
 * @author Aga
 *
 */
public class ArraysOperations {

	public static int calculateSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static double calculateAvg(int[] array) {
		if (array.length == 0) {
			return 0;
		} else {
			int sum = calculateSum(array);
			return (double) sum / array.length;
		}
	}

	public static Integer findMin(int[] array) {
		if (array.length == 0) {
			return null;
		} else {
			int minimum = Integer.MAX_VALUE;
			for (int i = 0; i < array.length; i++) {
				if (array[i] < minimum) {
					minimum = array[i];
				}
			}
			return minimum;
		}
	}

	public static Integer findMax(int[] array) {
		if (array.length == 0) {
			return null;
		} else {
			int maximum = Integer.MIN_VALUE;
			for (int i = 0; i < array.length; i++) {
				if (array[i] > maximum) {
					maximum = array[i];
				}
			}
			return maximum;
		}
	}

	public static Integer calculateAmp(int[] array) {
		if (array.length == 0) {
			return null;
		} else {
			int minimum = findMin(array);
			int maximum = findMax(array);
			return maximum - minimum;
		}
	}

	public static int calculateSumOfEvenNumbers(int[] array) {
		int sumOfEvenNumbers = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sumOfEvenNumbers += array[i];
			}
		}
		return sumOfEvenNumbers;
	}

	public static Integer findTheFirstLarger(int[] array, int xParameter) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > xParameter) {
				return array[i];
			}
		}
		return null;
	}

	public static int howManyLarger(int[] array, int xParameter) {
		int largerNumbers = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > xParameter) {
				largerNumbers++;
			}
		}
		return largerNumbers;
	}

	public static List<Integer> findAllLarger(int[] array, int xParameter) {
		List<Integer> largerNumbersList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] > xParameter) {
				largerNumbersList.add(array[i]);
			}
		}
		return largerNumbersList;
	}

	public static int calculateSumOfLarger(int[] array, int xParameter) {
		int largerNumbersSum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > xParameter) {
				largerNumbersSum += array[i];
			}
		}
		return largerNumbersSum;
	}

	public static Integer findTheFirstDivisible(int[] array, int xParameter) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % xParameter == 0) {
				return array[i];
			}
		}
		return null;
	}

	public static int howManyDivisible(int[] array, int xParameter) {
		int divisibleNumbers = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % xParameter == 0) {
				divisibleNumbers++;
			}
		}
		return divisibleNumbers;
	}

	public static List<Integer> findAllDivisible(int[] array, int xParameter) {
		List<Integer> divisibleNumbersList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % xParameter == 0) {
				divisibleNumbersList.add(array[i]);
			}
		}
		return divisibleNumbersList;
	}

	public static Integer findTheFirstCommonElement(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					return array1[i];
				}
			}
		}
		return null;
	}

	public static List<Integer> findAllSharedElements(int[] array1, int[] array2) {
		List<Integer> sharedElementsList = new ArrayList<>();
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					sharedElementsList.add(array1[i]);
				}
			}
		}
		return sharedElementsList;
	}

}
