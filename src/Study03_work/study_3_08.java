package Study03_work;

public class study_3_08 {
    public static void main(String[] args) {
        /*
        F0 = 0
        F1 = 1
        Fn = Fn-2 + fn-3(n>=2)
        */

        // 배열 생성
        int[] fibo = new int[10];

        // 피보나치 배열 작성
        writeFibonacci(fibo);

        // 결과 출력
        printFibonacci(fibo);
    }

    // 입력받은 정수형 배열을 피보나치 수열로 채움
    public static void writeFibonacci(int[] arr) {
        // 피보나치 배열 초기값 설정
        arr[0] = 0;
        arr[1] = 1;

        // 나머지 배열 작성
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2]+arr[i-1];
        }
    }

    // 입력받은 정수형 배열을 출력
    public static void printFibonacci(int[] arr) {
        System.out.printf("피보나치 수열: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d",arr[i]);
            if (i != arr.length - 1) {
                System.out.printf(", ");
            }
        }
        System.out.printf(" ]");
    }

}

