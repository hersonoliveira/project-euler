package solutions;

import aux.AuxFunctions;

public class Problem004 {

    public static void main(String[] args) {
        System.out.println(new Problem004().run());
    }

    public int run() {
        int max = Integer.MIN_VALUE;
        int aux = 0;
        for (int i = 999; i > 99 ; i--) {
            for (int j = 999; j > 99 ; j--) {
                aux = i*j;
                if (AuxFunctions.isPalindrome(aux)) {
                    max = aux>max ? aux: max;
                }
            }
        }
        return max;
    }
}
