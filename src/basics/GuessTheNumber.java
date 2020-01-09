package basics;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// guess the number from 0 to 999

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int score = random.nextInt(1000);

		System.out.println("Program wylosował liczbę z zakresu od 0 do 999.");

		int i = 0;
		while (true) {
			System.out.println("Zgadnij ją!");
			System.out.println(">");
			int number = sc.nextInt();
			i++;
			if (number == score) {
				System.out.println("Gratulacje! Podałeś wynik w " + i + " próbie.");
				System.out.println("Wylosowana liczba to dokładnie: " + score);
				break;
			} else if (number < score) {
				System.out.println("Podałeś za małą liczbę - próbuj dalej!");
			} else {
				System.out.println("Podałeś za dużą liczbę - próbuj dalej!");
			}
		}

		sc.close();

	}

}
