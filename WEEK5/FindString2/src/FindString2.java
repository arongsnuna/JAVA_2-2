public class FindString2 {
    public static void main(String[] args){
        String [] cities={"New York", "Beijing", "Seoul"};
        boolean found = false;
        int index = 0;
        for (String city : cities){
            if(city.equals("Seoul")){
                System.out.printf("%d번째 %s 있다\n", index, cities[index]);
                found = true;
            }
            index++;
        }
        if (found=false){System.out.println("Seoul not found!");}
    }
}
