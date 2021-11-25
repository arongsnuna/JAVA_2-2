import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Map<String, String> idMap = new HashMap<>();
        idMap.put("myId", "myPass");
        idMap.put("myId2", "myPass2");
        idMap.put("myId3", "myPass3");
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.printf("id와 password를 입력해주세요.\nid: ");
        String id = sc.next();
        for (Map.Entry<String, String> entry : idMap.entrySet()){
            if (entry.getKey().equals(id)){
                check = true;
                System.out.printf("password: ");
                String pw = sc.next();
                if (entry.getValue().equals(pw)){
                    System.out.println("id와 비밀번호가 일치합니다.");
                }
                else{System.out.println("id와 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");}
            }
        }
        if (!check){System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");}
    }
}