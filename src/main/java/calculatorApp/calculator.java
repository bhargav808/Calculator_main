package calculatorApp;

public class calculator {

	public static int add(int i, int j) {
		System.out.println("Addition of " + i + "," + j + " is: " + (i + j));
		return i + j;
	}

	public static int mul(int i, int j) {
		System.out.println("Multiplication of " + i + "," + j + " is: " + (i * j));
		return i * j;
	}

	public static int sub(int i, int j) {
		System.out.println("Subtraction of " + i + "," + j + " is: " + (i - j));
		return i - j;
	}

	public static double div(double i, double j) {
		if (j != 0) {
			System.out.println("Division of " + i + "," + j + " is: " + (i / j));
			return i / j;
		} else {
			System.out.println("Division with 0 is not possible");
			return 0;
		}
	}
}
