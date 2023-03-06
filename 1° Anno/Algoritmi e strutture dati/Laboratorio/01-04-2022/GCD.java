public class GCD {

	public static long gcdSlow(long A, long B) {
		if (B=0)
			return A;
		if(B > 0 && A>=B)
			return gcd(A-B,B);
		return (gcd(B,A));
	}

	public static long gcdFast(long A, long B) {
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("gcdSlow(3,8) = " + gcdSlow(3, 8));
		System.out.println("gcdFast(3,8) = " + gcdFast(3, 8));
		System.out.println("");

		long startTime = System.nanoTime();
		System.out.println("gcdSlow(8132,8128) = " + gcdSlow(8132, 8128));
		System.out.println(" in " + (System.nanoTime() - startTime) + "ns");

		startTime = System.nanoTime();
		System.out.println("gcdFast(8132,8128) = " + gcdFast(8132, 8128));
		System.out.println(" in " + (System.nanoTime() - startTime) + "ns");

		System.out.println("");

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; ++i)
			gcdSlow(8132, 8128);
		System.out.println("1000 iteration of gcdSlow(8132,8128) in " + (System.nanoTime() - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; ++i)
			gcdFast(8132, 8128);
		System.out.println("1000 iteration of gcdFast(8132,8128) in " + (System.nanoTime() - startTime) + "ns");

		System.out.println("");

		// gcdSlow(810032, 810028);
		startTime = System.nanoTime();
		System.out.println("gcdFast(810032,810028) = " + gcdFast(810032, 810028));
		System.out.println(" in " + (System.nanoTime() - startTime) + "ns");
	}
}
