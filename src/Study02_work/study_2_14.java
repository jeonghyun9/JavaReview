package Study02_work;

public class study_2_14 {
    public static void main(String[] args) {

        /*당신은 Java 카페의 사장이 되었고, 며칠 후 알바생들에게 급여를 주어야 한다. 급여 조건 및 제약사항은 아래와 같다.

        급여는 주급으로 정산하며 (근무시간) X (기본 시급)을 기준으로 한다.
        주당 근무가 40시간을 초과 시, 초과분에 대하여 1.5배의 급여를 지급한다.
        기본 시급은 최저 $8.00이며, 이보다 작은 경우 경고문을 출력한다.
        주당 근무가 60시간을 넘을 시, 경고문을 출력한다.

        위 내용을 만족하는 printPay() 메소드를 완성하여, 출력 예와 같은 결과를 얻으시오.*/

        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }

    // 시급과 일한 시간을 입력받아, 주급을 출력
    public static void printPay(double basePay, int hours) {
        double pay = basePay*hours;
        if (hours>40 && hours<=60){
            pay= (basePay*40)+(basePay*1.5*(hours-40));

        } else if (hours>60) {
            System.out.println("초과 근무시간 에러!");
            return;
        } else if (basePay<8){
            System.out.println("최저 시급 에러!");
            return;

        }
        System.out.printf("$ %.2f\n", pay);
    }
}
