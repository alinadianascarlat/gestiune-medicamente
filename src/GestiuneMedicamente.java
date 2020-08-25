import java.util.Scanner;

class Alina {
	
}

public class GestiuneMedicamente {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a = 0;

		do {
			System.out.println("1 - Introduceti un medicament nou");
			System.out.println("2 - Afisare medicamente existente");
			System.out.println("3 - Cautare medicament");
			System.out.println("4 - Salvare medicamente in fisier");
			System.out.println("5 - Incarcare sold medicamente din fisier");
			System.out.println("6 - Inchidere program");
			System.out.println("Introduceti optiunea: ");

			a = keyboard.nextInt();

			if (a == 1) {
				
				System.out.println("Aceasta optiune este in lucru");
			} else if (a == 2) {
				System.out.println("Aceasta optiune este in lucru");
			} else if (a == 3) {
				System.out.println("Aceasta optiune este in lucru");
			} else if (a == 4) {
				System.out.println("Aceasta optiune este in lucru");
			} else if (a == 5) {
				System.out.println("Aceasta optiune este in lucru");
			} else if (a == 6) {
				System.out.println("La revedere!");
			}
		} while (a != 6);
	}
}
