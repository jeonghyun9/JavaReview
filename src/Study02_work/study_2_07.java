package Study02_work;

public class study_2_07 {

    public static void main(String[] args) {

        /*
          체력과 마력이 동시에 2000 이상이여야만 착용 가능한 아이템이 있다.

          체력과 마력을 입력하여 착용 결과를 출력하는 메소드 wear()를 완성하고, 출력 예와 같은 결과를 얻으시오

          아이템 장착 완료!
          아이템을 착용할 수 없습니다.

         */

        wear(2400, 2000); // 체력 2400, 마력 2000 => 아이템 장착 완료!
        wear(3800, 1200); // 체력 3800, 마력 1200 => 아이템을 착용할 수 없습니다.

    }
    public static void wear(int hp, int mp) {
        /* 해당 메소드를 완성하시오 */
        if (hp>=2000&&mp>=2000){
            System.out.println("아이템 장착 완료!");
        } else {
            System.out.println("아이템을 착용할 수 없습니다.");
        }
    }
}
