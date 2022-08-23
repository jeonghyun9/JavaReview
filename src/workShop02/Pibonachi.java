package workShop02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Pibonachi {
    public static void main(String[] args) {

        int[] pibo = new int[10];

        piboCal(pibo);
        piboPrint(pibo);

    }

    public static void piboCal(int[] arr) {
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void piboPrint(int[] arr) {
        System.out.print("피보나치 수열 : [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d",arr[i]);
            if (i != arr.length-1) {
                System.out.print(", ");
            }
        }
//        System.out.println(arr.length);
        System.out.printf(" ]");

    }
}
