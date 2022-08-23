package Study01_work;

public class study_1_12 {

    public static void main(String[] args) {

        /*

        각 자리수의 합
        2자리 정수 31의 총합은 다음과 같습니다.

        int num = 31;
        int oneDigit = num % 10;
        int tenDigit = num / 10;
        System.out.println(oneDigit + tenDigit);
        # => 4
        문제
        3자리 정수 374의 각 자리 숫자의 총합을 구하시오.

        출력 예
        총합: 14
        */

        int num = 374;
        int oneDigit = num%10;
        int tenDigit = num/10%10;
        int hunDigit = num/100;
        int sum = hunDigit+tenDigit+oneDigit;

        System.out.println("총합: " + sum);

    }
}
