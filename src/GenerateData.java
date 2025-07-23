import java.util.Random;

public class GenerateData {
    public static int[] randomArray(int size, int limit) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(limit); // números entre 0 y limite -1
        }
        return array;
    }
}
