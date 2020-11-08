package Day7_train;

public class Phone {
    private String brand;
    private int price;
    private String colour;

    public Phone() {
    }

    public Phone(String brand, int price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public void call() {
        System.out.println("正在使用价格为" + price + "元" + colour + "的" + brand + "手机打电话...");
    }

    public void sendMessage() {
        System.out.println("正在使用价格为" + price + "元" + colour + "的" + brand + "手机发短信...");
    }
}