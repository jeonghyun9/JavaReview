package OOP_study;

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class SimpleLottoMachine {
    public static void main(String[] args) {
        // 45개의 공을 만든다
        ArrayList<Integer> list = new ArrayList<Integer>();
        int lotto[] = new int[6];


        for (int i = 0; i < 45; i++) {
            list.add(i+1);
        }

        // 섞는다
        Collections.shuffle(list);

        // 뽑는다
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = list.get(i);
        }
        String result = Arrays.toString(lotto);

        // 결과 출력
        System.out.printf("자동 생성 번호: %s",result);

    }
}
