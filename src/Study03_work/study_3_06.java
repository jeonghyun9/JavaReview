package Study03_work;

public class study_3_06 {
    public static void main(String[] args) {

        printFactorial(4);

    }

    public static void printFactorial(int n){

//        int n = 0;
//        int sum = 0;
//        for (int i = 1; i <= x; i++) {
//            n = i;
//        }
//        System.out.printf("%d! = %d x %d x %d x %d = %d",n,n,n-1,n-2,n-3,sum);
        int result = 1;
        System.out.printf("%d! = ", n);
        for (int i = n; i > 0; i--) {
            System.out.printf("%d", i);
            result *= i; // 해당 라인을 수정하세요.
            if (i != 1) {
                System.out.printf(" x ");
            }
        }
        System.out.printf(" = %d\n", result);

    }
}
