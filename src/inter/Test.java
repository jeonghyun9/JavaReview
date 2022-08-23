package inter;

class CallByReference{

        int value;



        CallByReference(int value) {

        this.value = value;

        }



public static void swap(CallByReference x, CallByReference y) {

            int temp = x.value;
            System.out.println(temp);
            x.value = y.value;
            System.out.println(x.value);
            y.value = temp;
            System.out.println(y.value);

        }



public static void main(String[] args) {

        CallByReference a = new CallByReference(10);

        CallByReference b = new CallByReference(20);



        System.out.println("swap() 호출 전 : a = " + a.value + ", b = " + b.value);



        swap(a, b);



        System.out.println("swap() 호출 전 : a = " + a.value + ", b = " + b.value);

        }

}