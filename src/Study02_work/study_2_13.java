package Study02_work;

public class study_2_13 {
    public static void main(String[] args) {
        /*
        비교 연산자와 논리 연산자를 사용하면, 더욱 풍부한 조건식 작성이 가능합니다.

        a, b, c 중 모두 10보다 큰 경우

        if (a > 10 && b > 10 && c > 10) {
          ...
        }

        때에 따라, 조건식 작성에 적절한 괄호가 필요합니다. 그렇지 않다면, 연산자 우선순위로 인해 예상치 못한 결과가 나올 수 있기 때문입니다.
        비교 및 논리 연산자간 우선순위는 비교 연산자 > AND > OR의 순입니다.

        x가 10보다 크면서, 동시에!
        a, b, c 중 적어도 하나가 10보다 큰 경우

        if ((x > 10) && (a > 10 || b > 10 || c > 10)) {
          ...
        }
        =================================================================
        한 소개팅 어플은 다음 요소를 기준으로 회원을 평가하여 점수화(0.0~5.0)한다.

        성격
        외모
        능력

        아래의 등급 기준을 참고하여, 출력 예와 같은 결과를 얻으시오.

        A - 모든 요소가 4.0 이상
        B - 총점 10점 이상이면서, 적어도 하나가 4.0 이상
        C - 그 외

        X -> A등급
        Y -> B등급
        Z -> C등급
        */

        // 평가
        String x = rating(4.2, 4.7, 4.3);
        String y = rating(3.8, 4.1, 3.5);
        String z = rating(3.6, 3.0, 3.4);

        // 출력
        System.out.printf("X -> %s등급\n", x);
        System.out.printf("Y -> %s등급\n", y);
        System.out.printf("Z -> %s등급\n", z);
    }

    public static String rating(double personality, double look, double ability) {
        // 변수 생성
        String result = "";
        double sum = personality + look + ability;

        // 조건에 따른 등급 결정
        if (personality>=4.0 && look>=4.0 && ability>=4.0) {
            result = "A";
        } else if (sum>=10&&(ability>=4.0||personality>=4.0||look>=4.0)) {
            result = "B";
        } else {
            result = "C";
        }

        // 결과 반환
        return result;
    }
}
