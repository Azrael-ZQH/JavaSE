package Day7;

public class Phone {
    int price;
    String band;

    public void call(int a) {
        System.out.println("打电话给" + a);
    }

    public void sendMessage(int a) {
        System.out.println("发短信给" + a);
    }
}
