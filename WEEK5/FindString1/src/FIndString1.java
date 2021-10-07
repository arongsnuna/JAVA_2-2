public class FIndString1 {
    public static void main(String[] args){
        String[] place = {"New York", "Beijing", "Seoul"};
        boolean found = false;
        for (int i = 0; i < place.length; i++){
            if (place[i]=="Seoul"){
                System.out.printf("%d번째 %s 있다.\n", i, place[i]);
                found = true;
                break;
            }
        }
        if (found == false) {System.out.println("Seoul not found!");}
    }
}
