package workShop03;

public class Quiz02 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        sum(arr);
    }

    static void sum(int[] a) {
        int n = 0;
        for (int i = 1; i < a.length; i+=2) {
            n += a[i];
        }
        System.out.println("sum="+n);
    }
}
