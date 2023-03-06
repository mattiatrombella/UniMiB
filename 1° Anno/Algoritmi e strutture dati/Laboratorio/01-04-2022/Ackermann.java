public class Ackermann {

	public static long ack(long x, long y) {
		if(x==0)
			return (y+1);
		if(y==0)
			return ack(x-1,1);
		return (ack(x-1,ack(x,y-1)));
	}

	public static void main(String[] args) {

		System.out.println(ack(3,4));
		// long startTime = System.nanoTime();
		// System.out.println("ack(3,8) = " + ack(3,8));
		// System.out.println(" in " + (System.nanoTime()-startTime) + "ns");
		// System.out.println("");
		//
		// startTime = System.nanoTime();
		// System.out.println("ack(3,11) = " + ack(3,11));
		// System.out.println(" in " + (System.nanoTime()-startTime) + "ns");
		// System.out.println("ack(3,12) = " + ack(3,12));
		// System.out.println("ack(4,1) = " + ack(4,1));
		// System.out.println("ack(4,1) = " + ack(4,2)); // numero intero di 19729 cifre
	}
}
