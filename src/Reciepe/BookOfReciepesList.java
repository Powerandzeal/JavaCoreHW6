package Reciepe;
import Product.Product;
import java.util.HashSet;
import java.util.Set;

public class BookOfReciepesList {

    Set<Recipe> bookset = new HashSet<>();
    public void addReciepe(Recipe recipe) {
        if (!bookset.add(recipe)) {
            throw new RuntimeException("Receipt already add");
        }
    }

    @Override
    public String toString() {
        return "Book Of ReciepesList{" +
                "bookset=" + bookset +
                '}';
    }




}
