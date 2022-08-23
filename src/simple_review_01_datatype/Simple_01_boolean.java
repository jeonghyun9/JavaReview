package simple_review_01_datatype;

public class Simple_01_boolean {
    public static void main(String[] args) {

        // 1. 불 (boolean)
        boolean isSuccess = true;
        boolean isTest = false;

        System.out.println(isSuccess); // true
        System.out.println(isTest); // falss

        System.out.println("===========================");

        // 2. 불 연산 (boolean 연산)
        String s = "2";
        String s2 = "2";
        int i3 = 2;

        System.out.println(2>1);  // ture
        System.out.println(1==2);  // false
        System.out.println(3%2==1);  // true
        System.out.println("3".equals("2")); // false
        System.out.println("2".equals("2")); // true
        System.out.println(s==s2);  // true
        System.out.println("2"=="2"); // true
        System.out.println(s.equals(s2));  // true
        System.out.println(s.equals(i3));   // false  문자열/=숫자. 표기값은 같아도 의미가 다름.
//        System.out.println(s==i);  // ERROR

        System.out.println("===========================");

        // 3. 불 조건문
        int base = 100;
        int height = 185;
        boolean isTall = height > base;

        System.out.println(isTall); // true

        if (isTall) {
            System.out.println("키가 큼!"); // true일 시 실행!
        } else {
            System.out.println("키가 안 큼!"); // false일 시 실행!
        }

        int i = 3;
        boolean isOdd = i%2 == 1;
        System.out.println(isOdd); // true

    }
}
