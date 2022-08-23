package Study01_work;

public class study_1_05 {

    public static void main(String[] args) {

      /*

      문제

        유로와 달러를 입력 받아, 출력 예와 같은 결과를 얻으시오. 환율은 아래 정보를 기준으로 할 것.

        환율
        1 유로 환율 = 1281.62664 원
        1 달러 환율 = 1091.70306 원

      */

        double euro = Double.parseDouble(String.valueOf(5))*1281.62664;
        double dallar = Double.parseDouble(String.valueOf(8))*1091.70306;

        double sum = euro+dallar;

        System.out.println(sum);
        System.out.printf("환전 결과: %.0f원", sum);



    }
}
