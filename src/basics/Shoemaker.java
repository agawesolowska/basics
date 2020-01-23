package basics;

import java.util.Scanner;

/**
 * It's only a shoemaker deadline.
 * 
 * @author Aga
 *
 */
public class Shoemaker {

	static int dayOfTheWeek(int dayNumber, int timeInDays) {
		return (dayNumber + timeInDays) % 7;
	}

	static String dayOfTheWeek(int dayNumber) {
		switch (dayNumber) {
		case 1:
			return "poniedziałek";
		case 2:
			return "wtorek";
		case 3:
			return "środę";
		case 4:
			return "czwartek";
		case 5:
			return "piątek";
		case 6:
			return "sobotę";
		case 0:
		case 7:
			return "niedzielę";
		default:
			return "BŁĄD";
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"W jaki dzień tygodnia oddałeś buty do szewca? Podaj cyfrę od 1 do 7 - zakładając, że poniedziałek to 1, a niedziela 7.");
		int repairStartDay = sc.nextInt();

		System.out.println("Ile dni będzie trwała naprawa?");
		int repairTimeInDays = sc.nextInt();

		int dayNumberOfReady = dayOfTheWeek(repairStartDay, repairTimeInDays);
		String dayNameOfReady = dayOfTheWeek(dayNumberOfReady);

		System.out.println("Buty będą gotowe do odbioru w " + dayNameOfReady + ".");

		System.out.println("Dziękujemy za skorzystanie z naszych usług!");

		sc.close();

	}

}
