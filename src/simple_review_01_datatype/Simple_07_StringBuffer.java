package simple_review_01_datatype;

public class Simple_07_StringBuffer {
    public static void main(String[] args) {

        /*
        * StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.
        */

        // 1. append
        // append(추가할 값);

        StringBuffer sb = new StringBuffer();
        sb.append(4);
        sb.append("관");
        sb.append("문");
        sb.append(" ");
        sb.append("어려웡");
        sb.append(" !");
        String s = sb.toString();
        System.out.println(s);  // 4관문 어려웡 !


        String result = "";
        result += "4관문";
        result += " ";
        result += "어려웡";
        result += " !";
        System.out.println(result);

        /*
        * 위 두 경우는 결과가 동일하지만 내부적으로 객체가 생성되고 메모리가 사용되는 과정은 다르다.
        *
        *  StringBuffer의 경우 객체는 한번 생성되지만 String 메모리 사용량도 많고 속도도 느리다.
        *    따라서 문자열의 추가나 변경등의 작업이 많을 경우 StringBuffer를, 아닐 경우는 String을 사용하는 것이 좋다.
        *
        *  String 자료형은 한번 값이 생성되면 변경할 수 없다.(immutable) 하지만 StringBuffer은 가능하다.
        */

        System.out.println("================ append End =================");

        // 2. insert()
        // insert 메소드는 특정 위치에 원하는 문자열을 삽입할 수 있다.
        // insert(위치값, "추가할 값")

        StringBuffer str = new StringBuffer();
        str.append("Jump To Java");
        str.insert(0, "Hi ");
        System.out.println(str.toString());  // Hi Jump To Java
        System.out.println(str);

        System.out.println("================ insert End =================");

        // 3. substring()
        // substring 메소드는 String 자료형의 substring 메소드와 동일하게 사용된다.

        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello Jump to Java");
        System.out.println(sb1.substring(0,4)); // Hell


        System.out.println("================ substring End =================");

        // 4. StringBuilder()
        // StringBuilder는 StringBuffer와 비슷한 자료형이다. 사용법은 StringBuffer와 동일하다.

        StringBuilder sb2 = new StringBuilder();
        sb2.append("하이 헬로우 안녕");
        System.out.println(sb2.toString());

        System.out.println("================ StringBuilder End =================");
    }
}
