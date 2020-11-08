package Day7_train;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("小米", 3998, "black");
        System.out.println(p1.getBrand() + p1.getPrice() + p1.getColour());
        System.out.println(p1);
        p1.call();
        p1.sendMessage();
        Phone p2 = new Phone();
        p2.setBrand("华为");
        p2.setPrice(998);
        p2.setColour("white");
        System.out.println(p2.getBrand() + p2.getPrice() + p2.getColour());
        System.out.println(p2);
        p2.call();
        p2.sendMessage();
    }
}
