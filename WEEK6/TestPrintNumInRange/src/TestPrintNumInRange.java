import java.util.Scanner;

class PrintNumInRange{
    int num;
    Scanner sc;
    PrintNumInRange(Scanner sc){this.sc = sc;}
    void SystemInInt(Scanner sc){
        int a = sc.nextInt();
        num = a;
    }
    Boolean affirmRange(int a, int b){
        if (num >= a && num <= b ){ return true;}
        else { return false;}
    }
    void printInt(){System.out.println(num);}
}
public class TestPrintNumInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintNumInRange num = new PrintNumInRange(sc);
        num.SystemInInt(sc);
        if (num.affirmRange(1,100)){
            num.printInt();
        }
        else {
            System.out.printf("1~100 범위 밖 정수가 입력되었습니다.\n");
        }

    }
}
