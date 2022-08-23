package workShop03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Quiz08 {
    public static void main(String[] args) {

        int [] score= {99,34,67,22,11,9};
        maxCal(score);
        minCal(score);
    }

    public static void minCal(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println("최소값:"+list.get(0));
    }

    public static void maxCal(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.sort(Comparator.reverseOrder());
        System.out.println("최대값:"+list.get(0));
    }
}
