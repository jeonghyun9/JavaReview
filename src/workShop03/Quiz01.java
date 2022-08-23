package workShop03;

public class Quiz01 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("sum="+Sum(arr));
        System.out.println("sum="+Avg(arr));
    }


    static int Sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    static int Avg(int[] b) {
        int avg = Sum(b)/b.length;
        return avg;
    }
}
