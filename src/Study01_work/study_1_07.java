package Study01_work;

public class study_1_07 {

    public static void main(String[] args) {

        /*

        두 수의 곱과 몫

            문제

              두 개의 정수 a, b를 입력 받아 곱과 몫을 출력하시오.

            입력 예

                24 6


            출력 예

                곱하기: 24 x 6 = 144
                나누기: 24 / 6 = 4

            */

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int x = a * b;
        int y = a / b;

        System.out.printf("곱하기: %d x %d = %d\n", a,b,x);
        System.out.printf("나누기: %d / %d = %d", a,b,y);

    }
}
