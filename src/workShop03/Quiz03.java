package workShop03;

import java.util.ArrayList;

public class Quiz03 {
    public static void main(String[] args) {

        int[][] arr2 = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        System.out.println(total(arr2));
        System.out.println(total(arr2)/avg(arr2));
    }

    static int total(int[][] arr) {
        int sum= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static double avg(int[][]arr3) {
        int avg = 0;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j <= arr3.length; j++) {
                avg++;
            }

        }
        return avg;
    }
}
