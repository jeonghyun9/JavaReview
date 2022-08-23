package Study04_work;

public class study_4_05 {
    public static void main(String[] args) {

        /*
        출력 예
        Item { name: 스톰 브레이커, power: 600 }
        Item { name: 인피니티 건틀렛, power: 999 }
        Item { name: 호크아이의 활, power: 50 }
        Item { name: 캡틴아메리카의 방패, power: 50 }
        */

        // 아이템 객체 생성
        Item storm = new Item("스톰 브레이커", 600);
        Item gauntlet = new Item("인피니티 건틀렛", 999);
        Item bow = new Item("호크아이의 활", 50);
        Item shield = new Item("캡틴아메리카의 방패", 50);

        Item[] items = {storm, gauntlet, bow, shield};

        for (int j = 0; j < items.length; j++) {
            System.out.println(items[j].toString());
        }
    }
}

class Item {
    String name;
    int power;

    public Item(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Item() {
    }

    public String toString() {
        return String.format("Item { name: %s, power: %d }", name, power);
    }
}
