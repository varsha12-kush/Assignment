import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        // Create an instance of Random
        Random rand = new Random();

        // Shuffle the array
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        // Print the shuffled array
        System.out.println(Arrays.toString(arr));
    }
}

