import java.util.ArrayList;
import java.util.List;
import Product;
// we are using product service to perform all the business logic for our productManagementApplication
public class productService
{
   // we need to create a list to hold all our products
   List<Product> products = new ArrayList<>();

   // we create a method to save a product to our list
    public void addToList(Product product){
        addToList.add(product);
    }
}
