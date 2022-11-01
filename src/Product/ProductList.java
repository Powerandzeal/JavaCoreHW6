package Product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductList {
    public Set<Product> setOfProducts = new HashSet<>();


    public void addProduct(Product newProducts) {
        if (!setOfProducts.add(newProducts)) {
            throw new RuntimeException("Product already add");
        }

    }

//    public void createProduct(String name, int price, int weight) {
//        try {
//            Product.Product product = new Product.Product(name, price, weight);
//            System.out.println("Product.Product created: "+ product);
//            if (set.contains(product)) {
//                throw new RuntimeException("Product.Product: "+ product+ " already created");
//
//            }
//            set.add(product);
//            System.out.println("Product.Product : "+ product+" add to set");
//        } catch (RuntimeException e ) {
//            System.out.println(e.getMessage());
//        }
//    }

    public Set<Product> getSetOfProducts() {
        return setOfProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(setOfProducts, that.setOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setOfProducts);
    }

    @Override
    public String toString() {
        return "Список продуктов{" +
                "set=" +"\n"+ setOfProducts +
                '}';
    }

    public void removeObject(String name) {
        setOfProducts.removeIf(g -> g.getName().equals(name));
        System.out.println("Удалаяем из списка "+ name);
    }
}
