package workShop03;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz05 {
    public static void main(String[] args) {

        int[][] arr2 = {
                {20, 30, 10},
                {50, 40, 60},
                {80, 80, 90}
        };

        int n = 0;
        ArrayList list = new ArrayList();
        for (int i = arr2.length-1; i >= 0; i--) {
            for (int j = arr2.length-1; j >= 0; j--) {
                System.out.print(arr2[i][j]+" ");
            }
        }


    }
}
