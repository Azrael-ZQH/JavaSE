package Day9_StudentSystem;

public class Student {
    private String number;
    private String name;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String number, String name,int age, String birthday) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
