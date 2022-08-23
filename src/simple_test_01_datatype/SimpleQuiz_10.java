//package simple_test_01_datatype;
//
//import java.util.HashMap;
//
//public class SimpleQuiz_10 {
//    public static void main(String[] args) {
//
//        /*
//        * 다음은 커피의 종류(1: 아메리카노, 2:아이스 아메리카노, 3:카페라떼)를 입력하면
//        * 커피의 가격을 알려주는 프로그램이다.
//        * 메소드에서 1, 2, 3과 같은 매직넘버를 제거하여 프로그램을 개선해보자
//        */
//
//        printCoffeePrice(coffeType.아메리카노);  // "가격은 3000원 입니다." 출력
////        printCoffeePrice(coffeType.아이스_아메리카노);  // NullPointerException 발생
//
//
//    }
//
//    static void printCoffeePrice(coffeType type) {
//        HashMap<coffeType, Integer> priceMap = new HashMap<>();
//        priceMap.put(coffeType.아메리카노, 3000);  // 1: 아메리카노
//        priceMap.put(coffeType.아이스_아메리카노, 4000);  // 2: 아이스 아메리카노
//        priceMap.put(coffeType.카페_라떼, 5000);  // 3: 카페라떼
//        int price = priceMap.get(type);
//        System.out.println(String.format("가격은 %d원 입니다.", price));
//    }
//
//    enum coffeType{
//    아메리카노,
//    아이스_아메리카노,
//    카페_라떼
//    }
//
//}
