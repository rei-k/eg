import java.util.stream.IntStream;
import java.util.Arrays; 

public class Main {
    public static void main(String[] args) {
        int[] arr1 = IntStream.range(0, 10).toArray();
        int[] arr2 = IntStream.rangeClosed(1, 10).map(i -> 10 - i).toArray();

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
