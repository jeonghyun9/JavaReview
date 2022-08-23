package simple_review_01_datatype;

import java.util.ArrayList;

public class Simple_10_Generics {
    public static void main(String[] args) {

        // 1. 제네릭스(Generics)

        /*
         *  제네릭스는  "ArrayList<String> list = new ArrayList<>();" 에서
         *  <String> 을 말한다.
         *  이것은 객체 안에 넣을 수 있는 타입을 지정하는 것이다.
         *  <String> 이 적혀있으면 List 안에는 문자열만 넣을 수 있다.
         *
         *  제네릭스로 지정할 수 있는 타입은 다양하다.
         *  <Interger>, <Double>, <class>, ...
         *
         *  제네릭스를 지정하지 않고 사용시 타입에 상관없이 값을 List에 넣을 수 있지만
         *  추후 값을 추출할때 캐스팅(casting)을 해줘야 한다.
         */

        ArrayList list = new ArrayList<>();
        list.add("32");
        list.add(551);
        list.add(220.450);

        // int i = list.get(1);  //  Error
        int i = (Integer) list.get(1); // casting OK
        System.out.println(i); // 551




    }
}
