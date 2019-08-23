public class MaxMin {
    public static void main(String[] args) {
        double numbers[] = {34, 455, 464, -456, 34, 0 ,34, -456, -1000, - 1000, 1000, 1000};
        double current_min = numbers[0], current_max = numbers[0];
        for(int i = 0 ; i < numbers.length ; i ++)
        {
            if(current_max < numbers[i]) current_max = numbers[i];
            if(current_min > numbers[i]) current_min = numbers[i];
        }
        System.out.println("MIN = " + current_min + " ; MAX = " + current_max);
    }


}
