package workShop04;

public class Quiz01 {
    public static void main(String[] args) {
       /*
       평균 점수가 100이하~90이상 점이면 A학점, 90미만~70이상 이면 B학점, 70미만~50이상 이면
       C학점, 50미만~30이상 이면 D학점, 나머지는 F학점으로 화면에 출력 한다.
       */
        Student s1 = new Student("Kim", 100, 90, 95, 89);
        Student s2 = new Student("Lee", 60, 70, 99, 98);
        Student s3 = new Student("Park", 68, 86, 60, 40);

        System.out.printf("%s의 평균: %.1f 학점: %s\n",s1.getName(), s1.getAvg(),s1.getGrade(s1.getAvg()));
        System.out.printf("%s의 평균: %.1f 학점: %s\n",s2.getName(), s2.getAvg(),s2.getGrade(s2.getAvg()));
        System.out.printf("%s의 평균: %.1f 학점: %s",s3.getName(), s3.getAvg(),s3.getGrade(s3.getAvg()));
    }
}

class Student {
    private String name;
    private int korean;
    private int english;
    private int math;
    private int science;

    public Student() {
    }

    public Student(String name, int korean, int english, int math, int science) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.science = science;
    }

    public double getAvg() {
        double avg = (double) (korean+english+math+science)/4;
        return avg;
    }

    public String getGrade(double avg) {
        String grade;
        if (avg >= 90) {
            return grade = "A학점";
        } else if (avg >= 70) {
            return grade = "B학점";
        } else if (avg >= 50) {
            return grade = "C학점";
        } else if (avg >= 30) {
            return grade = "D학점";
        } else {
            return grade = "F학점";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", korean=" + korean +
                ", english=" + english +
                ", math=" + math +
                ", science=" + science +
                '}';
    }
}
