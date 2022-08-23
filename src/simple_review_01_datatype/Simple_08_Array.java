package simple_review_01_datatype;

public class Simple_08_Array {
    public static void main(String[] args) {

        /*
        *  int[] odds = {1, 3, 5, 7, 9};
        *  String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        *
        *  배열(Array)이란 자료형의 종류가 아닌 자료형의 집합을 의미한다.
        */

        // 1. 배열의 길이는 고정되어 있다.

        String[] weeks = new String[7];  // 초기 길이값을 설정해줘야 한다. 0~6
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";


        // 2. 배열의 길이

        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }


        // 3. 빈번한 배열의 오류

        /*
        *  "ArrayIndexOutOfBoundsException"
        *
        *  ex) System.Out.println(weeks[7]);
        *  배열의 8번째 값이 없으므로 ArrayIndexOutOfBoundsException 오류가 발생한다.
        */
    }
}
