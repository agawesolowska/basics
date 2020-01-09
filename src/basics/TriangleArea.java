package basics;

import java.util.Locale;
import java.util.Scanner;

public class TriangleArea {

	static double halfCircumferenceOfTriangle(double lengthA, double lengthB, double lengthC) {
		return (lengthA + lengthB + lengthC) / 2;
	}

	public static void main(String[] args) {
		// simple triangle area calculator

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj długości boków trójkąta:");
		double sideA = sc.nextDouble();
		double sideB = sc.nextDouble();
		double sideC = sc.nextDouble();

		double halfCirc = halfCircumferenceOfTriangle(sideA, sideB, sideC);

		if ((halfCirc - sideA) <= 0 || (halfCirc - sideB) <= 0 || (halfCirc - sideC) <= 0) {
			System.out.println("Trójkąt o podanych wymiarach nie istnieje.");
		} else {
			double triangleArea = Math.sqrt(halfCirc * (halfCirc - sideA) * (halfCirc - sideB) * (halfCirc - sideC));
			System.out.printf("Pole powierzchni trójkąta o podanych wymiarach wynosi %.2f.", triangleArea);
		}

		sc.close();

	}

}
