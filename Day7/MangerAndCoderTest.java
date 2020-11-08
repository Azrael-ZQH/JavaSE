package Day7_train;

public class MangerAndCoderTest {
    public static void main(String[] args) {
        Manager m = new Manager("", "123", 15000, 6000);
        Coder c = new Coder("", "135", 10000);
        m.work();
        c.work();
    }
}
