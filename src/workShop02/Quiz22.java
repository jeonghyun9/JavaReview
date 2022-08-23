package workShop02;

public class Quiz22 {
    public static void main(String[] args) {
        String s = "ABCDE";
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            a += s.split("")[i];
            System.out.println(a);
//            System.out.println(s.length());
        }

    }
}
