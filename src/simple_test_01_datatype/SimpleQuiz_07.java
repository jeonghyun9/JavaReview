package simple_test_01_datatype;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleQuiz_07 {
    public static void main(String[] args) {

        /*
        *  다음과 같은 ['Life', 'is', 'too', 'short'] 리스트를
        *   "Life is too short" 문자열로 만들어 출력해 보자.
        *
        *   ※ 문자열의 join 메소드를 사용해 보자.
        */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Life","is","too","short"));
        String a = String.join(" ",list);
        System.out.println(a);
    }
}
