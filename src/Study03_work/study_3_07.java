package Study03_work;

public class study_3_07 {
    public static void main(String[] args) {

        //int result = (int) Math.pow(2, 3); // 8

/*
        적절한 온도에서 배양하면 하루에 두 배씩 번식하는 세균이 있다.
        첫날 한 마리의 세균을 배양하여 1일 뒤에 두 마리가 되고, 2일 뒤에는 네마리, 3일 뒤 8마리, …, 마지막 9일 뒤에 512마리가 되었다.

        위 과정을 준비된 코드를 통해 배열에 기록하고 출력하려 한다. 출력 예와 같은 결과를 얻도록, writeLog() 메소드를 완성하시오.

        출력 예
        [1, 2, 4, 8, 16, 32, 64, 128, 256, 512]
*/
        int[] bacteriaCountLogs = new int[10];

        // 개체 수 기록
        writeLog(bacteriaCountLogs);

        // 결과 출력
        printLog(bacteriaCountLogs);

    }

    public static void writeLog(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) Math.pow(2,i);
        }

    }

    public static void printLog(int[] y) {
        System.out.printf("[");
        for (int i = 0; i < y.length; i++) {
            System.out.printf("%d", y[i]);
            if (i!=y.length-1){
                System.out.printf(", ");
            }
        }
        System.out.printf("]");
    }
}
