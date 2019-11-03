package pl.coderslab.spring.mvc.cart;

public class Product {

    private static Long globalId = 1L;
    private Long id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = globalId;
        globalId++;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
