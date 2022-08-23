package Study03_work;

import Study02_work.array;

public class study_3_04 {
    public static void main(String[] argument){
        // 변수 생성
        String s = "Programming is fun! right?";
        char[] array = s.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("==========="+array[i]);
//        }


        // 자음 모음 개수 세기
        int[] result = count(s);

        // 결과 출력
        System.out.printf("%s\n=> 자음 %d개, 모음 %d개", s, result[0], result[1]);
        //System.out.println(array.length);
    }

/*
    String str2 = "ABC";
    char[] letters = str2.toCharArray();
    char[] letters = { 'A', 'B', 'C' };
*/

    public static int[] count(String str){
        int conso = 0; // 자음
        int vowel = 0; // 모음
        int reusult[] = {conso, vowel};
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a' || array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u') {
                reusult[1] = ++vowel;
//                System.out.println("모음  :  " + array[i]+"///////////");
            } else if (array[i] == ' '||array[i] == ','||array[i] == '\t'||array[i] == '\n'||array[i] == '.'||array[i] == '!'||array[i] == '?') {
//                System.out.println("예외  :  " + array[i]);
                continue;
            } else {
                reusult[0] = ++conso;
//                System.out.println("자음  :  " + array[i]);
            }


        }
//        System.out.println(conso+"///"+vowel);
//        System.out.println(reusult[0]+"++++"+reusult[1]);

        return reusult;
//        int conso = 0; // 자음
//        int vowel = 0; // 모음
//        // 문자열을 문자의 배열로 만듬
//        // {'P','r','o','g','r','a','m','m','i','n','g',...,'?'}
//        char[] characters = str.toCharArray();
//        String[] r = new String[26];
//        // 모든 문자 배열을 순회하며 검사
//        for (int i = 0; i < characters.length; i++) {
//            switch (characters[i]) {
//                // 모음
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'O':
//                case 'U':
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    vowel++;
//                    System.out.println("모음  :  " + characters[i]);
//                    break;
//                // 공백 및 특수 문자 제외
//                case ' ':  // 공백
//                case '\t': // 탭
//                case '\n': // 엔터
//                case ',':  // 쉼표
//                case '.':  // 마침표
//                case '!':  // 느낌표
//                case '?':  // 물음표
//                    System.out.println("예외  :  " + characters[i]);
//                    break;
//                // 그 외(자음)
//                default:
//                    conso++;
//                    System.out.println("자음  :  " + characters[i]);
//                    break;
//            }
//        }
//        return new int[] { conso, vowel };
    }
}
