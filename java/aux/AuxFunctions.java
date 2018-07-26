package aux;

public class AuxFunctions {

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int origNum = num;
        while(num != 0) {
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev == origNum;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if ((n % 2 == 0) || (n % 3 == 0)) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((i - 1) % 6 == 0 || (i + 1) % 6 == 0) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }
}
