import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {61, 58, 53, 56, 54, 53, 51, 61, 58, 49, 63, 51, 46, 56, 66, 58};

        Arrays.sort(values);

        double mean = Arrays.stream(values).average().orElse(0);

        double[] differences = new double[values.length];
        int i = 0;
        for (int num : values) {
            differences[i] = Math.pow((Math.abs(mean-num)), 2);
            i++;
        }
        double ans = 0;
        for (double diff : differences) {
            ans += diff;
        }
        ans /= values.length;
        ans = Math.sqrt(ans);

        System.out.println(ans);
    }
}