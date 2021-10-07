import java.util.Scanner;
public class MovieTicketPriceWithSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("prime, standard, economy 중 한가지를 입력하세요: ");
        String ticket = sc.next();
        switch (ticket){
            case "prime":
                System.out.println("prime 좌석의 가격은 11000원입니다.");
                break;
            case "standard":
                System.out.println("standard 좌석의 가격은 10000원입니다.");
                break;
            case "economy":
                System.out.println("economy 좌석의 가격은 9000원입니다. ");
                break;
            default:
                System.out.println("좌석 종류를 잘못 입력했습니다. ");
                break;
        }
    }
}
