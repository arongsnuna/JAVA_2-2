class Subway {
    int line;
    void run(){
        System.out.printf("Line %d runs.\n", line);
    }
    void setLine(int d){line = d;}
}
public class TestSubway{
    public static void main(String[] args){
        Subway mySub = new Subway();
        mySub.setLine(3);
        mySub.run();
    }
}
