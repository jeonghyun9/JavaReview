package workShop03;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = scanner.nextInt();

        int[] n = new int[num];
        for (int i = 0; i < n.length; i++) {
            System.out.printf("사람 %d: ",i+1);
            n[i] += scanner.nextInt();
        }

        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }

        System.out.printf("최대값은 %d 입니다.", max);


    }
}
