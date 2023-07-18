public class Main {
    public static void main(String[] args) {
        // Calculates the distance between 2 points
        int[] point1 = {-3, -3};
        int[] point2 = {-3, 2};
        var ans = Math.sqrt(Math.pow((point1[0] - point2[0]), 2) + Math.pow((point1[1] - point2[1]), 2));
        System.out.println(ans);
    }
}