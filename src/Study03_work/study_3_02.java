package Study03_work;

public class study_3_02 {
    public static void main(String[] args) {
        /*
        이번 한주간 “클라우드 스터딩” 사이트 접속자 수는 지역별로 나누었을 때, 아래와 같다.
        서울: 599 명
        부산: 51 명
        인천: 46 명
        대전: 43 명
        대구: 27 명
        이를 배열로 생성하여 출력 하시오.


        출력 예
        서울: 599 명
        부산: 51 명
        인천: 46 명
        대전: 43 명
        대구: 27 명
        */

        // 배열 생성
        String[] cities = {"서울","부산","인천","대전","대구"};
        int[] visitors = {599,51,46,43,27};

        for (int i = 0; i < cities.length; i++) {
                System.out.printf("%s: %d 명\n", cities[i],visitors[i]);
        }
    }
}
