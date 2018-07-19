public class Problem003 {

    public static void main(String[] args) {
        System.out.println(new Problem003().run());
    }

    public int run() {
        long n = 600851475143L;
        int largest = 0;
        while(n!=1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n = n/i;
                    largest = i > largest? i: largest;
                    break;
                }
            }
        }
        return largest;
    }
}
