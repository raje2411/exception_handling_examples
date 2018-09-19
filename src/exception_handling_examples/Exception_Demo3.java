package exception_handling_examples;

public class Exception_Demo3 {

	public static void main(String[] args) {
		int number[] = { 10, 18, 22, 21, 31, 41, 51, 61 };
		int denom[] = { 2, 3, 0, 5, 0, 11, 0};

		for (int i = 0; i < number.length; i++) {
			try {

				System.out.println(number[i] + "/" + denom[i] + " is " + number[i] / denom[i]);

			} catch (ArithmeticException exp1) {
				System.out.println("Can't divide by 0");
			} catch (ArrayIndexOutOfBoundsException exp2) {
				System.out.println("Your denom array is running out of defined size");
			}
		}
	}

}
