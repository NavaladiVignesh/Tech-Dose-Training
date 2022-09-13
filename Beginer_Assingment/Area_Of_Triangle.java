public class Area_Of_Triangle {
    public static void main(String[] args) {
        Point A = new Point(13, 34);
        Point B = new Point(22, 21);
        Point C = new Point(11, 19);
        System.out.println(Triangle.area(A, B, C));
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Triangle {
    public static float area(Point A, Point B, Point C) {
        float area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
        return Math.abs(area);
    }
}
