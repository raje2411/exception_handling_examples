package exception_handling_examples;

public class NestedTryDemo {

	public static void main(String args[]) {

		int number[] = { 10, 18, 22, 21, 31, 41, 51, 61 };
		int denom[] = { 2, 3, 0, 5 };
		try {
			for (int i = 0; i < number.length; i++) {
				try { // nested try block

					System.out.println(number[i] + "/" + denom[i] + " is " + number[i] / denom[i]);

				} catch (ArithmeticException exp1) {

					System.out.println(number[i] + "/" + denom[i] + "  Can't divide by 0");
				}
			}
		} catch (ArrayIndexOutOfBoundsException exp2) {
			// when this outer block catches the out of bounds exception, the program
			// terminates from inner try block and continues from the outer catch block

			System.out.println("Your denom array is running out of defined size");
		}
	}
}
