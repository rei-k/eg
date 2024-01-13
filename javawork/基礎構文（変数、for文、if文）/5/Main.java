import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> fruits = Map.of(
            1, "りんご", 
            2, "いちご", 
            3, "みかん", 
            4, "バナナ", 
            5, "メロン"
        );

        fruits.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
