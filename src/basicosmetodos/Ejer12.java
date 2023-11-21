package basicosmetodos;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opt = 0;

		do {
			impr("\nEscribe qué deseas hacer?");
			impr("1. Área Circulo");
			impr("2. Área Cuadrado");
			impr("3. Área Rectángulo");
			impr("4. Área Triángulo");
			impr("Cualquier para salir");

			opt = sc.nextInt();

			switch (opt) {
			case 1:
				impr("Introduce radio");
				double r = sc.nextDouble();
				impr("El área del círculo es: " + aCirculo(r));
				break;

			case 2:
				impr("Introduce lado");
				double l = sc.nextDouble();
				impr("El área del cuadrado es: " + aCuadr(l));
				break;

			case 3:
				impr("Introduce lado");
				double l1 = sc.nextDouble();
				impr("Introduce otro lado");
				double l2 = sc.nextDouble();
				impr("El área del rectángulo es: " + aRect(l1, l2));
				break;

			case 4:
				impr("Introduce base");
				double b = sc.nextDouble();
				impr("Introduce altura");
				double a = sc.nextDouble();
				impr("El área del rectángulo es: " + aTri(b, a));
				break;

			default:
				System.out.println("Fin del programa");
				break;
			}

		} while (opt > 0 && opt < 5);
		sc.close();

	}

	static double aCirculo(double r) {
		return Math.PI * r * r;
	}

	static double aCuadr(double l) {
		return l * l;
	}

	static double aRect(double b, double a) {
		return b * a;
	}

	static double aTri(double b, double a) {
		return b * a / 2;
	}

	static void impr(String msg) {
		System.out.println(msg);
	}

}
