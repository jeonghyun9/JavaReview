package simple_test_01_datatype;

public class SimpleQuiz_04 {
    public static void main(String[] args) {

        /*
        * 주민등록번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타낸다.
        * 주민등록번호에서 성별을 나타내는 숫자를 출력해 보자.
        *
        * >>> pin = "881120-1068234"
        */

        String pin = "881120-1068234";
        char c = pin.charAt(7);
        System.out.println(c);

    }
}
