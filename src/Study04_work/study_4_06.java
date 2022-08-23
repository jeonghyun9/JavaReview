package Study04_work;

import java.awt.*;

public class study_4_06 {
    public static void main(String[] args) {
        /*
        출력 예
        주문 합계: 24700원
        */

        // 주문을 위한 메뉴 선정
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕", 5900);
        Menu tangsook = new Menu("탕수육", 13900);

        // 메뉴를 조합하여 주문을 생성
        Menu[] menuArr = { jjajang, jjambbong, tangsook };
        Order order = new Order(123, menuArr);

        System.out.printf("주문 합계: %d원",order.totalPrice());
    }
}

class Order {
    int orderNum;
    Menu[] menus;

    public Order(int orderNum, Menu[] menus) {
        this.orderNum = orderNum;
        this.menus = menus;
    }

    public Order() {
    }

    public int totalPrice() {
        int sum = 0;
        for (int i = 0; i < menus.length; i++) {
            sum += menus[i].price;
        }
        return sum;
    }
}

class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
