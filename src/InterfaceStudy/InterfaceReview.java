package InterfaceStudy;

public class InterfaceReview {
    public static void main(String[] args) {
        // 객체 생성
        Dog dog = new Dog("Dog");
        Baby baby = new Baby("Baby");
        Tiger tiger = new Tiger("Tiger");
        Robot robot = new Robot("Robot");

        // 인터페이스 배열 생성
        // ArryList<Sounding> list = new ArryList<>();
        // list.add(dog);
        // list.add(baby);
        // list.add(tiger);
        // list.add(robot);

        Sounding[] sounds = {dog, baby, tiger, robot};

        // 소리내기
//        for (int i = 0; i<sounds.length; i++) {
//            sounds[i].sound();
//        }
        for (Sounding i:sounds) {
            i.sound();
        }
    }
}

/* 인터페이스 및 클래스를 작성하시오. */
interface Sounding{
    public void sound();
}

class Dog implements Sounding{

    private String name;

    public Dog(String name){
        this.name = name;
    }

    public void sound(){
        System.out.printf("%s: 멍멍!\n", name);
    }
}

class Baby implements Sounding{
    private String name;

    public Baby(String name){
        this.name = name;
    }

    public void sound(){
        System.out.printf("%s: 응애!\n", name);
    }
}

class Tiger implements Sounding{
    private String name;

    public Tiger(String name){
        this.name = name;
    }

    public void sound(){
        System.out.printf("%s: 어흥!\n", name);
    }
}

class Robot implements Sounding{
    private String name;

    public Robot(String name){
        this.name = name;
    }

    public void sound(){
        System.out.printf("%s: 삐빕!\n", name);
    }
}
