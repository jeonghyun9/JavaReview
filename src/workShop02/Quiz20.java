package workShop02;

import java.util.Scanner;

public class Quiz20 {
    public static void main(String[] args) {

        /*보너스를 지급하려고 한다. 근무시간과 월급을 입력 받아 근무시간에 따라 보너스를 계산하여
        실행결과와 같이 출력하는 코드 작성.
            -----------------------------
            근무시간            보너스
            ----------------------------
            25시간 이상         월급의 100%
            20시간 이상         월급의 80%
            18시간 이상         월급의 50%
            18시간 미만         없음
            -----------------------------
            */
        Scanner scanner = new Scanner(System.in);
        System.out.println("보너스 및 월급 구하기");
        System.out.print("근무시간입력 : ");
        int time = scanner.nextInt();
        System.out.print("월급입력 : ");
        int sal = scanner.nextInt();
        System.out.println("====================");
        System.out.printf("보너스 : %d\n", Bonus(time,sal));
        System.out.printf("지급될 급여 : %d", sumSal(time, sal));



    }

    // 보너스 계산하기
    public static int Bonus(int a, int b){

        if (a >= 25) {
            return (int) b;
        } else if (a >= 20) {
            return (int) (0.8*b);
        } else if (a >= 18) {
            return (int) (0.5*b);
        } else {
            return 0;
        }
    }

    // 총 지급액 계산하기
    public static int sumSal(int x, int y) {
        int sum = Bonus(x,y) + y;
        return sum;
    }
}
