package Study02_work;

public class study_2_02 {

    public static void main(String[] arguments){

        /*
        Line 1
        >
        >
        >
        Line 2
        */


        System.out.println("Line 1");
        threeLines();
        System.out.println("Line 2");
    }

    public static void threeLines() {
        oneLine();
        oneLine();
        oneLine();
    }

    public static void oneLine() {
        System.out.println(">");
    }
}
