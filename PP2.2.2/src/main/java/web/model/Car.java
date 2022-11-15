package web.model;

public class Car {

    private String model;
    private String color;
    private int price;

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Car() {
    }

    public void setModel(String model) { this.model = model; }

    public String getModel() { return model; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }
}
