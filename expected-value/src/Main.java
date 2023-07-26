import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Float> probabilityDist = new HashMap<Integer, Float>(); // Hashmap for probability distribution table
        // Example: normal 6-sided dice
        probabilityDist.put(1, (1/6f));
        probabilityDist.put(2, (1/6f));
        probabilityDist.put(3, (1/6f));
        probabilityDist.put(4, (1/6f));
        probabilityDist.put(5, (1/6f));
        probabilityDist.put(6, (1/6f));

        float ans = 0f;

        for (Integer i : probabilityDist.keySet()) {
            ans += i * probabilityDist.get(i); // multiplies random value X by its corresponding probability and adding all of them
        }
        System.out.println(ans);
    }
}