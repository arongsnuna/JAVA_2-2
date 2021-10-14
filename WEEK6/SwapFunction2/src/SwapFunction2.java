public class SwapFunction2 {
    static void Swap2(int[] a, int[] b){
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
        System.out.printf("AFTER swapping\n a= %d b= %d\n", a[0], b[0]);
    }
    public static void main(String[] args){
        int[] x = {10};
        int[] y = {20};
        System.out.printf("BEFORE swapping\n a= %d b= %d\n", x[0], y[0]);
        Swap2(x, y);
    }
}
