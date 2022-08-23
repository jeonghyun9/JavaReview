package workShop03;

import java.util.Random;
import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다");
        System.out.print("사람 수 : ");
        int num = scanner.nextInt();
        int[] n = new int[num];
        Random a = new Random(100);

        for (int i = 0; i < num; i++) {
            n[i] = 100 + a.nextInt(100);
            System.out.printf("사람 %d: %d\n", i+1, n[i]);
        }

        int c = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > c) {
                c = n[i];
            }

        }
        System.out.println("최대값은 "+c+"입니다.");
    }
}
