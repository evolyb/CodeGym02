import java.io.Serializable;
import java.util.ArrayList;

public class ProductManagement implements Serializable {
    ArrayList<Product> myProducts = new ArrayList<>();
    public void add(Product p){
        myProducts.add(p);
    }
    public void remove(int iD){
        for (Product product:myProducts){
            if (product.getiD() == iD) {
                myProducts.remove(product);
                return;
            }
        }
    }
}
