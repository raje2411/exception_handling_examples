package exception_handling_examples;

public class Exception_Demo4_throwable_exception {

	public static void main(String[] args) {
		int number[] = { 10, 18, 22, 21, 31, 41, 51, 61 };
		int denom[] = { 0, 3, 0, 5, 0, 11, 0 };

		for (int i = 0; i < number.length; i++) {
			try {

				System.out.println(number[i] + "/" + denom[i] + " is " + number[i] / denom[i]);

			} catch (ArrayIndexOutOfBoundsException exp2) {
				System.out.println("Your denom array is running out of defined size");
			} catch (Throwable exp3) {
				// This throwable(super-class exception) should be always catched after the
				// sub-class exception)
				System.out.println("Some exception happened in the try block");

			}
		}
	}

}
