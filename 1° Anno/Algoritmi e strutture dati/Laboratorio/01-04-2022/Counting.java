public class Counting {

	public static int count(int value) {
		if(value < 10)
			return 1;
		else
			return (count(value/10) + 1);

	}

	public static void main(String[] args) {
		System.out.println(count(1000));
	}
}
