package basics;

import java.util.Scanner;

public class ParkingMeter {

	static int toPay(int hours) {
		final int PRICE_PER_HOUR = 3;
		return PRICE_PER_HOUR * hours;
	}

	public static void main(String[] args) {
		// simple parking meter app

		Scanner sc = new Scanner(System.in);
		System.out.println("Ile godzin bedziesz parkował?");
		int timeInHours = sc.nextInt();

		int totalCost = toPay(timeInHours);

		System.out.printf("Kwota do zapłaty wynosi: %d zł.\n", totalCost);

		int currentAmount = 0;
		do {
			System.out.println("Wrzuć monete:");
			int nextCoin = sc.nextInt();
			currentAmount += nextCoin;
			if (currentAmount >= totalCost) {
				break;
			}
			System.out.printf("Do zapłaty pozostało jeszcze: %d zł.\n", (totalCost - currentAmount));
		} while (currentAmount < totalCost);

		System.out.println("Wrzuciłeś wystarczającą liczbe monet.");
		System.out.printf("Należy Ci sie: %d zł reszty.\n", (currentAmount - totalCost));
		System.out.println("Dzieki, że parkujesz u nas! Do zobaczenia :)");

		sc.close();

	}

}
