class Coffee{
    String origin;
    int degreeOfRoast;
    String grade;
    Coffee(String o){origin = o;}
    Coffee(String o, String g){origin = o; grade =g;}

    void roast(int r){
        System.out.println("roasting... "+origin+" "+grade);
        degreeOfRoast = r;
    }
    void grind(){
        System.out.println("grinding... degree of roast is "+degreeOfRoast);
    }
    void brew() {
        System.out.println("brewing...");
    }
}
public class TestCoffee {
    public static void main(String[] args){
        Coffee myCf = new Coffee("Kenya", "AA");
        myCf.roast(1);
        myCf.grind();
        myCf.brew();
    }
}
