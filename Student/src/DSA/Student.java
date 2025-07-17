package DSA;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String ada, int age, double grade) {
        this.name = name;
        setAge(age);
        setGrade(grade);
    }
    public String getName() {
        return name;
    }
    public int setAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        }
    }
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }
}
