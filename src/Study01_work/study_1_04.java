package Study01_work;

public class study_1_04 {

    public static void main(String[] args) {

      /*

      이번달 월급은?

        문제
        바리스타를 꿈꾸는 김바리 학생. 이번 달부터 별다방에서 일하기로 했다. 월급은 기본시급 8000원에 일한시간을 곱한 값으로 한다.

        기본 시급과 일한 시간을 입력으로 받아, 출력 예와 같은 결과를 얻으시오.

        1280000


      */

        int pay = Integer.parseInt(args[0]);
        int time = Integer.parseInt(args[1]);

        System.out.println(pay*time);


    }
}
