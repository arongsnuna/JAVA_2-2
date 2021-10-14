public class TestNumLessThan100_2 {
    boolean affirmNum(int num){ return (num<100)?true:false;}
    public static void main(String[] args){
        TestNumLessThan100_2 num = new TestNumLessThan100_2();
        System.out.println(num.affirmNum(50));
        System.out.println(num.affirmNum(100));
        System.out.println(num.affirmNum(150));
    }
}
