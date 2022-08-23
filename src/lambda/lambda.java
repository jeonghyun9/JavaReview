package lambda;

public class lambda {
    public static void main(String[] args) {

        A a1 = new B();
        a1.abc();


        // #2. 객체지향 프로그래밍 문법2 (case2) :  익명이너클래스 사용
        A a2 = new A() {
            @Override
            public void abc() {
                System.out.println("메서드 내용2");
            }
        };
        a2.abc();

        // #3. 함수적 프로그래밍 문법 (람다식) (case3)
        A a3 = () -> { System.out.println("메서드 내용3"); };
        a3.abc();



    }
}

interface A {
    void abc();
}

class B implements A {

    @Override
    public void abc() {
        System.out.println("메서드 내용1");
    }
}