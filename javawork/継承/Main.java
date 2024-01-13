import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(
            () -> System.out.println("Bark"), // Dog
            () -> System.out.println("Meow"), // Cat
            () -> System.out.println("Roar")  // Lion
        );

        animals.forEach(Animal::sound);
    }
}

interface Animal {
    void sound();
}
