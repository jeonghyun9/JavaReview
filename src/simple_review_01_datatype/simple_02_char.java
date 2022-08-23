package simple_review_01_datatype;

public class simple_02_char {
    public static void main(String[] args) {

        /*
        * 한 개의 문자 값에 대한 자료형은 char를 이용한다.
        * 주의할 점은 문자값을  ''로 감싸주어야 한다.(작은따옴표만!)
        * 사실 거의 사용되지 않는다.
        */

        char a1 = 'a';  // 문자로 표현
        char a2 = 97; // 아스키코드로 표현
        char a3 = '\u0061'; // 유니코드로 표현

        System.out.println(a1);  // a
        System.out.println(a2);  // a
        System.out.println(a3);  // a
    }
}
