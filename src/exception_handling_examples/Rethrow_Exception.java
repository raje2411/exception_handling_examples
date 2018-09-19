package exception_handling_examples;

class rethrow {

	public void gen_exception() {

		int[] num = new int[2];
		try {
			num[1] = 5 / 0;
		} catch (ArrayIndexOutOfBoundsException excep1) {
			System.out.println("Array is out of bound");
			throw excep1;
		}
	}

}

public class Rethrow_Exception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		rethrow obj = new rethrow();
		try {
			obj.gen_exception();
		} catch (Exception e) {
			e.printStackTrace();
			Thread.sleep(10000); // To wait 10 sec before printing the following println.
			System.out.println("Rethrown message captured in main: Array is out of bound");
			System.out.println("123");
		}
	}

}
