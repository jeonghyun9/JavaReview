package Study03_work;

public class study_3_09 {
    public static void main(String[] args) {

        String[] name = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
        int[] score = {65, 74, 23, 75, 68, 96, 88, 98, 54};

        int i = topIndex(score);

        // 결과 출력
        System.out.printf("1등: %s(%d점)\n", name[i], score[i]);

    }

    public static int topIndex(int[] arr) {
        int top = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[top]) {
                top = i;
            }

        }
        return top;
    }
}
