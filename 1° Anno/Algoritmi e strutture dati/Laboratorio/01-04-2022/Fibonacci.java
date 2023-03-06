public class Fibonacci {

	public static int fib(int x) {
		if(x==1 || x==2)
		 	return 1;
		if(x>=3)
			return (fib(x-1) + fib(x-2));
		return 0;
	}

	public static int fib_it(int n) {
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(fib(10));
		// System.out.println("fib(6) = " + fib(6));
		//
		// System.out.println("fib_it(6) = " + fib_it(6));
		//
		// System.out.println("");
		//
		// long startTime = System.nanoTime();
		// System.out.println("fib(42) = " + fib(42));
		// System.out.println(" in " + (System.nanoTime()-startTime) + "ns");
		//
		// startTime = System.nanoTime();
		// System.out.println("fib_it(42) = " + fib_it(42));
		// System.out.println(" in " + (System.nanoTime()-startTime) + "ns");
	}
}
