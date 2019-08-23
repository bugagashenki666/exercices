public class SumOf1toN {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1, n = 5; i <= n ; sum += i++)
        {
            if(i < n)
            System.out.print( i + "+");
            else System.out.print( i + "+");
        }
        System.out.print("=" + sum);
    }
}
