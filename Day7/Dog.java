package Day7_train;

public class Dog {
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void eat() {
        System.out.println(color + "的" + breed + "正在吃骨头");
    }

    public void lookHome() {
        System.out.println(color + "的" + breed + "正在看家");
    }
}
