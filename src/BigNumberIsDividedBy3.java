public class BigNumberIsDividedBy3 {
    public static void main(String[] args) {
        String bigNumber = "1111";
        int denominator = 5;//divider
        int sum  = 0;
        System.out.print("SumOfDigits(" + bigNumber + ")=");
        for(int i = 0 ; i < bigNumber.length() ; i++)
        {
            sum += Integer.parseInt(bigNumber.charAt(i) + "");
            if(i < bigNumber.length() - 1)
                System.out.print(bigNumber.charAt(i) + "+");
            else System.out.print(bigNumber.charAt(i) + "");
        }
        System.out.println("=" + sum);
        if(sum%denominator == 0)
        {
            System.out.println("Число " + bigNumber + " делится на " + denominator);
        }
        else System.out.println("Число " + bigNumber + " не делится на " + denominator);
    }
}
