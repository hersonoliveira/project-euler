package solutions;

import aux.AuxFunctions;

public class Problem007 {

    public static void main(String[] args) {
        System.out.println(new Problem007().run());
    }

    public int run() {
        int num = 0;
        int aux = 1;
        while(num < 10001) {
            aux +=1;
            if (AuxFunctions.isPrime(aux)) {
                num += 1;
            }
        }
        return aux;
    }
}
