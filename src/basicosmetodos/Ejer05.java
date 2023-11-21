package basicosmetodos;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opt = 0;

		do {

			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Producto");
			System.out.println("4. División");
			System.out.println("Cualquier otro para salir");

			opt = sc.nextInt();
			double a = 0, b = 0;
			if (opt > 0 && opt < 5) {
				System.out.println("Introduce un numero");
				a = sc.nextDouble();
				System.out.println("Introduce otro numero");
				b = sc.nextDouble();
			}
			switch (opt) {
			case 1:
				System.out.println("Resultado: " + suma(a, b));
				break;

			case 2:
				System.out.println("Resultado: " + resta(a, b));
				break;

			case 3:
				System.out.println("Resultado: " + producto(a, b));
				break;

			case 4:
				System.out.println("Resultado: " + division(a, b));
				break;

			default:
				System.out.println("Fin del programa");
				break;
			}

		} while (opt > 0 && opt < 5);
		sc.close();
	}

	static double suma(double a, double b) {
		return a + b;
	}

	static double resta(double a, double b) {
		return a - b;
	}

	static double producto(double a, double b) {
		return a * b;
	}

	static double division(double a, double b) {
		return a / b;
	}
}
