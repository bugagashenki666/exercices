public class factorialN {
    public static void main(String[] args) {
        int result = 1;
        int N = 5;
        System.out.print(N + "!=");
        for (int i = 1 ; i <= N ; result *= i++)
        {
            if(i < N)
                System.out.print(i + "*");
            else System.out.print(i);
        }
        System.out.print("=" + result);
    }
}
