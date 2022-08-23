package Study01_work;

public class study_1_06 {

    public static void main(String[] args) {

        /*
        1인치는 2.54센티미터 입니다.

            double inchToCm = 2.54;

        6인치를 센티미터로 변환하면 아래와 같습니다.

            int inch = 6;
            double cm = inch * inchToCm;
            System.out.println(cm); // 15.24

        문제

            홍팍이의 허리 둘레가 32인치일 때, 이를 cm로 변환한 결과를 구하시오.

        출력 예

            81.28cm

        */

        double inchToCm = 2.54;
        int inch = 32;
        double cm = inch * inchToCm;

        System.out.printf("%.2fcm", cm);

    }
}
