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
        Student student1 = new Student();
        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        student1.setId(sc.nextInt());
        student1.setName(sc.next());
        student1.setMajor(sc.next());
        student1.setPhone(sc.nextLong());
        String firPhone1 = Long.toString(student1.getPhone()).substring(0,2);
        String secPhone1 = Long.toString(student1.getPhone()).substring(2,6);
        String thrPhone1 = Long.toString(student1.getPhone()).substring(6);

        Student student2 = new Student();
        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        student2.setId(sc.nextInt());
        student2.setName(sc.next());
        student2.setMajor(sc.next());
        student2.setPhone(sc.nextLong());
        String firPhone2 = Long.toString(student2.getPhone()).substring(0,2);
        String secPhone2 = Long.toString(student2.getPhone()).substring(2,6);
        String thrPhone2 = Long.toString(student2.getPhone()).substring(6);

        Student student3 = new Student();
        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        student3.setId(sc.nextInt());
        student3.setName(sc.next());
        student3.setMajor(sc.next());
        student3.setPhone(sc.nextLong());
        String firPhone3 = Long.toString(student3.getPhone()).substring(0,2);
        String secPhone3 = Long.toString(student3.getPhone()).substring(2,6);
        String thrPhone3 = Long.toString(student3.getPhone()).substring(6);
        System.out.printf("\n입력된 학생들의 정보는 다음과 같습니다.\n");
        System.out.printf("첫번째학생: %d %s %s %03d-%s-%s\n", student1.getId(), student1.getName(), student1.getMajor(), Long.parseLong(firPhone1), secPhone1, thrPhone1);
        System.out.printf("두번째학생: %d %s %s %03d-%s-%s\n", student2.getId(), student2.getName(), student2.getMajor(), Long.parseLong(firPhone2), secPhone2, thrPhone2);
        System.out.printf("세번째학생: %d %s %s %03d-%s-%s\n", student3.getId(), student3.getName(), student3.getMajor(), Long.parseLong(firPhone3), secPhone3, thrPhone3);

    }

}
