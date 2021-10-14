public class TestRecursiveSum {
    long sum(int n){
        if (n==1) return 1;
        else {return n+sum(n-1);}
    }
    public static void main(String[] args){
        TestRecursiveSum sum1 = new TestRecursiveSum();
        System.out.println(sum1.sum(10));
    }
}
