import java.util.*;

public class countOfDiffrentLettersInStringH {
    public static void main(String[] args) {
        String str = "ASDFGGGgggg  fRRTGHTHYJUKKIKI^&&*44333567';;4";
        HashMap<String, Integer> h = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(h.containsKey(str.charAt(i) + ""))
            {
                h.replace(str.charAt(i) + "", h.get(str.charAt(i) + "") + 1);
            }
            else
            {
                h.put(str.charAt(i) + "", 1);
            }
        }
        System.out.println("Символ | количество нахождений в строке");
        for(Map.Entry m:h.entrySet())
        {
            System.out.println("'" + m.getKey() + "'    | " + m.getValue() );
        }
    }
}
