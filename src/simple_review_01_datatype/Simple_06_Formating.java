package simple_review_01_datatype;

public class Simple_06_Formating {
    public static void main(String[] args) {

        /*
        * 문자열 포매팅이란?
        * 두 문자열이 같을때 특정한 값을 변경해야 할 경우 이것을 가능하게 해주는 것
        *
        * ex) 현재 온도는 18도 입니다. => 현재 온도는 20도 입니다.
        */

        /*
        * 문자열 포맷 코드(String Format Code)
        *
        * %s : 문자열(String)
        * %c : 문자 1개(char)
        * %d : 정수(integer)
        * %f : 부동소수(floating-point)
        * %o : 8진수
        * %x : 16진수
        *
        * %% : Literal % (문자 % 자체)
        * System.out.println(String.format("I have %s apples",  3));  // "I have 3 apples" 출력
        * System.out.println(String.format("rate is %s", 3.234));  // "rate is 3.234" 출력
        */

        // 1. 숫자 바로 대입
        System.out.println(String.format("I eat %d apples", 3));  // I eat 3 apples

        // 2. 숫자 변수 대입
        int i = 5;
        System.out.println(String.format("I eat %d cakes", i));  // I eat 5 cakes

        // 3. 문자열 바로 대입
        System.out.println(String.format("I eat %s burgers", "three"));  // I eat three burgers

        // 4. 문자열 변수 대입
        String s = "five";
        System.out.println(String.format("I eat %s mangoes", s)); // I eat five mangoes


        // 5. 2개 이상 값 대입
        int num = 7;
        String str = "bye";
        System.out.println(String.format("good%s! nice lucky %d", str, num)); // goodbye! nice lucky 7


        // 6. % + 소수 대입하기
        // 포매팅 연산자 %d와 %를 같이 쓸 때는 %%를 쓴다.
        // String s1 = "%"; 를 사용할 수 있다.
        // ex) System.out.println(String.format("오늘 비가 올 확률은 %.2f%s 입니다.",c,s1))
        float c = 88.79123f;
        System.out.println(String.format("오늘 비가 올 확률은 %.2f%% 입니다.", c));  // 오늘 비가 올 확률은 88.79% 입니다.


        // 7. 정렬과 공백
        System.out.println(String.format("안녕!! %10.2f", 3.45125));
        System.out.println(String.format("굿바이!! %15s","ㅋㅋ"));

        System.out.println(String.format("%-17s 히힣","브로"));
        System.out.println(String.format("%-17.3f 히힣",c));
        System.out.println(String.format("%-17.5f 히힣",2213.48281));
    }
}
