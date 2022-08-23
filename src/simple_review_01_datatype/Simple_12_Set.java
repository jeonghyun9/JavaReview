package simple_review_01_datatype;

import java.util.Arrays;
import java.util.HashSet;

public class Simple_12_Set {
    public static void main(String[] args) {


        // 1. Set의 특징과 사용

        /*
        * Set이란 집합자료형이다. 집합자료형은 집합과 관련된 것을 쉽게 처리하기 위해 만들어진 자료형이다.
        * Set의 자료형으로는 HashSet, TreeSet, LinkedHashSet 등이 있다.
        */

        HashSet<String> set = new HashSet<>(Arrays.asList("H", "E", "L", "L", "O"));
        System.out.println(set);  //  [E, H, L, O]

        /*
        * 위와 같은 HashSet을 만들었을때 HashSet의 특징이 잘 나타난다.
        * 첫번째로 중복이 없다. asList로 HELLO의 각 알파벳을 담았지만 L이 하나 빠진 HELO가 출려되었다.
        * 두번째로 순서가 없다. 입력된 순서대로 출력되는 것이 아닌 뒤죽박죽으로 출력된다.
        * 따라서 HashMap과 같이 Key값을 기반으로 Value값을 찾아간다.
        *
        * Set(집합자료형)은 교집합, 합집합, 차집합 등을 구할 때 아주 유용하다.
        */


        // 2. HashSet을 통해 집합 구해보기
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

            // 2-1. 교집합
            HashSet<Integer> interection = new HashSet<>(s1); // s1값 받아오기
            interection.retainAll(s2);  // 교집합 수행. s1과 s2의 중복데이터 추출
            System.out.println(interection);  //  [4, 5, 6]


            // 2-2. 합집합
            HashSet<Integer> add = new HashSet<>(s1);
            add.addAll(s2);  // 합집합 수행. s1과 s2의 데이터를 합침(중복데이터가 있으면 버림)
            System.out.println(add);  //  [1, 2, 3, 4, 5, 6, 7, 8, 9]


            // 2-3. 차집합
            HashSet<Integer> remove = new HashSet<>(s1);
            remove.removeAll(s2); // 차집합 수행. s1과 s2의 중복된 데이터 제거
            System.out.println(remove);  //  [1, 2, 3]



        // 3. Set(집합자료형)의 메소드
        HashSet<String> hashSet = new HashSet<>();


            // 3-1. add(value)
            // 각 값 추가하기
            hashSet.add("Jump");
            hashSet.add("To");
            hashSet.add("Java");

            System.out.println(hashSet);  //  [Jump, To, Java]


            // 3-2. addAll(objecta) ||  addAll(Arrays.asList(Value, Value, ...))
            // 여러개의 값 한번에 추가하기
            HashSet<String> hashSet1 = new HashSet<>();
            hashSet1.addAll(Arrays.asList("Java","To","Hello"));
    //        hashSet1.addAll(hashSet);
            System.out.println(hashSet1);   //  [Java, Hello, To]


            // 3-3. remove()
            // 값 제거하기
            HashSet<String> hashSet2 = new HashSet<>(hashSet1);
            hashSet2.remove("To");
            System.out.println(hashSet2);   //  [Java, Hello]


            // 3-4. removeAll(Object)  ||  removeAll(Arrays.asList(Value, Value, ...))
            // 값 여러개 제거하기
            HashSet<String> hashSet3 = new HashSet<>(hashSet1);
    //        hashSet3.removeAll(hashSet1);
            hashSet3.removeAll(Arrays.asList("To", "Hello"));
            System.out.println(hashSet3);   //  [Java]
    }
}
