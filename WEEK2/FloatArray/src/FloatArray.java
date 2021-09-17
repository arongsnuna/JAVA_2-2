public class FloatArray {
    public static void main(String[] args){
        float arr1[] = {1.1f, 2.3f, 4.7f, 7.5f};
        float arr2[] = new float[4];
        arr2[0]=1.1f;
        arr2[1]=2.3f;
        arr2[2]=4.7f;
        arr2[3]=7.5f;
        System.out.printf("%d, %d\n", arr1.length, arr2.length);
        for (int i = 0; i<4; i++){
            System.out.printf("%f, %f\n", arr1[i], arr2[i]);
        }
    }
}
