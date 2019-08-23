public class powerN {
    public static void main(String[] args) {
        int n = 2;
        int result = 1;
        int k = 4;

        for (int i = 0 ; i < k ; result *= n, i++){}
        System.out.println("" + n  + "^" + k + "=" + result);
    }
}
