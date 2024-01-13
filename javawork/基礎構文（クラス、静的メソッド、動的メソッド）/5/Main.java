class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
N
    static double distance(Point p1, Point p2) {
        return Math.hypot(p1.x - p2.x, p1.y - p2.y);
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(5, 7);
        System.out.println("Distance: " + Point.distance(p1, p2));
    }
}
