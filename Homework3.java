import java.util.Scanner;
import java.util.StringTokenizer;

public class Homework3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("몇 개의 수를 입력할 예정인가요? ");
        int num = sc.nextInt();

        int[] s = new int[num];
        System.out.printf("수를 입력하세요: ");
        for (int i =0; i<num; i++){
            s[i] = sc.nextInt();
        }

        int max = s[0];
        int min = s[0];

        for (int j = 0; j < num; j ++){
            if (s[j] > max){
                max = s[j];
                continue;
            }
        }
        for (int k = 0; k < num; k++){
            if (s[k] < min){
                min = s[k];
                continue;
            }
        }
        System.out.printf("최댓값: %d\n", max);
        System.out.printf("최솟값: %d\n", min);
    }
}
