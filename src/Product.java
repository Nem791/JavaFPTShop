import java.util.ArrayList;
import java.util.Arrays;

public class Product {
    public enum Category {
        PHONE,
        LAPTOP,
        APPLE,
        ACCESSORY
    }

    String id;
    String name;
    String description;
    long price;
    int quantity;
    int sold;
    String company;
    Category type;

    public Product(String id, String name, String description, long price, int quantity, int sold, String company, Category type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.sold = sold;
        this.company = company;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", sold=" + sold +
                ", company='" + company + '\'' +
                ", type=" + type +
                '}';
    }


}
