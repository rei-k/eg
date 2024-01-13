public class Main {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        System.out.println("Sum: " + calculate(num1, num2, "足し算"));
        System.out.println("Difference: " + calculate(num1, num2, "引き算"));
        System.out.println("Product: " + calculate(num1, num2, "掛け算"));
        System.out.println("Quotient: " + calculate(num1, num2, "割り算"));
    }

    public static int calculate(int a, int b, String operation) {
        switch (operation) {
            case "足し算":
                return a + b;
            case "引き算":
                return a - b;
            case "掛け算":
                return a * b;
            case "割り算":
                return (b != 0) ? a / b : 0; // Returns 0 if b is 0
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
