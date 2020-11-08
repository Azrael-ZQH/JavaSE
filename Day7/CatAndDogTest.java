package Day7_train;

public class CatAndDogTest {
    public static void main(String[] args) {
        Cat c = new Cat("花色", "波斯猫");
        Dog d = new Dog("黑色", "藏獒");
        c.catchMouse();
        c.eat();
        d.lookHome();
        d.eat();
    }
}
