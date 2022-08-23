package workShop02;

import java.util.Scanner;

public class Quiz23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("임의의수 입력: ");
        int num=scanner.nextInt();
        int sum=0;
        int i=num;
        while (1<=i){
            sum += i--;

        }

        System.out.println("입력하신 숫자의 총합:"+sum);
        }
}
