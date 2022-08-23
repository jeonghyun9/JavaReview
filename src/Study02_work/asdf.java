package Study02_work;

public class asdf {

    public static void main(String[] args) {

        int n = 2000;

        boolean a = Calcaulater(n);

        System.out.printf("%d년은 윤년입니까? %s", n, a);

//        Calcaulater(1604);
//        Calcaulater(1700);
//        Calcaulater(4);
//        Calcaulater(100);
//        Calcaulater(2004);
//        Calcaulater(1000);


        //System.out.printf("%d년은 윤년입니까? %s", n, a);

    }

    public static boolean Calcaulater(int year) {


        boolean result = false;
        if (year % 4 == 0) {
            result = true;
            if (year % 100 == 0) {
                result = false;
                if (year % 1000 == 0) {
                    result = true;
                }
            }
        }

        return result;
    }
}

//    public static boolean test(int year) {
//
//        boolean result = false;
//        String a = "";
//
//        if (year % 4 == 0) {
//            result = true;
//            a="true";
//            if (year % 100 == 0) {
//                result = false;
//                a="false";
//                if (year % 1000 == 0) {
//                    result = true;
//                    a = "true";
//                }
//            }
//        }
//        return result;
//    }
//    //# Hint 4: 결과를 출력하세요.
//        System.out.printf("%d년은 윤년입니까? %s\n",year,a);
//}


