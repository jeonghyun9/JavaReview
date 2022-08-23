package simple_review_01_datatype;

public class Simple_13_Enum {

    /*
     * Enum : 상수 집합
     * Enum은 서로 관련이 있는 여러 개의 상수 집합을 정의할 때 사용하는 자료형이다.
     */

    // 1. Enum 만들기

        /*
        예를 들어 어떤 커피숍에서 판매하는 커피의 종류가 다음과 같다고 가정한다.
        - 아메리카노
        - 아이스 아메리카노
        - 카페라떼
        */



    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }


    public static void main(String[] args) {

        System.out.println(CoffeeType.AMERICANO);   //  AMERICANO
        System.out.println(CoffeeType.ICE_AMERICANO);   // ICE_AMERICANO
        System.out.println(CoffeeType.CAFE_LATTE);  //  CAFE_LATTE


        for (CoffeeType coffeeType: CoffeeType.values()) {
            System.out.println(coffeeType);
            // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }

    }
}




