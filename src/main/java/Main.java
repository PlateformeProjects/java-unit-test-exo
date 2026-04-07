public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		int a = 10;
		int b = 5;

		System.out.println("Addition: " + calculator.add(a, b));
		System.out.println("Soustraction: " + calculator.subtract(a, b));
		System.out.println("Multiplication: " + calculator.multiply(a, b));
		System.out.println("Division: " + calculator.divide(a, b));

	}
}