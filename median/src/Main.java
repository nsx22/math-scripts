import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {21, 21, 23, 26, 27, 30, 31, 42, 53, 54, 56, 61, 67, 67};

        Arrays.sort(values);

        if(values.length%2 != 0) { // checks if number of values in array is odd
            System.out.println(values[values.length/2]); // prints median

        } else { // gets the median of an array with an even num of values
            int[] midTwoNums = {values[(int) ((values.length/2) - 0.5)], values[(int) ((values.length/2) + 0.5)]}; // gets the middle 2 numbers
            double median = (double) (midTwoNums[0] + midTwoNums[1]) /2; // averages them

            System.out.println(median); // print median
        }
    }
}