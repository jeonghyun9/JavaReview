package simple_review_01_datatype;

public class Simple_14_TypeCasting {
    public static void main(String[] args) {

        // 1. 형변환

        // 1-1 문자열 => 숫자

        String num = "123";
        Integer n = Integer.parseInt(num);  // 형변환: 문자열=>숫자
        System.out.println(n);  //  123 (숫자)
        System.out.println(n.getClass().getName()); //  java.lang.Integer
        System.out.println("========================");


        // 1-2 숫자 => 문자열

        int i = 123;
        String s = "" + i;  //  형변환: 숫자=>문자열
        System.out.println(s);  //  123 (문자열)
        System.out.println(s.getClass().getName()); //  java.lang.String
        System.out.println(s.equals(n));    //  false

        System.out.println("========================");

        int a = 123;
        String num1 = String.valueOf(a);    //  형변환: 숫자=>문자
        String num2 = Integer.toString(a);  //  형변환: 숫자=>문자
        System.out.println(num1.getClass().getName());  //  java.lang.String
        System.out.println(num2.getClass().getName());  //  java.lang.String


        System.out.println(num1);   //  123
        System.out.println(num2);   //  123
        System.out.println(num1==num2);     //  false. 주소가 다름.
        System.out.println(num1.equals(num2));  // true. 값이 같음.

        System.out.println("========================");

        // 1-3. 문자 => 소수

        String str = "123.456";
        Double dd = Double.parseDouble(str);
        Float ff = Float.parseFloat(str);
        System.out.println(dd); //  123.456
        System.out.println(ff); //  123.456
        System.out.println(str.getClass().getName());   //  java.lang.String
        System.out.println(dd.getClass().getName());    //  java.lang.Double
        System.out.println(ff.getClass().getName());    //  java.lang.Float

        System.out.println("========================");

        // 1-4. 정수 <=> 실수
        int i1 = 123;
        double d1 = i1;
        System.out.println(d1);

        double d2 = 123.456;
        int i2 = (int) d2;
        System.out.println(i2);


        // 1-5. 실수 형태의 문자열 => 정수  : 에러발생!
        String num3 = "111.222";
        int n3 = Integer.parseInt(num3);
        System.out.println(n3); //  NumberFormatException 발생

    }
}
