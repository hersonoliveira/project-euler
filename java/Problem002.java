import java.util.ArrayList;
import java.util.List;

public class Problem002 {

    public static void main(String[] args) {
        System.out.println(new Problem002().run());
    }

    public int run() {
        int sum = 2;
        int num = 0;
        int aux = 2;
        List<Integer> numsFibo = new ArrayList<>();
        numsFibo.add(1);
        numsFibo.add(2);
        while (num < 4000000) {
            num = numsFibo.get(aux-1) + numsFibo.get(aux-2);
            numsFibo.add(num);
            aux++;
            if(num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
