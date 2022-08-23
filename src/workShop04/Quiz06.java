package workShop04;

public class Quiz06 {
    public static void main(String[] args) {
        Student_[] stu = new Student_[3];
        stu[0] = new Student_("홍길동", 15, 171, 81);
        stu[1] = new Student_("한사람", 13, 183, 72);
        stu[2] = new Student_("임걱정", 16, 175, 65);

        System.out.print("이름\t   나이\t신장\t몸무게\n");
        for (int i = 0; i < stu.length; i++) {
            System.out.printf("%s\t%d\t%d\t%d\n",stu[i].name,stu[i].age,stu[i].height,stu[i].weight);
        }
        System.out.println();
        int ageSum = 0;
        int heightSum = 0;
        int weightSum = 0;
        for (int i = 0; i < stu.length; i++) {
            ageSum += stu[i].getAge();
            heightSum += stu[i].getHeight();
            weightSum += stu[i].getWeight();
        }
        double ageAvg = (double) ageSum/3;
        double heightAvg = (double) heightSum/3;
        double weightAvg = (double) weightSum/3;
        System.out.printf("나이의 평균: %.2f\n",ageAvg);
        System.out.printf("신장의 평균: %.2f\n",heightAvg);
        System.out.printf("몸무게의 평균: %.2f\n",weightAvg);


    }
}

class Student_ {
    String name;
    int age;
    int height;
    int weight;

    public Student_() {

    }

    public Student_(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student_{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
