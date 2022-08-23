package Study02_work;

public class study_2_05 {

    public static void main(String[] argument){

        /*
        문제
        어떤 게임이 있다. 이 게임은 주사위를 던저 나오는 눈의 수 만큼 달러를 획득한다. 주사위를 총 3번 던져 얻은 달러. 이를 환전한 결과를 출력 하시오.

                요구사항

        뼈대코드의 main() 메소드를 그대로 사용 할 것
        Math.random() 1 과 6 사이의 숫자를 반환하는 dice() 메소드를 구현 할 것
        1 달러의 환율은 1082.25108 원으로 한다
        */

        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);

    }
    public static int dice() {
        int n = (int) (Math.random()*6)+1;
        return n;
    }

    public static double exchange(double dollar) {
        double result = dollar*1082.25108;
        return result;
    }
}
