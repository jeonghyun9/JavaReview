package Study01_work;

public class study_1_08 {

    public static void main(String[] args) {

        /*
        시간 변환

        나머지 연산자(%)는 특정 값을 나누고 남은 값을 반환합니다. 이를 활용하여 2746초를 45분 46초로 변환하면 아래와 같습니다.

        int totalSec = 2746;
        int min = 2746 / 60; // min = 45
        int sec = 2746 % 60;  // sec = 46


        문제
        7582초를 OO시간 OO분 OO초로 변환하시오.

        출력 예
        2시간 6분 22초
        */

        int totalSec = 7582;
        //int min = totalSec / 60 % 60;
        int min = totalSec / 60 % 60;
        int sec = totalSec % 60;
        int hour = totalSec / (60*60) ;

//        System.out.println(totalSec);
//        System.out.println(min);
//        System.out.println(sec);
//        System.out.println(hour);

        System.out.println(hour + "시간 " + min + "분 " + sec + "초");


    }
}
