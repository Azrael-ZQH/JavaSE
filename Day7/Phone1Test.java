package Day7;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.price = 998;
        p.band = "菲尔普斯";
        System.out.println(p.band + "    " + p.price);
        p.call(12580);
        p.sendMessage(114);
    }
}
