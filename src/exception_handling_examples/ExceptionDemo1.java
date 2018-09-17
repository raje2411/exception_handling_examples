package exception_handling_examples;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int[] nums = new int[4];

		try {
			// nums[2] = 15; //Perfect assignment.

			nums[5] = 25; // Will throw ArrayIndexOutOfBoundsException

			System.out.println("This line won't print,as the above statement "
					+ "will cause exception and the program control transferred to exception handling");

		} catch (ArrayIndexOutOfBoundsException exp1) { // These sub-class exception should be catched first
			System.out.println("Index array is out of bounds, check the array assignment carefully!");
		} catch (Throwable exp2) { // This throwable(super-class exception) should be always catched after the
									// sub-class exception)

			System.out.println("Caugth the general exception.");

		}

		System.out.println("After the Catch block");

	}

}
