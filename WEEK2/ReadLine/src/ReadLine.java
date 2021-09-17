import java.util.Scanner;

public class ReadLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.printf("입력한 문자열은 \"%s\"이다.", s);
    }
}
