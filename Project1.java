import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        System.out.printf("단어/문장을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String noSpaceStr = str.replace(" ", "");
        int len = noSpaceStr.length();

        String reverseStr = "";
        for (int i = len - 1; i >= 0; i--) {
            reverseStr += noSpaceStr.charAt(i);
        }

        for (int j = 0; j < len; j++){
            if (noSpaceStr.charAt(j)==reverseStr.charAt(j)){
                if (j == len-1){
                    System.out.printf("회문입니다.\n");
                    break;
                } else {
                    continue;
                }
            }else{
                System.out.printf("회문이 아닙니다.\n");
                break;
            }
        }
    }
}
