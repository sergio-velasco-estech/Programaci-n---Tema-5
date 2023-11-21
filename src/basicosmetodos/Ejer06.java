package basicosmetodos;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Conversión de euros\n¿Qué quieres hacer?");
		System.out.println("1. Convertir a libras");
		System.out.println("2. Convertir a dólares");
		System.out.println("3. Convertir a yenes");

		int opt = sc.nextInt();

		System.out.println("Introduce la cantidad de euros");

		double a = sc.nextDouble();

		if (opt == 1) {
			System.out.println(a + " euros son " + convLibra(a) + " libras.");
		} else if (opt == 2) {
			System.out.println(a + " euros son " + convDolar(a) + " dólares.");
		} else if (opt == 3) {
			System.out.println(a + " euros son " + convYen(a) + " yenes.");
		} else {
			System.out.println("Opción equivocada");
		}

		sc.close();
	}

	static double convLibra(double e) {
		return e * 0.86;
	}

	static double convDolar(double e) {
		return e * 1.28611;
	}

	static double convYen(double e) {
		return e * 129.852;
	}

}
