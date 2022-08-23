package simple_test_01_datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SimpleQuiz_09 {
    public static void main(String[] args) {

        /*
        * 다음의 numbers 리스트에서 중복 숫자를 제거해 보자.
        */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        HashSet<Integer> set = new HashSet<>(numbers);
        System.out.println(set);
    }
}
