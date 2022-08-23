package simple_test_01_datatype;

public class SimpleQuiz_02 {
    public static void main(String[] args) {

        /*
         * 자연수 13이 홀수인지 짝수인지 판별
         */

        int n = 13;

        System.out.println(solution(n));

    }

    public static String solution(int i) {
        if (i % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }
}


