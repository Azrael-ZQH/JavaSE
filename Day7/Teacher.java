package Day7;

public class Teacher {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void seAge(int age) {
        if (age <= 0 || age > 200) {
            System.out.println("输入年龄有误");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void teach() {
        System.out.println(name);
        System.out.println(age);
        System.out.println("教学");
    }
}
