package basics;

import java.math.BigInteger;

public class MathFunctions {
	// container for math functions

	public static int numberLength(long number) {
		int i = 0;
		while (number >= 1) {
			number = number / 10;
			i++;
		}
		return i;
	}

	public static int sumOfNextOddNumbers(int numberOfOddNumbers) {
		int nextOddNumber = 1;
		int sum = 0;
		for (int i = 1; i <= numberOfOddNumbers; i++) {
			sum += nextOddNumber;
			nextOddNumber += 2;
		}
		return sum;
	}

	public static boolean isPrime(long number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= (number - 1); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static long fibonacciSequence(int fibonacciNumber) {
		long previousNumber = 0;
		long currentNumber = 1;
		long score = 0;

		if (fibonacciNumber < 2) {
			return fibonacciNumber;
		} else {
			for (int i = 2; i <= fibonacciNumber; i++) {
				score = previousNumber + currentNumber;
				previousNumber = currentNumber;
				currentNumber = score;
			}
			return score;
		}
	}

	public static BigInteger fibonacciSequenceBigInteger(int fibonacciNumber) {
		BigInteger previousNumber = BigInteger.ZERO;
		BigInteger currentNumber = BigInteger.ONE;
		BigInteger score = BigInteger.ZERO;

		if (fibonacciNumber == 0) {
			return BigInteger.ZERO;
		} else if (fibonacciNumber == 1) {
			return BigInteger.ONE;
		} else {
			for (int i = 2; i <= fibonacciNumber; i++) {
				score = previousNumber.add(currentNumber);
				previousNumber = currentNumber;
				currentNumber = score;
			}
			return score;
		}
	}
}
