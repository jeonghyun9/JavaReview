package Study03_work;

public class study_3_01 {
    public static void main(String[] args) {

/*
        홍팍이는 매달 0.231kg씩 살이 찐다. 현재 체중이 72.4kg 일 때, 5개월 후의 몸무게를 출력하도록 weight() 메소드를 완성하고,
        적절한 입력값을 통해 출력 예와 같은 결과를 얻으시오.

        입력 예
        현재 몸무게를 W, 개월 수를 N이라 할 때, W N의 형식으로 입력. 아래는 입력 예는 72.4kg의 5개월 후를 의미한다.
        72.4 5

        출력 예
        5개월 후 예상 몸무게 => 73.55kg
*/

        // 입력값 받기
        double start = Double.parseDouble(args[0]);
        int after = Integer.parseInt(args[1]);

        // 계산
        double result = weight(start, after);

        // 결과 출력
        System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
    }

    // 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
    public static double weight(double currentWeight, int months) {
        double expectedWeight = currentWeight;
        for (int i=0; i<months; i++) {
            expectedWeight += 0.231;
        }
        return expectedWeight;
    }
}
