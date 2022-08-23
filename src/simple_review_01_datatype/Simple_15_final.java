package simple_review_01_datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Simple_15_final {
    public static void main(String[] args) {

        /*
        * final : 자바의 final은 자료혀엥 값을 단 한번만 설정할 수 있게 강제하는 키워드이다.
        *         즉, 값을 한번 설정하면 그 값을 다시 설정할 수 없다.
        */

        final int n = 123;
//        n = 456;  // COMPILE ERORR


        /*
        * List의 경우도 final로 선언시 재할당은 불가능하다.
        * 단, List의 값을 더하거나(add) 빼는 것은(remove) 가능하다. 대신 재할당을 할 수 없다.
        * 만약 재할당도 불가능하게 하고 싶은 경우에는 List.of로 수정이 불가능한 리스트를 생성해야한다.
        */


        // final ArrayList<>

        final ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
//        list = new ArrayList<>(Arrays.asList("D","E","F"));   // COMPILE ERORR
        System.out.println(list);
        list.add("D");
        System.out.println(list);
        list.remove("C");
        System.out.println(list);


        // final List<> list = List.of();

        final List<Integer> arr = List.of(1,3,5,7,9);
//        arr.add(4);   // UnsupportedOperationException 발생



        /*
        * final은 프로그램 수행 도중 그 값이 변경되면 안되는 상황에 사용한다.
        */

    }
}
