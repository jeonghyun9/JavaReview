package Study04_work;

public class study_4_08 {
    public static void main(String[] args) {
        /*
        [레오나]의 펀치
        아서스: 20/30
                [아서스]의 펀치
        레오나: 20/30
                [레오나]의 펀치
        아서스: 10/30
                [아서스]의 펀치
        레오나: 10/30
                [아서스]의 펀치
        레오나: 0/30
        */

        // 두 싸움꾼 객체 생성
        Hero arthas = new Hero("아서스");
        Hero leona = new Hero("레오나");

        // 격투 시작
        Hero.battle(arthas, leona);

    }
}

class Hero {
    // 필드
    String name;
    int hp;

    // 생성자
    public Hero(String str) {
        name = str;
        hp = 30;
    }

    // 메소드(인스턴스 메소드)
    public void punch(Hero enemy) {
        System.out.printf("[%s]의 펀치\n\t %s: ", this.name, enemy.name);
        int totalHP = 30;
        enemy.hp -= 10;
        System.out.printf("%d/", enemy.hp);
        System.out.printf("%d\n", totalHP);
    }

    // 메소드(클래스 메소드)
    public static void battle(Hero a, Hero b) {
        while (a.hp>0 && b.hp>0){
            Hero attacker, defender;
            if (Math.random() < 0.5) {
                attacker = a;
                defender = b;
            } else {
                attacker = b;
                defender = a;
            }
            // 대상을 공격
            attacker.punch(defender);
        }
    }
}