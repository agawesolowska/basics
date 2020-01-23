package basics;

import java.util.Random;
import java.util.Scanner;

/**
 * Let's check if you know the multiplication table.
 * 
 * @author Aga
 *
 */
public class MultiplicationTable {

	static int multiply(int no1, int no2) {
		return no1 * no2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int number1 = random.nextInt(10);
		int number2 = random.nextInt(10);

		System.out.println("Wylosowane liczby to: " + number1 + " oraz " + number2);
		System.out.println("Czy znasz ich iloczyn?");

		int result = multiply(number1, number2);

		int i = 0;
		while (true) {
			System.out.println("Podaj wynik:");
			System.out.println(">");
			int nextResult = sc.nextInt();
			i++;
			if (result == nextResult) {
				System.out.println("Podałeś wynik w " + i + " próbie.");
				break;
			}
		}

		sc.close();

	}

}
