package simple_review_01_datatype;

public class Simple_03_Number {
    public static void main(String[] args) {

        // 1. 정수
        int age = 10;
        long countOfStar = 848743767378L;

        System.out.println(age);
        System.out.println(countOfStar);

        System.out.println("===========================");

        // 2. 실수
        float pi = 3.14f;
        double morePi = 3.13159729383729178;

        System.out.println(pi);
        System.out.println(morePi);

        double d1 = 123.4;
        double d2 = 1.234e2;

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("===========================");

        // 3. 숫자 연산
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);  // /는 몫 값을 반환
        System.out.println(a%b);  // %는 나머지 값 반환
        System.out.println(b%a);

        System.out.println("===========================");

        // 4. 증감 연산
        int i = 0;
        int j = 10;
        i++;
        j--;

        System.out.println(i);
        System.out.println(j);

        int x = 0;
        System.out.println(x++);  // 0
        System.out.println(x); // 1

        /*
        * i++와 같이 연산자가 변수명 뒤에 붙으면 해당 코드가 실행되는 순간에는
        * i의 값이 변경되지 않는다. 다만 i++ 문장이 실행된 이후에 i 값이 증가하게 된다.
        * 반대로 ++i라고 사용하게 되면  i값이 먼저 증가된 후에 코드가 실행된다.
        *
        *  i++ : 값이 참조된 후에 증가. 실행때 증가하지만 이후 코드에서 볼 수 있음.
        *  ++i : 값이 참조되기 전에 증가
        * */

        int y = 0;
        System.out.println(++y); // 1
        System.out.println(y); // 1




    }
}
