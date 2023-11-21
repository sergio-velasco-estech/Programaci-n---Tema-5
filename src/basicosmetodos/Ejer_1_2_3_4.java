package basicosmetodos;

import java.util.Random;

public class Ejer_1_2_3_4 {

	public static void main(String[] args) {

		// ejercicio 1
		System.out.println("Ejercicio 1");
		printMsg(4);

		// ejercicio 2
		System.out.println("\nEjercicio 2");
		printDouble(45);

		// ejercicio 1
		System.out.println("\nEjercicio 3");
		System.out.println("El maximo número entre 1, 2 y 3 es -> " + maxNum(1, 2, 3));

		// ejercicio 4
		System.out.println("\nEjercicio 4");
		System.out.println("Número aleatorio entre 5 y 10 -> " + numAleatorio(5, 10));
	}

	// ejercicio 1
	static void printMsg(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Módulo ejecutándose");
		}
	}

	// ejercicio 2
	static void printDouble(double num) {
		System.out.println("El doble de " + num + " es " + num * 2);
	}

	// ejercicio 3
	static int maxNum(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}

	// ejercicio 4
	static int numAleatorio(int min, int max) {
		Random rnd = new Random();
		int num = rnd.nextInt(max - min + 1) + min;
		return num;
	}
}
