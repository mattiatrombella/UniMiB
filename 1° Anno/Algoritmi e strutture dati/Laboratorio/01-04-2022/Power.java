public class Power {

	public static long powerSlow(long a, long b) {
		return 0;
	}

	public static long powerFast(long a, long b) {
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("powerSlow(3,8) = " + powerSlow(3, 8));
		System.out.println("powerFast(3,8) = " + powerFast(3, 8));
		System.out.println("");

		long startTime = System.nanoTime();
		System.out.println("powerSlow(2,62) = " + powerSlow(2, 62));
		System.out.println(" in " + (System.nanoTime() - startTime) + "ns");

		startTime = System.nanoTime();
		System.out.println("powerSlow(2,62) = " + powerFast(2, 62));
		System.out.println(" in " + (System.nanoTime() - startTime) + "ns");
		System.out.println("");

		startTime = System.nanoTime();
		System.out.println("powerSlow(1,4096) = " + powerSlow(1, 4096));
		System.out.println(" in " + (System.nanoTime() - startTime) + "ns");

		startTime = System.nanoTime();
		System.out.println("powerFast(1,4096) = " + powerFast(1, 4096));
		System.out.println(" in " + (System.nanoTime() - startTime) + "ns");
		System.out.println("");

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; ++i)
			powerSlow(1, 4096);
		System.out.println("1000 iteration of powerSlow(1,4096) in " + (System.nanoTime() - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; ++i)
			powerFast(1, 4096);
		System.out.println("1000 iteration of powerFast(1,4096) in " + (System.nanoTime() - startTime) + "ns");
	}
}