package Study03_work;

public class study_3_03 {
    public static void main(String[] argument){

        /*
        길이가 N+1인 두 정수 배열 A와 B가 있다.

        int[] A = { a0, a1, ... , aN };
        int[] B = { b0, b1, ... , bN };
        위 두 배열을 아래와 같은 방식으로 합쳐 새로운 배열 C를 만들려 한다.

        int[] C = { a0, b0, a1, b1, ... , aN, bN };
        이를 위한 메소드 merge()를 완성하고, 출력 예와 같은 결과를 얻으시오.

        출력 예
        결과: 0 1 2 3 4 5 6 7 8 9
        */

        int A[] = {0, 2, 4, 6, 8};
        int B[] = {1, 3, 5, 7, 9};
        int result[] = merge(A,B);

        System.out.printf("결과: ");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", result[i]);
        }


    }

    public static int[] merge(int[] x, int[] y){
        int[] result = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {

            result[i*2+1] = y[i];
            result[i*2] = x[i];

        }


        return result;
    }
}
