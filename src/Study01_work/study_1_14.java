package Study01_work;

public class study_1_14 {

    public static void main(String[] args) {

        /*
        최소 지폐 수 계산

        문제
        상품 가격 152,365원을 지불하기 위해 필요한 최소 지폐 장수는 아래와 같다. (천원 미만 가격은 할인 됨)

        5만원 x 3 장
        1만원 x 0 장
        5천원 x 0 장
        1천원 x 2 장
        이를 계산하는 프로그램을 작성하고, 출력 예와 같은 결과를 만드시오.

        출력 예
        5만원 x 3
        1만원 x 0
        5천원 x 0
        1천원 x 2
        -----------
        총 장수: 5장
        금액: 152000원
        할인: 365원
        */

        // 변수 생성
        int price = 152365;

        /* 1. 장수 계산 */
        int oman = price/50000;
        int man = price%50000/10000;
        int ochun = price%10000/5000;
        int chun = price%5000/1000;

        /* 2. 할인 금액 계산 */
        int discounted = price%1000;

        /* 3. 총 지폐 수 계산 */
        int totalCnt = oman+ochun+man+chun;

        // 결과 출력
        System.out.printf("5만원 x %d\n", oman);
        System.out.printf("1만원 x %d\n", man);
        System.out.printf("5천원 x %d\n", ochun);
        System.out.printf("1천원 x %d\n", chun);
        System.out.println("--------------");
        System.out.printf("총 장수: %d장\n", totalCnt);
        System.out.printf("금액: %d원\n", price - discounted);
        System.out.printf("할인: %d원\n", discounted);



    }
}
