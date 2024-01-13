// Shape インターフェース定義
interface Shape {
    double area();
    double perimeter();
    String getName();
}

// AbstractShape 抽象クラスで共通の getName メソッドを定義
abstract class AbstractShape implements Shape {
    public String getName() {
        return this.getClass().getSimpleName();
    }
}

// Rectangle クラス
class Rectangle extends AbstractShape {
    private double length, width;
    Rectangle(double length, double width) { this.length = length; this.width = width; }
    public double area() { return length * width; }
    public double perimeter() { return 2 * (length + width); }
}

// Circle クラス
class Circle extends AbstractShape {
    private double radius;
    Circle(double radius) { this.radius = radius; }
    public double area() { return Math.PI * radius * radius; }
    public double perimeter() { return 2 * Math.PI * radius; }
}

// Triangle クラス
class Triangle extends AbstractShape {
    private double side;
    Triangle(double side) { this.side = side; }
    public double area() { return (Math.sqrt(3) / 4) * side * side; }
    public double perimeter() { return 3 * side; }
}

// メインクラス
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Rectangle(3, 4), new Circle(7), new Triangle(9) };
        for (Shape shape : shapes) {
            System.out.printf("%s - Area: %.2f, Perimeter: %.2f%n", shape.getName(), shape.area(), shape.perimeter());
        }
    }
}
