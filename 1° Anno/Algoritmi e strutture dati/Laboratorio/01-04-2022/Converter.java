public class Converter {

	public static char toDigit(int x, int b) {
		if (x < 10) return (char) ('0'+x);
		return (char) ('A'+(x%10));
	}

	public static void convertPrint(int N, int b) {

	}

	public static String convert(int N, int b) {
		return "";
	}

	public static void main(String[] args) {
		System.out.print("convertPrint(23, 2) = ");
		convertPrint(23, 2);
		System.out.println("");

		System.out.print("convertPrint(23, 8) = ");
		convertPrint(23, 8);
		System.out.println("");

		System.out.print("convertPrint(23, 16) = ");
		convertPrint(23, 16);
		System.out.println("");

		System.out.print("convertPrint(15, 16) = ");
		convertPrint(15, 16);
		System.out.println("");

		System.out.println("---");

		System.out.println("convert(23, 2) = " + convert(23, 2));

		System.out.println("convert(23, 8) = " + convert(23, 8));

		System.out.println("convert(23, 16) = " + convert(23, 16));

		System.out.println("convert(15, 16) = " + convert(15, 16));
	}
}
