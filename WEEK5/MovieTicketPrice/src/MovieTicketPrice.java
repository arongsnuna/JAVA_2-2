import java.util.Scanner;

import static java.lang.Boolean.TRUE;

public class MovieTicketPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("prime, standard, economy 중 한 가지를 입력하시오 : ");
        String zone = sc.next();

        if (zone.equals("prime")== TRUE ) System.out.println("프라임 존 표 값은 11000원입니다. ");
        else if (zone.equals("standard")==TRUE) System.out.println("스탠다드 존 표 값은 10000원입니다. ");
        else if (zone.equals("economy")==TRUE) System.out.println("이코노미 존 표 값은 9000원입니다. ");
        else System.out.println("좌석 종류를 잘못 입력했습니다. ");
    }
}
