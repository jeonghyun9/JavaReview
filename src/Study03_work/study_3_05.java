package Study03_work;

public class study_3_05 {
    public static void main(String[] args) {
/*
        정수 n을 만드는 3가지 정수의 곱 A, B, C를 출력하려 한다.

        이를 위한 메소드 printCombos()을 완성하여 출력 예와 같은 결과를 얻으시오.

        출력 예

        10 = 1 x 1 x 10
        10 = 1 x 2 x 5
        10 = 1 x 5 x 2
        10 = 1 x 10 x 1
        10 = 2 x 1 x 5
        10 = 2 x 5 x 1
        10 = 5 x 1 x 2
        10 = 5 x 2 x 1
        10 = 10 x 1 x 1
                ======================
        경우의 수: 9
        */


        printCombos(10);

    }

    public static void printCombos(int x){
        int result = 0;

        for (int i = 0; i<= x; i++) {
            for (int j = 0; j < x; j++) {
                for (int k = 0; k < x; k++) {
                    if (i * j * k == x) {
                        System.out.printf("%d = %d x %d x %d\n",x,i,j,k);
                        result++;
                    }

                }
            }
        }
        System.out.println("======================");
        System.out.printf("경우의 수: %d\n", result);
    }
}
