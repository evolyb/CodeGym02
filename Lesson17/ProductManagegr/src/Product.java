import java.io.Serializable;

public class Product implements Serializable {
    private int iD;
    private String name;
    private String brand;
    private int price;
    private String note;


    public Product(int iD, String name, String brand, int price, String note) {
        this.iD = iD;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.note = note;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
