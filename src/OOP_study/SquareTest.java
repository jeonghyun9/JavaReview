package OOP_study;

public class SquareTest {
  public static void main(String[] args) {
    /* 객체 생성 */
    Square square = new Square();
    /* 필드 초기화(값 변경) */
    square.length = 4;
    square.area();
    /* 결과 출력 */
    System.out.println("한 변의 길이가 "+square.length+"인 정사각형의 넓이: "+square.area());
  }
}

/* 정사각형 클래스 구현 */
class Square{


  int length;
  
  public int area(){
    int calc = length*length;
    return calc;
  }
}