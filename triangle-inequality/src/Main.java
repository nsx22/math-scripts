public class Main {
    public static void main(String[] args) {
        // checks if the lengths of 3 line segments can make a triangle
        float a = 9f;
        float b = 9f;
        float c = 18f;

        if (a + b >= c && b + c >= a && a + c >= b) {
            System.out.println("true"); // is a triangle
        } else {
            System.out.println("false"); // isn't a triangle
        }
    }
}