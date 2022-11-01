import Ex2and2.Number;
import Product.Product;
import Reciepe.BookOfReciepesList;
import Reciepe.Recipe;
import Product.ProductList;

public class Main {
    public static void main(String[] args) {

        ProductList list = new ProductList();

        Product garlick = new Product("Чеснок", 12, 1);
        Product egs = new Product("Яйца", 33, 1);
        Product meat = new Product("Мясо", 105, 1);
        Product cabbage = new Product("Капуста", 11, 8);


        list.setOfProducts.add(garlick);
        list.setOfProducts.add(egs);
        list.setOfProducts.add(meat);
        list.setOfProducts.add(cabbage);
        list.setOfProducts.add(new Product("Маккароны", 23, 2));
        System.out.println(list);
        list.removeObject("Чеснок");
        System.out.println(list);

        Recipe solanka = new Recipe("Солянка");
        solanka.addProduct(garlick);
        solanka.addProduct(meat);
        solanka.addProduct(egs);
        solanka.addProduct(cabbage);
        System.out.println(solanka);

        BookOfReciepesList book = new BookOfReciepesList();
        book.addReciepe(solanka);

        Number numbers = new Number();
        numbers.createNumber();
        System.out.println("---------------------------------");
        numbers.removeOddValues();



    }

}