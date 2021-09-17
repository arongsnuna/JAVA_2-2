import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        System.out.printf("입력한 문자열은 '%s'이다.\n",line);
        int num = sc.nextInt();
        System.out.printf("입력한 정수는 '%d'이다.",num);
    }
}
