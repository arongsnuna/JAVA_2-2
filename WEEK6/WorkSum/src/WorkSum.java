class Sum1{
    int num;
    int sum = 0;
    int add(int num){
        if (num < 50){ return sum;}
        else if (num > 100) {
            sum += num;
            getSum();
            return sum;
        }
        else {
            getSum();
            return sum;
        }

    }
    void getSum(){System.out.println(sum);}
}
public class WorkSum {
    public static void main(String[] args){
        Sum1 s = new Sum1();
        s.add(101); //101
        System.out.println("a");
        s.add(51); //101
        System.out.println("a");
        s.add(50); //x
        System.out.println("a");
        s.getSum();//101
    }
}
