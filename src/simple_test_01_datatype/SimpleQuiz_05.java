package simple_test_01_datatype;

public class SimpleQuiz_05 {
    public static void main(String[] args) {

        /*
        * 다음과 같은 문자열 a:b:c:d가 있다. 문자열의 replace 함수를 사용하여 a#b#c#d로 바꿔서 출력해 보자.
        *  a = "a:b:c:d"
        */

        String a = "a:b:c:d";
        String b = a.replaceAll(":", "#");
        System.out.println(b);

    }
}
