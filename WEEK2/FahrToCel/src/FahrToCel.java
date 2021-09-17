import java.util.Scanner;

public class FahrToCel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float fahr = sc.nextFloat();
        float cel = ((float)5/9*(fahr-32));
        System.out.printf("화씨온도 %.1f는 섭씨온도 %.1f이다.", fahr, cel);
    }
}
