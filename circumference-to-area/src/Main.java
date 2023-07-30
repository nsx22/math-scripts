public class Main {
    public static void main(String[] args) {
        float cir = 45; // This is the circumference divided by pi (which is equal to 2r)
        float ans = (float) Math.pow((cir/2), 2);
        System.out.println("r squared: " + ans);
        System.out.println("times pi: " + ans * Math.PI); // Multiplied by pi
    }
}