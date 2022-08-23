package Study02_work;

public class study_2_12 {
    public static void main(String[] args) {

        /*
        BMI 지수란, 비만도를 나타내는 지수로, 체중과 키의 관계로 계산됩니다.
        키가 T(m), 체중이 W(kg)일 때, BMI 지수는 아래와 같이 계산됩니다.

        BMI = W/(T*T)

        이를 통해 비만도 여부를 아래와 같이 나눌 수 있습니다.

        비만: 30이상
        과체중: 25이상 ~ 30미만
        정상: 18.5이상 ~ 25미만
        저체중: 18.5 미만

        대학생이 되어 열심히 다이어트중인 나몸짱(20) 학생. 열심히 운동도 하고 식단 조절도 하고있는데.. 과연 잘 하고 있는 걸까?

        체중(kg)과 키(m)를 입력받아 BMI 지수를 반환하는 calculate()와 BMI 지수를 통해 비만도 결과를 반환하는 result() 메소드를 완성하여, 출력 예와 같은 결과를 얻으시오.

        BMI: 26.34(81.6kg, 1.76m)
        결과: 과체중입니다.

        */

        // 변수 생성
        double w = 81.6;
        double t = 1.76;

        // BMI 계산
        double bmi = calculate(w, t);

        // 결과 출력
        System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
        System.out.printf("결과: %s입니다.\n", result(bmi));
    }
    // 몸무게와 키를 입력받아, bmi 지수를 반환
    public static double calculate(double weight, double tall) {
        /* 해당 메소드를 완성하시오. */
        double calc = weight/(tall*tall);
        return calc;
    }

    // bmi 지수를 입력받아, 비만 결과를 반환
    public static String result(double bmi) {
        if (bmi >= 30){
            String result = "비만";
            return result;
        } else if (bmi >=25 && bmi<30) {
            String result = "과체중";
            return result;
        } else if (bmi >=18.5 && bmi<25) {
            String result = "정상";
            return result;
        } else {
            String result = "저체중";
            return result;
        }
    }
}
