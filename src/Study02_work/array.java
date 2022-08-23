package Study02_work;

public class array {
    public static void main(String[] args) {
        // 배열 생성
        double[] grades = {3.45, 2.82, 3.85, 3.94};

        /* 2. 적절한 출력을 만드시오. */
        for (int i = 0; i < grades.length; i++) {

            System.out.printf("%d학년: %.2f\n", i+1 , grades[i]);
        }
    }
}
