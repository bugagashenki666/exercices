public class IsPalindrome {
    public static void main(String[] args) {
        String probablyPalindrome = "abcdgjdcba";
        boolean is_palindrome = true;
        for(int i = 0 ; i < probablyPalindrome.length() ; i++)
        {
            if(probablyPalindrome.charAt(i) != probablyPalindrome.charAt(probablyPalindrome.length() - i - 1))
            {
                is_palindrome = false;
                break;
            }
        }
        if(is_palindrome)
        {
            System.out.println("Строка " + probablyPalindrome + " является палиндромом");
        }
        else {
            System.out.println("Строка " + probablyPalindrome + " не является палиндромом");
        }

    }
}
