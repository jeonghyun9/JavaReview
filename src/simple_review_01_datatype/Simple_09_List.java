package simple_review_01_datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Simple_09_List {
    public static void main(String[] args) {

        /*
        *  리스트(List)는 배열가 비슷한 자바의 자료형으로 배열보다 편리한 기능을 가진다.
        *  리스트는 배열과 달리 크기가 정해져있지 않고 동적으로 작동한다. 원하는 만큼 값을 담을 수 있다.
        *  따라서 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는 것이 유리하다.
        */

        // 1. ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("138");
        list.add("129");
        list.add("143");
        System.out.println(list.get(1));  // 129
        System.out.println(list);  // [138, 129, 143]


        // 1-1. .get()
        // List의 특정 위치값을 뽑아낼때 사용한다.
        // 또한 위와 달리 add(위치, 값) 을 지정해서 원하는 값을 원하는 위치에 삽입 할 수 있다.
        // 기존 값은 삽입 된 위치에서 1칸 뒤로 밀려난다.
        list.add(1, "199");
        System.out.println(list.get(1)); // 199
        System.out.println(list);  //  [138, 199, 129, 143]


        // 1-2. .size()
        // List의 갯수를 리턴한다.

        List li = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            li.add(i, i+"값");
        }
        System.out.println(li.size()); // 10
        System.out.println(li);


        // 1-3. .contains()
        // contains 메소드는 리스트 안에 해당 항목이 있는지 판별하여 그 결과를 boolean으로 리턴한다.
        System.out.println(li.contains("2값"));  // true
        System.out.println(li.contains("11값"));  // false


        // 1-4. .remove()
        // remove 메소드에는 2가지 방식이 있다. (이름은 같지만 입력파라미터가 다른다.)

            // remove(객체);
            // 객체에 해당하는 항목을 삭제하고 삭제한 결과를 Boolean으로 리턴
            System.out.println(li.remove("3값")); // true

            // remove(인덱스);
            // 인덱스에 해당하는 항목을 삭제하고 삭제된 항목을 리턴
            System.out.println(li.remove(2)); // 2값



        // 2. 다양한 방법으로 ArrayList 만들기

        // 2-1. Arrays.asList()

        // Arrays.asList를 사용하면 이미 존재하는 문자열 배열을 ArrayList에 담을 수 있다.
        String[] str = {"Hi", "Hello", "안녕", "Bye", "굳!"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str));
        System.out.println(list1);

        // Arrays.asList로 직접 값들을 담을 수도 있다.
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        System.out.println(list2);


        System.out.println("=============================================");

        // 2-2. String.join()

        /*
         *  위에서 [Hi, Hello, 안녕, Bye, 굳!] 요소들이 있는 리스트를 만들었다.
         *  그리고 이렇게 만들어진 리스트의 각 요소를 ,로 구분하여 하나의 문자열로 만드는 방법이 있다.
         *  ex) Hi, Hello, 안녕, Bye, 굳!
         */

        // String.join 사용 X
        ArrayList<String> lii = new ArrayList<>(Arrays.asList(str));
        String result = "";
        for (int j = 0; j < lii.size(); j++) {
            result += lii.get(j); // 값을 추가
            result += ","; // 콤마 추가
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);

        System.out.println("=============================================");

        // String.join 사용 O
        ArrayList<String> li2 = new ArrayList<>(Arrays.asList(str));
        String result2 = String.join(",", li2);
        System.out.println(result2);




        // 3. 리스트 정렬하기

        // 3-1. sort()

        /*
        * ~~.sort(Comparator.naturalOrder())  :  오름차순으로 정렬하기
        * ~~.sort(Comparator.reverseOrder())  :  내림차순으로 정렬하기
        */

        ArrayList<Integer> li3 = new ArrayList<>(Arrays.asList(138,129,142));

        li3.sort(Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println(li3);  // 129, 138, 142

        li3.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println(li3);  // 142, 138, 129






    }
}
