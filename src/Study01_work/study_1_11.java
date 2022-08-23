package Study01_work;

public class study_1_11 {

    public static void main(String[] args) {

        /*
        최근 몸무게 평균

          평균은 모든 값을 더한 뒤, 이를 개수로 나누면 됩니다.

          double average = (14.7 + 12.8 + 15.2) / 3;
          System.out.println(average);
          # => 14.233333333333334

          문제
          홍팍이의 1월, 2월, 3월달에 대한 몸무게 변화는 아래와 같다.

            1월: 81.36kg
            2월: 전달 대비 + 0.71kg
            3월: 전달 대비 - 0.43kg
            홍팍이의 1월달부터 3월달 까지의 평균 몸무게는 얼마인지 구하시오.

            출력 예
            81.69kg
            */
        double hong1 = 81.36;
        double hong2 = 0;
        double hong3 = 0;
        double a = 0.71;
        double b = 0.43;
        //System.out.println(hong2+"1111111111");
        hong2 = hong1 + a;
        //System.out.println(hong2+"=====222222222222");

        hong3 = hong2 - b;

        double avg = (hong1+hong2+hong3)/3;

        System.out.println(hong2);
        System.out.println(avg+"kg");




    }
}
