public class Main {
    public static void main(String[] args) {
        // this is to get the point on a line segment that divides the line segments to the ratio
        // first point (-36, -4)
        float x1 = -36f;
        float y1 = -4f;
        // second point (-1, 6)
        float x2 = -1f;
        float y2 = 6f;
        // ratio (4:1)
        float c = 4f;
        float d = 1f;
        System.out.println((x1 + (((c * (x2 - x1)) / (c + d)))));
        System.out.println((y1 + (((c * (y2 - y1)) / (c + d)))));
    }
}