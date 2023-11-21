package basicosmetodos;

public class Ejer_7_8_9_10_11 {

	public static void main(String[] args) {

		// ejercicio 7
		System.out.println("Ejercicio 7");
		System.out.println("5 elevado a 3 es " + elevarA(5, 3));

		// ejercicio 8
		System.out.println("\nEjercicio 8");
		printList(5, 13);
		printList(20, -1);

		// ejercicio 9
		System.out.println("\nEjercicio 9");
		int[] array = { 1, 2, 3, 4, 5, 0 };
		System.out.println("El número mayor es " + mayorNum(array));

		// ejercicio 10
		System.out.println("\nEjercicio 10");
		System.out.println("El número 5 está en el array?\n" + buscarNumero(array, 5));

		// ejercicio 11
		System.out.println("\nEjercicio 11");
		System.out.println("El número 31 es primo?\n" + esPrimo(31));
	}

	// ejercicio 7
	static int elevarA(int a, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= a;
		}
		return result;
	}

	// ejercicio 8
	static void printList(int a, int b) {
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.print(i + ", ");
			}
		} else if (b < a) {
			for (int i = a; i >= b; i--) {
				System.out.print(i + ", ");
			}
		} else {
			System.out.println("Son iguales");
		}
		System.out.println();
	}

	// ejercicio 9
	static int mayorNum(int[] array) {

		int mayor = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor)
				mayor = array[i];
		}
		return mayor;
	}

	// ejercicio 10
	static boolean buscarNumero(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return true;
			}
		}
		return false;
	}

	// ejercicio 11
	static boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
