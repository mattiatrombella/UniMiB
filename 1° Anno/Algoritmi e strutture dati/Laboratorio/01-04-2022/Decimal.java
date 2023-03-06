public class Decimal {

	public static void printDecimal(int n) {
		if(n==0)
			System.out.println();
		else{
			printDecimal(n/10);
			System.out.println(n %10);
		}

	}

	public static int printDigit(int n, int k) {
		return 0;
	}

	public static void main(String[] args) {
		// System.out.print("printDecimal(296) = ");
		// printDecimal(296);
		// System.out.println("");
		//
		// System.out.println("printDigit(296,0) = " + printDigit(296,0));
		// System.out.println("printDigit(296,1) = " + printDigit(296,1));
		// System.out.println("printDigit(296,2) = " + printDigit(296,2));

		printDecimal(190);
	}
}
