class BoundingBox{
    double minX, minY, maxX, maxY;
    BoundingBox(double minX, double minY, double maxX, double maxY){
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
    }
}
class Node{
    int index;
    double minX, minY, maxX, maxY;
    BoundingBox boundingBox = new BoundingBox(minX, minY, maxX, maxY);;
}
class InnerNode extends Node{
    public int index1, index2;
    InnerNode(int index, Node node1, Node node2){
        index1 = node1.index;
        index2 = node2.index;
        this.index = index;
        boundingBox.minX = Math.min(node1.boundingBox.minX, node2.boundingBox.minX);
        boundingBox.minY = Math.min(node1.boundingBox.minY, node2.boundingBox.minY);
        boundingBox.maxX = Math.max(node1.boundingBox.maxX, node2.boundingBox.maxX);
        boundingBox.maxY = Math.max(node1.boundingBox.maxY, node2.boundingBox.maxY);
    }
    public String toString(){
        String msg = "node("+ index +"): min("+boundingBox.minX+" "+boundingBox.minY+"), max("+boundingBox.maxX +" "+boundingBox.maxY+"), child index("+index1+" "+index2+")";
        return msg;
    }
}
class LeafNode extends Node {
    Shape rectangle;
    Shape circle;
    LeafNode(int index, Rectangle rectangle) {
        this.index = index;
        this.rectangle = rectangle;
        boundingBox.minX = rectangle.x - rectangle.width / 2;
        boundingBox.maxX = rectangle.x + rectangle.width / 2;
        boundingBox.minY = rectangle.y - rectangle.height / 2;
        boundingBox.maxY = rectangle.y + rectangle.height / 2;
    }
    LeafNode(int index, Circle circle) {
        this.index = index;
        this.circle = circle;
        boundingBox.minX = circle.x - circle.r;
        boundingBox.maxX = circle.x + circle.r;
        boundingBox.minY = circle.y - circle.r;
        boundingBox.maxY = circle.y + circle.r;
    }
    public String toString(){
        String msg = "node("+ index +"): min("+boundingBox.minX+" "+boundingBox.minY+"), max("+boundingBox.maxX +" "+boundingBox.maxY+"), shape index("+index+")";
        return msg;
    }
}
class Shape{
    int index;
    Shape(int index){
        this.index = index;
    }
}
class Rectangle extends Shape{
    double x, y, width, height;
    Rectangle(int index, double x, double y, double width, double height){
        super(index);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
class Circle extends Shape{
    double x, y, r;
    Circle(int index, double x, double y, double r){
        super(index);
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
public class Project2 {
    public static void main(String[] args) {
        //Rectangle의 파라미터 - 인덱스, 중점의 X좌표, 중점의 Y좌표, 가로길이, 세로길이
        Rectangle rect0 = new Rectangle(0,  -1, -1, 2, 2);
        Rectangle rect1 = new Rectangle(1, 1, 1, 4, 3);

        //Circle의 파라미터 - 인덱스, 중점의 X좌표, 중점의 Y좌표, 반지름
        Circle circle2 = new Circle(2, 4, 3, 1);

        //LeafNode의 파라미터 - 인덱스, Shape 객체
        LeafNode node0 = new LeafNode(0, rect0);
        LeafNode node1 = new LeafNode(1, rect1);
        LeafNode node2 = new LeafNode(2, circle2);

        //InnerNode의 파라미터 - 인덱스, 왼쪽 자식 Node 객체, 오른쪽 자식 Node 객체
        InnerNode node3 = new InnerNode(3, node1, node0);
        InnerNode node4 = new InnerNode(4, node3, node2);

        System.out.println(node4);
        System.out.println(node3);
        System.out.println(node2);
        System.out.println(node1);
        System.out.println(node0);
    }
}