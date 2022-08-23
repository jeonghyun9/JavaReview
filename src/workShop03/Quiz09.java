package workShop03;

import java.util.Arrays;
import java.util.Random;

public class Quiz09 {
    public static void main(String[] args) {
        /*
        다음과 같이 선언되어 있는 배열에 1~10까지의 랜덤한 숫자(중복허용)를 넣고 이 배열에 어떤
        값이 셋팅 되었는지 출력 하고 배열 데이터의 합과 평균을 구하는 프로그램을
        */

        int[] arr3 = new int[5];
        rand(arr3);
        sum(arr3);
        avg(arr3);
    }

    static void rand(int arr[]) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(9)+1;
            if (i == arr.length - 1) {
                System.out.printf("%d\n", arr[i]);
            } else {
                System.out.printf("%d ", arr[i]);
            }

        }
    }

    static void sum(int []arr) {
        System.out.println("sum="+Arrays.stream(arr).sum());
    }

    static void avg(int[] arr) {
        double a = Arrays.stream(arr).average().getAsDouble();
        System.out.println("avg="+a);
    }
}
