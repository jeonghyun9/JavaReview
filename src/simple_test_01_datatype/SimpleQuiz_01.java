package simple_test_01_datatype;

public class SimpleQuiz_01 {
    public static void main(String[] args) {

        /*
        * 홍길동 씨의 과목별 점수는 다음과 같다. 홍길동 씨의 평균 점수를 구해보자.
        *
        *   과목    점수
        *   ===========
        *   국어    80
        *   영어    75
        *   수학    55
        */

        String name = "홍길동";
        int korean = 80;
        int english = 75;
        int math = 55;

        System.out.printf("%s의 평균점수 : %d",name, (korean+english+math)/3);


    }
}
