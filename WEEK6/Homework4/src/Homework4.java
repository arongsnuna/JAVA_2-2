import java.util.Scanner;
public class Homework4 {
    int gcd(int m, int n){
        if (m==0) return m;
        else if (m%n ==0) return n;
        else return gcd(n, m%n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Homework4 gcdTest = new Homework4();
        System.out.printf("두 수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d 입니다. \n", gcdTest.gcd(num1,num2));

    }
}
