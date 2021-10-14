import java.util.Scanner;

class NumLessTan100{
    Scanner sc;
    int num;
    NumLessTan100(Scanner sc){this.sc = sc;}
    void systemInInt(){
        int a = sc.nextInt();
        num = a;
    }
    boolean affirmNum(){return (num<100)?true:false;}
}
public class TestNumLessThan100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NumLessTan100 num = new NumLessTan100(sc);
        num.systemInInt();
        System.out.println(num.affirmNum());
    }
}
