package simple_review_01_datatype;

public class Simple_05_Method {
    public static void main(String[] args) {
        // 1. 문자열 내장 메소드

        // 1-1. equals()
        // 문자의 값을 비교할 때에는 반드시 equals를 사용해야 한다.
        String x = "hello";
        String y = "java";
        String z = "hello";

        System.out.println(x.equals(y));  // false
        System.out.println(x.equals(z));  // true

        /*
        == 연산자로 비교 할 시에는 다음과 같은 경우가 발생할 수 있다.
        */

        String s = "hello";  // 리터럴 표기
        String s1 = new String("hello");  // 객체생성

        System.out.println(s.equals(s1));  // true
        System.out.println(s==s1);  // false

        /*
         * s와 s1은 값은 같지만 서로 다른 객체이다.
         * ==는 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이다.
         * 때문에 위의 경우에 false를 반환하게 된다
         */

        System.out.println("==============equals() End=============");

        // 1-2. indexOf()
        // indexOf는 문자열에서 특정 문자가 시작되는 위치(index)를 리턴한다.

        String a = "Hello Java";

        System.out.println(a.indexOf("Java"));  // 6. 0부터 시작해 6번째에 위치한 문자 리턴
        System.out.println(a.indexOf("l"));  // 2. 0부터 시작해 2번째에 위치한 문자 리턴

        System.out.println("==============indexOf() End=============");

        // 1-3. contains()
        // contains는 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴한다.

        String b = "Hello Java";
        System.out.println(b.contains("Java"));  // true
        System.out.println(b.contains("bye"));  // false

        // 문자열 a는 "Java"라는 문자열을 포함하고 있기 때문에 true를 리턴한다.

        System.out.println("==============contains() End=============");

        // 1-4. charAt()
        // charAt은 문자열에서 특정 위치의 문자(char)를 리턴한다.

        String c = "Hello Java";
        System.out.println(c.charAt(3)); // l
        System.out.println(c.charAt(8)); // v

        System.out.println("==============charAt() End=============");

        // 1-5. replace(), replaceAll()
        // replace, replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꿀때 사용한다.
        // 단, replaceAll은 인자값으로 정규식을 넘겨준다.


        String d = "Hello Java)";
        System.out.println(d.replace("H","ye"));  // yeello Java
        System.out.println(d.replaceAll("Hel", "vol"));  // vollo Java
        System.out.println(d.replace(")", "!"));  // Hello Java!
        System.out.println(d.replaceAll("\\)","!")); // Hello Java!
        // replaceAll은 ')'을 토큰으로 인식하기에 \\를 이용해야만 변경 할 수 있다.
        // 따라서 replaceAll은 특수기호를 사용하는데에 제약이 있다.


        System.out.println("==============replace(), replaceAll() End=============");


        // 1-6. substring()
        // substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
        // substring(시작위치, 끝위치)

        String e = "Hello Java";
        System.out.println(e.substring(0,5));  // Hello
        // 0 <= e < 5. 끝 위치는 포함 안됨.

        System.out.println("==============substring() End=============");

        // 1-7. toUpperCase(), toLowerCase()
        // 문자열을 모두 대문자 또는 소문자로 변경할 때 사용한다.

        String f = "Hello Java";
        System.out.println(f.toUpperCase());
        System.out.println(f.toLowerCase());

        System.out.println("==============toUpperCase(), toLowerCase() End=============");


        // 1-8. split()
        // split 메소드는 문자열을 특정 구분자로 분리할 때 사용한다.
        // 분리한 문자열 들을 배열로 저장할 수 있다.

        String g = "a34v,ejwk, ejhad, dhe: eujf:,:flo";
        String[] g1 = g.split(",");
        for (int i = 0; i < g1.length; i++) {
            System.out.println("g1["+i+"] = " +g1[i]);
        }
        System.out.println("////////////////////");
        String[] g2 = g.split(":");
        for (int i = 0; i < g2.length; i++) {
            System.out.println("g2["+i+"] = " + g2[i]);
        }

        System.out.println("==============split() End=============");

    }
}
