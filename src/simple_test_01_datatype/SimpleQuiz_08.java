package simple_test_01_datatype;

import java.util.HashMap;

public class SimpleQuiz_08 {
    public static void main(String[] args) {

        /*
        * 다음의 맵 grade에서 "B'에 해당되는 값을 추출해 보자.
        * (추출하고 나면 grade에는 "B"에 해당하는 아이템이 사라져야 한다.)
        */

        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        System.out.println(grade);
        System.out.println(grade.remove("B"));
        System.out.println(grade);
    }
}
