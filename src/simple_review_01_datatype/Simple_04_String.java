package simple_review_01_datatype;

public class Simple_04_String {
    public static void main(String[] args) {

        // 1. 문자열
//        String a = "Happy Java";
//        String b = "a";
//        String c = "123";
        String a = new String("Happy Java");
        String b = new String("a");
        String c = new String("123");

        /*
        * 위 두 방식은 값은 같지만 완전히 동일하지는 않다.
        * 첫번째 방식은 리터럴 표기라고 하는데 객체 생성 없이 고정된 값을 그대로 대입하는 방법이다.
        * 두번째 방식은 항상 새로운 String 객체를 만드는 방법이다.
        */

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        System.out.println("===========================");

        // 2. 원시 자료형 (Primitive)

        /*
        * int, long, double, float, boolean, char 등을 원시 자료형이라고 한다.
        * 원시(Primitive) 자료형은 new 키워드로 값을 생성할 수 있다.
        * Primitive 자료형은 다음과 같이 리터럴로만 값을 세팅할 수 있다.
        */

        boolean result = true;
        char capitalC = 'c';
        int i = 100000;


        /*
        * 단, Integer, Long, Double, Float, Boolean, Char, String 등은 원시 자료형이 아니다.
        * 앞으로 공부할 ArrayList, HashMap, HashSet 등은 이런 Wrapper 클래스들을 사용해야 한다.
        * Wrapper 클래스를 사용하면 값 대신 객체를 주고받을 수 있다.
        * 이렇게 하면 코드를 객체 중심적으로 작성하는데 유리하다.
        * 또한 멀티스레딩 환경에서 동기화를 지원하기 위해서는 Wrapper 클래스가 반드시 필요하다.
        */

        System.out.println("===========================");

        // 3. 문자열 내장 메소드

        // 3-1. equals
        // 문자의 값을 비교할 때에는 반드시 equals를 사용해야 한다.
        String x = "hello";
        String y = "java";
        String z = "hello";
        System.out.println(x.equals(y));  // false
        System.out.println(x.equals(z));  // true

        // == 연산자로 비교 할 시에는 다음과 같은 경우가 발생할 수 있다.
        String s = "hello";
        String s1 = new String("hello");
        System.out.println(s.equals(s1));  // true
        System.out.println(s==s1);  // false

        /*
        * s와 s1은 값은 같지만 서로 다른 객체이다.
        * ==는 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이다.
        * 때문에 위의 경우에 false를 반환하게 된다
        */

    }
}
