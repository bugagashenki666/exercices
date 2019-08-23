import java.util.*;

public class CountOfDifferentLettersInString {
    public static void main(String[] args) {

        //for(char c = 0  ; c < Character.MAX_VALUE ; c++)//ВЫвод всех возможных символов UNICODE
        //{
        //    System.out.print(((int)c));
        //    System.out.println("=" + c);
        //}

        int[] countsOfCharacters = new int[Character.MAX_VALUE];
        String data = "AAABBddHHHTTTNNNJJJUUUTTTYFFDFhhh   \n \r \t\t\t\t\t\t";
        System.out.println("Исходная строка" + data);
        for(int i = 0 ; i < data.length() ; i++)
        {
            countsOfCharacters[(int)data.charAt(i)]++;
        }

        for(int i = 0 ; i < Character.MAX_VALUE ; i ++)
        {
            if(countsOfCharacters[i] > 0 )
                System.out.println("Количество символов '" + (char)i + "' = " + countsOfCharacters[i]);
        }


    }
}
