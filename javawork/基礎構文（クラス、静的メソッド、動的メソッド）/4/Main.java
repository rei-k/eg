class Calc {
    int a, b;

    Calc(int a, int b) { this.a = a; this.b = b; }
    int add() { return a + b; }
    int subtract() { return a - b; }
    int multiply() { return a * b; }
    double divide() { return a / (double) b; }
}

public class Main {
    public static void main(String[] args) {
        Calc c = new Calc(10, 5);
        System.out.println("足し算: " + c.add());
        System.out.println("引き算: " + c.subtract());
        System.out.println("掛け算: " + c.multiply());
        System.out.println("割り算: " + c.divide());
    }
}
