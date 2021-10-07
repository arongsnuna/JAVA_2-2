import java.util.Scanner;
public class InputInt {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.printf("정수 입력: ");
            num = sc.nextInt();
            if (num == 0){continue;}
            else {
                System.out.println(num);
            }
        }while (num < 100);
    }
}
