package workShop02;

public class Quiz21 {
    public static void main(String[] args) {

        int n = 0 ;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%-2d ",n+j);
            }
            System.out.println();
            n+=10;
        }
    }
}
