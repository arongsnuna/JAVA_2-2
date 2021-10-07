import java.util.Scanner;
class Student {
    int id;
    String name;
    String major;
    long phone;

    void setId(int a){ id = a;}
    void setName(String b){ name = b;}
    void setMajor(String c){ major = c;}
    void setPhone(long d){ phone = d;}

    int getId(){return id;}
    String getName(){return name;}
    String getMajor(){return major;}
    long getPhone(){return phone;}
}
public class Homework2 {
    public static void main(String[] args) {
        Student[] Students = new Student[3];

        Scanner sc = new Scanner(System.in);
        Students[0] = new Student();
        Students[1] = new Student();
        Students[2] = new Student();

        for (int i = 0; i<3; i++){
            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            Students[i].setId(sc.nextInt());
            Students[i].setName(sc.next());
            Students[i].setMajor(sc.next());
            Students[i].setPhone(sc.nextLong());

        }
        System.out.printf("\n입력된 학생들의 정보는 다음과 같습니다.\n");
        for (int j = 0; j<3; j++){
            System.out.printf("첫번째학생: %d %s %s %03d-%s-%s\n", Students[j].getId(), Students[j].getName(), Students[j].getMajor(),
                    Long.parseLong(Long.toString(Students[j].getPhone()).substring(0,2)), Long.toString(Students[j].getPhone()).substring(2,6), Long.toString(Students[j].getPhone()).substring(6));
        }


    }

}
