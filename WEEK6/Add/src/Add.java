public class Add {
    int add(int num1, int num2){ return num1 + num2;}
    double add(double dou1, double dou2){return dou1+dou2;}
    String add(String s1, String s2){return s1 + ' '+s2;}
    public static void main(String[] args){
        Add a = new Add();
        String newStr = a.add("hello", "world");
        int sumInt = a.add(5,3);
        double sumDouble = a.add(5.1, 3.5);
        System.out.printf("newStr = %s\n", newStr);
        System.out.printf("sumInt = %d\n", sumInt);
        System.out.printf("sumDouble = %f\n", sumDouble);
    }
}
