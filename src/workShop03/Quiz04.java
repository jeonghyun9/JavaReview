package workShop03;

public class Quiz04 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};


        for (int i = arr.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.printf("%d ", arr[i]);
            } else {
                System.out.printf("%d",arr[i]);
            }

        }
    }
}
