package Study04_work;

public class study_4_03 {
    public static void main(String[] args) {
        /*
        문제
        주어진 코드의 Miner는 코인 채굴 객채를 위한 클래스이다. 출력 예와 같은 결과를 얻도록, 코드를 완성하시오.

                출력 예
        Miner { name: 말런, coins: 3 }
        Miner { name: 글로리아, coins: 2 }
        */

        /* 1. 두 갱부 객체를 생성하세요. */
        Miner malon = new Miner("말런");
        Miner gloria = new Miner("글로리아");

        /* 2. 코인을 채굴하세요. */
        for (int i = 0; i < 3; i++) {
            malon.mine();
        }
        for (int i = 0; i < 2; i++) {
            gloria.mine();
        }


        /* 3. 객체 정보를 출력하세요. */
        System.out.println(malon.toString());
        System.out.println(gloria.toString());
    }
}

class Miner {
    String name;
    int coins;

    public Miner(String str) {
        name = str;
        coins = 0;
    }

    public Miner() {
    }

    public String toString() {
        return String.format("Miner { name: %s, conins: %d }", this.name, this.coins);
    }

    public void mine() {
        coins += 1;
    }
}

