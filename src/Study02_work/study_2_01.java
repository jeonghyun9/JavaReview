package Study02_work;

public class study_2_01 {

    public static void main(String[] args) {

        /*
        예금 복리 계산

            문제
            천만원을 예금하려 한다. 만기는 5년, 이율은 연 복리로 3%이다. 아래 공식을 참고하여 만기 시 수령 금액을 출력하시오. (소수점 이하 금액은 버릴 것)

            S = a(1+r)^n

            S: 만기 금액
            a: 원금
            r: 이율
            n: 만기 년수
            출력 예
            만기 금액: 11592740 원
         */

        // 변수 생성
        int a = 10000000;
        double r = 0.03;

        // 계산
        int s = (int) (a*((1+r)*(1+r)*(1+r)*(1+r)*(1+r)));


        // 출력
        System.out.printf("만기 금액: %d 원", s);
    }


}
