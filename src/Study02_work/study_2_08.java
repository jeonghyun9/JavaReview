package Study02_work;

public class study_2_08 {
    public static void main(String[] args) {
        // 문제

        /*
        주어진 성적 변수에 대한 학점을 반환하는 메소드 grade() 를 완성하여, 출력 예와 같은 결과를 얻으시오.

        A+: 95점 이상
        A0: 90점 이상
        B+: 80점 이상
        B0: 70점 이상
        C+: 그 외
        */



        // 변수 생성
        int score1 = 96;
        int score2 = 85;
        int score3 = 76;

        // 결과 출력
        System.out.printf("%d점 -> %s\n", score1, grade(score1));
        System.out.printf("%d점 -> %s\n", score2, grade(score2));
        System.out.printf("%d점 -> %s\n", score3, grade(score3));
    }
    public static String grade(int score) {

        if (score >= 95){
            String result = "A+";
            return result;
        } else if (score >= 90) {
            String result = "A0";
            return result;
        } else if (score >= 80) {
            String result = "B+";
            return result;
        } else if (score >= 70) {
            String result = "B0";
            return result;
        } else {
            String result = "C+";
            return result;
        }
    }
}
