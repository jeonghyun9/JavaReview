package simple_test_01_datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SimpleQuiz_06 {
    public static void main(String[] args) {

        /*
        *   다음과 같은 [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 만들어 보자.
        */

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력

        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);


    }
}
