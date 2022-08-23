package Study04_work;

public class study_4_02 {
    public static void main(String[] args) {
        /*
        문제
        주어진 코드가 출력 예와 같은 결과를 얻도록, Food 클래스를 완성하시오. 구현시 아래의 클래스 다이어그램을 참고할 것.

        클래스 다이어그램
        Food 클래스는 이름과 가격을 필드로, 메소드로는 toString()을 갖는다.
        클라우드스터딩-자바-음식-클래스-다이어그램

        출력 예
        Food { name: 치킨, price: 18000원 }
        Food { name: 피자, price: 28000원 }
        Food { name: 초밥세트, price: 22000원 }
        */
        Food f1 = new Food("치킨",18000);
        Food f2 = new Food("피자",28000);
        Food f3 = new Food("초밥세트",22000);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
    }
}

class Food {

    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Food() {}

    public String toString(){
        return String.format("Food { name: %s, price: %d원 }", this.name, this.price);
    }

}
