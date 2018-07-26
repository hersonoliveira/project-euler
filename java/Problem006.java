public class Problem006 {

	public static void main(String[] args) {
		System.out.println(new Problem006().run());
	}

	public int run() {
		int squareSum =0, sumSquare =0;

		for (int i = 1; i <= 100 ; i++) {
			squareSum += i;
			sumSquare += i*i;
		}

		squareSum *= squareSum;
		return Math.abs(sumSquare - squareSum);
	}
}
