public class Hello {
    void sayHello(){
        System.out.println("Hello");
    }
}
class TestHello{
    public static void main(String[] args){
        Hello h = new Hello();
        h.sayHello();
    }
}

