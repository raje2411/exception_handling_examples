package exception_handling_examples;

public class Exception_type_Mismatch_example {

	public static void main(String[] args) {

		int nums[] = new int[4];
		try {
			System.out.println("Before exception is generated");
			nums[7] = 9; // exception is generated. But the exception type caught here doesn't match, so
							// it will be picked by JVM default exception handler.
			System.out.println("This wont print, and the above exception is caught by default JVM exception handler");
		} catch (ArithmeticException exc1) {
			System.out.println("The above exception is not caught by this this.so it won't print");
		}
	}

}
