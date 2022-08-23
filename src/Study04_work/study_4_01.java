package Study04_work;

public class study_4_01 {
    public static void main(String[] args) {
        /*
        문제
        요구사항을 만족하는 원기둥(Cylinder) 클래스를 구현하고, 출력 예와 같은 결과를 만드시오.

        요구사항
        원기둥 클래스는 아래의 필드와 메소드를 갖는다.

        필드:

        radius : 반지름
        height : 높이

        메소드:

        getVolume() : 부피 반환
        getArea() : 겉넓이 반환

        출력 예
        원기둥의 부피: 251.33
        원기둥의 겉넓이: 226.19
        */
        Cylinder c = new Cylinder(4,5);

        System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());


    }
}

class Cylinder {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume(/*double radius, double height*/) {
        double volume = Math.PI*radius*radius*height;
        return volume;
    }

    public double getArea(/*double radius, double height*/) {
        double area = (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
        return area;
    }
}
