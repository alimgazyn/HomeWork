package P9;

public class ClothingProduct extends Product{
    double size;
    String material;
    public ClothingProduct(String product, double price, double weight, double size, String material) {
        super(product, price, weight);
        this.size = size;
        this.material = material;
    }
}
