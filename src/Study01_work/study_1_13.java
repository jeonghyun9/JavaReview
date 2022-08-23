package Study01_work;

public class study_1_13 {

    public static void main(String[] args) {

        /*
        x(t): 위치
        a: 가속도
        t: 이동시간
        v0: 초기 속도
        x0: 초기 위치

        문제
        1000m 상공에서 물체를 정지상태에서 가만히 놓아 자유 낙하시키려 한다.
        코드를 완성하여, 출력 예와 같은 결과를 얻으시오. (자유 낙하 시 저항은 없고, 중력 가속도는 -9.81로 한다)

        출력 예
        5.00초 후 위치: 877.38m
         */

        // 변수 생성
        double time = 5.0;               // 이동 시간
        double gravity = -9.81;          // 중력 가속도
        double initialVelocity = 0.0;    // 초기 속도
        double initialPosition = 1000.0; // 초기 위치

        /* 1. 물리 공식을 코드화 하시오. */
        double finalPosition = ((0.5*gravity*(time*time))+(initialVelocity*time)+(initialPosition));

        // 결과 출력
        System.out.printf("%.2f초 후 위치: %.2fm\n", time, finalPosition);
    }
}
