package Day7_train;

public class GirlFriend {
    String name;
    float height;
    float weight;

    public GirlFriend() {
    }

    public GirlFriend(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void wash() {
        System.out.println("洗衣服");
    }

    public void cook() {
        System.out.println("做饭");
    }

    public void show() {
        System.out.println("我的女朋友姓名：" + name + "身高：" + height + "体重：" + weight);
    }
}
