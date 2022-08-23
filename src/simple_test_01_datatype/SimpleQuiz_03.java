package simple_test_01_datatype;

public class SimpleQuiz_03 {
    public static void main(String[] args) {

        /*
        * 홍길동 씨의 주민등록번호는 881120-1068234이다.
        * 홍길동 씨의 주민등록번호를 연월일(YYYYMMDD) 부분과 그 뒤의 숫자부분으로
        * 나누어 출력해보자.
        */

        PesronInfo pesronInfo = new PesronInfo("홍길동","881120-1068234");
        String preNum = pesronInfo.getIdNum().substring(0, 6);
        String aftNum = pesronInfo.getIdNum().substring(7);
        System.out.printf("%s : 19%s-%s",pesronInfo.getName(),preNum,aftNum);

    }
}

class PesronInfo{

    private String name = "홍길동";
    private String idNum = "881120-1068234";

    public PesronInfo(String name, String idNum) {
        this.name = name;
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }
}
