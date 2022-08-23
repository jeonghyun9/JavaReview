package Study01_work;

public class study_1_10 {

    public static void main(String[] args) {

        /*
        지폐의 총합

        기존 변수에 값을 더해서 대입하는 연산자(+=)가 있습니다. 그 사용법은 아래와 같습니다.

        int score = 88;
        score += 5; // 기존 값에 5를 증가
        System.out.println(score); // 93
        같은 원리로 동작하는 뺄셈 대입(-=), 곱셈 대입(*=), 나눗셈 대입(/=) 등 또한 있답니다.

        문제
        당신의 지갑에는 만원권 3장, 오천원권 4장, 천원권 7장이 있다. 지폐의 총합을 구하시오.

        출력 예
        57000원
        */

        int manwon = 10000;
        int Ocheon = 5000;
        int cheon = 1000;

        int a = manwon*3;
        int b = Ocheon*4;
        int c = cheon*7;

        b += c;
        a += b;


        System.out.printf("%d원",a);



    }
}
