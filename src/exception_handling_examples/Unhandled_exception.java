package exception_handling_examples;

public class Unhandled_exception {

	public static void main(String[] args) {

		int nums[] = new int[4];

		System.out.println("Before exception is generated");
		nums[7] = 9; // exception is generated. But it is not caught here, so by default JVM
						// exception handler catches this
		System.out.println("This wont print, and the above exception is caught by default JVM exception handler");

	}

}
