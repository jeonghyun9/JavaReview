package simple_review_01_datatype;

import java.util.HashMap;
import java.util.Map;

public class Simple_11_Map {
    public static void main(String[] args) {

        /*
        * Map은 Map(Key,Value)의 형태로 사용한다.
        * List의 List(Index, Value)와 유사하다. 아님말고.
        *
        * ex) people : 사람 , Baseball : 야구, Fish : 물고기, ... 처럼 쌍으로 갖는 자료형.
        *
        * 단, 배열이나 리스트처럼 값을 순차적으로 구하지 않으며 Key를 통해 Value로 바로 이동하는 것이다.
        * Swich/case와 유사
        *
        * Map의 종류로는 HashMap, TreeMap, LinkedHashMap 등이 있다.
        * */

        // 1. HashMap

        // 1-1. put(Key, Value)
        // put을 이용해 map에 데이터 삽입.
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "RJH");
        map.put("age", "31");
        map.put("addr", "seoul");

        System.out.println(map);  // { name = RJH, addr = seoul, age = 31 }

        /*
        * HashMap은 순서가 지켜지지 않는다.
        */


        // 1-2. get(Key)
        // Key를 이용해 Value를 추출.
        System.out.println(map.get("age"));
        System.out.println(map.get("name"));


        // 1-3. getOrDefault
        // 맵에 Key에 해당하는 value가 없을 경우 get()메소드를 사용하면 null이 리턴된다.
        System.out.println(map.get("Gu"));  // null
        // 따라서 null 대신 디폴트 값을 얻고 싶은 경우에는 getOrDefault() 메소드를 사용한다.
        System.out.println(map.getOrDefault("Gu","강서구"));  // 강서구


        // 1-4. containsKey(Key), containsValue(Value)
        // containsKey 메소드는 Map에 해당 Key가 있는지를 조사하여 그 값을 boolean 타입으로 리턴한다.
        System.out.println(map.containsKey("name"));  // true
        System.out.println(map.containsKey("gu"));  // false
        // containsValue 메소드는 Map에 해당 Value가 있는지를 조사하여 그 값을 boolean 타입으로 리턴한다.
        System.out.println(map.containsValue("gg")); // false
        System.out.println(map.containsValue("RJH")); // true



        // 1-5. remove(key) or remove(Key, Value)
        // remove 메소드는 Map의 항목을 삭제하는 메소드이다. Key값에 해당되는 아이템(Key,Value)를 삭제한 후
        // 삭제한 Value값을 리턴한다.
        System.out.println(map.remove("addr"));  // seoul
        System.out.println(map);  //  { name = RJH, age = 31 }



        // 1-6. size()
        // size 메소드는 Map의 아이템 갯수를 리턴한다.
        System.out.println(map.size());  //  2


        // 1-7. keySet()
        // keySet 메소드는 Map의 모든 Key를 모아서 리턴한다. List로 만들 수 있다.
        System.out.println(map.keySet());  //  [name, age]

        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map2.put(i, i*10);
        }
        System.out.println(map2);  //  {0=0, 1=10, 2=20, 3=30, 4=40, 5=50, 6=60, 7=70, 8=80, 9=90}
        System.out.println(map2.keySet());  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


        // 1-8. entrySet()
        // entrySet 메소드는 Map에 Key, Value를 리턴한다. 이것을 가지고 List를 만들 수 있다.
        System.out.println(map.entrySet());


        // 1-9. clear()
        // Map안의 모든 아이템을 제거한다.
        System.out.println("before : " +map);
        map.clear();
        System.out.println("after : " +map);


        // 2. TreeMap

        /*
        TreeMap은 이진트리를 기반으로 한 Map 컬렉션이다.
        입력된 Key의 오름차순 순서로 데이터를 저장하는 특징을 가지고있다.
        메소드 사용법은 HashMap과 동일하게 사용한다.
        */



        // 3. LinkedHashMap

        /*
        LinkedHashMap은 HashMap과 달리 put을 통해 입력된 순서대로 Key의 순서가 보장된다.
        사용법은 HashMap과 동일하다.
        */



    }
}
