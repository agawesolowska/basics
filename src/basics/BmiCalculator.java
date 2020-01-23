package basics;

/**
 * Simple BMI calculator (command-line-interface).
 * 
 * @author Aga
 *
 */
public class BmiCalculator {

	static double computeBMI(int heightInCm, int weightInKg) {
		double heightInM = heightInCm / 100;
		return (double) weightInKg / (heightInM * heightInM);
	}

	public static void main(String[] args) {

		int height = Integer.parseInt(args[0]);
		int weight = Integer.parseInt(args[1]);

		double bmiScore = computeBMI(height, weight);

		System.out.println("Twój BMI wynosi: " + bmiScore);

		if (bmiScore < 18.5) {
			System.out.println("Masz niedowagę!");
		} else if (bmiScore < 25) {
			System.out.println("Twoja waga jest optymalna :)");
		} else {
			System.out.println("Masz nadwagę!");
		}

	}

}
