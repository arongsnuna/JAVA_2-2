class Student{
    String name;
    double gpa;
    int incomeLevel;
    Student(String name, double gpa, int incomeLevel){
        this.name = name;
        this.gpa = gpa;
        this.incomeLevel = incomeLevel;
    }
    String getName(){return name;}
    double getGpa(){return gpa;}
    int getIncomeLevel(){return incomeLevel;}
}
public class TestStudent {
    public static void main(String[] args){
        Student[] Students = new Student[3];

        Students[0] = new Student("김규상", 4.1, 3);
        Students[1] = new Student("김민재", 3.71, 5);
        Students[2] = new Student("김용하", 3.93, 7);

        for (int i = 0; i < 3; i++){
            if (Students[i].getGpa()>=3.5 && Students[i].getIncomeLevel()<=5){
                System.out.printf("%s 학생은 장학생 대상입니다. \n", Students[i].getName());
            }
        }
    }
}
