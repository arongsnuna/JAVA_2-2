public class StringArray {
    public static void main(String[] args){
        String[] browsers1 = {"Google Chrome", "Microsoft Edge", "Mozilla Firefox", "Naver Whale"};
        String[] browsers2 = new String[4];
        browsers2[0]="Google Chrome";
        browsers2[1]="Microsoft Edge";
        browsers2[2]="Mozilla Firefox";
        browsers2[3]="Naver Whale";
        System.out.println("browsers1 출력");
        for (int i=0; i<4; i++){
            System.out.printf("%s 문자열의 길이: %d\n", browsers1[i], browsers1[i].length());
        }
        System.out.println("browsers2 출력");
        for (int i=0; i<4; i++){
            System.out.printf("%s 문자열의 길이: %d\n", browsers2[i], browsers2[i].length());
        }
    }
}
