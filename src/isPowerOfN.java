import java.math.*;
public class isPowerOfN {
    public static void main(String[] args) {
        int n = 4*4*4*4*3;
        int N = 4;
        int power = 0;//N^0 = 1 или logN(1) = 0
        int i = n;
        for(; i >= N ; i = i/N + i%N, power++){}
        if(i == 1) System.out.print("Число " + n + " является степенью(целой) " +
                power + " числа " + N + " или " + N + "^" + power + "=" + n +
                " или log" + N + "(" + n + ")=" + power);
        else System.out.print("Число " + n + " не является целой степенью  числа " + N);
    }
}
