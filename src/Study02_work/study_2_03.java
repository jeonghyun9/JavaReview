package Study02_work;

public class study_2_03 {

    public static void main(String[] argument){
        /*
        칼로리 소모량은?
        문제
        한 걸음을 걸을 때마다 0.02 kcal가 소모된다. 하루 동안 5000걸음을 걸었을 때, 소모된 칼로리량을 계산하는 프로그램을 작성하시오.

        출력 예
        소모 칼로리: 100.0 kcal
        */
        int walk = 5000;
        Calc(walk);

        System.out.printf("소모 칼로리: %.1f kcal", Calc(walk));

    }

    public static double Calc(int n){
        double diet = 0.02;
        double result = diet*n;

        return result;
    }

}
