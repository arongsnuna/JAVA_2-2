import java.awt.Point;

public class SwapFunction {
    static void Swap1(Point a1, Point a2){
        Point temp1 = new Point(a1.x, a1.y);
        a1.x = a2.x;
        a1.y = a2.y;
        a2.x = temp1.x;
        a2.y = temp1.y;
    }

    public static void main(String[] args){
        Point p1 = new Point(10,20);
        Point p2 = new Point(30,40);
        System.out.printf("BEFORE swapping:\n p1: %s, p2:%s\n", p1.toString(), p2.toString());
        Swap1(p1,p2);
        System.out.printf("AFTER swapping:\n p1: %s p2: %s\n", p1.toString(), p2.toString());
    }
}
