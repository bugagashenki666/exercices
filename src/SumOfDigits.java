public class SumOfDigits {
    public static void main(String[] args) {
        String strNumber = "12233";
        int result = 0;
        System.out.print("SumOfDigits(" + strNumber + ")=");
        for(int i = 0 ; i < strNumber.length() ; i++)
        {
            result += Integer.parseInt(strNumber.charAt(i) + "");
            if(i < strNumber.length() - 1)
            System.out.print(strNumber.charAt(i) + "+");
            else System.out.print(strNumber.charAt(i));
        }
        System.out.print("=" + result);
    }
}
