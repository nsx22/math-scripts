import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {20, 20, 20, 32, 36, 37, 39, 43, 46, 47, 48, 50, 51, 51, 62, 64, 65};

        Arrays.sort(values);
        int count = 0;

        for (int num : values) {
            count++;
            System.out.print(num);

            if (count != values.length) {
                System.out.print(", ");
            }
        }
    }
}