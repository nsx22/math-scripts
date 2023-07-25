import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {20, 22, 58, 19, 21, 49, 23, 44}; // numbers you want to mean/average

        float ans = 0;
        for (float num : values) {
            ans += num;
        }
        ans /= values.length;

        System.out.println(ans);
        // You can also use just this one line:
        // System.out.println(Arrays.stream(values).average()); // make sure values is an int[]
    }
}