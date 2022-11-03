import Ex2and2.Number;
import ListOfExercise.ListOfExercise;
import Passport.Passport;
import Passport.PassportList;
import Product.Product;
import Reciepe.BookOfReciepesList;
import Reciepe.Recipe;
import Product.ProductList;

import java.util.HashSet;
import java.util.Set;

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

        ListOfExercise listOfExercise = new ListOfExercise();

        listOfExercise.createExercise();

        System.out.println();

        listOfExercise.createExercise1();


        Set<Passport>passports = new HashSet<>();

        Passport p1 = new Passport(1224442,"Sergey","Panin",
                "Igorevich", "1999");

        Passport p2 = new Passport(2232432,"Oleg","Nicheporenko",
                "ivanovic","1838");

        Passport p3 =new Passport(1254512,"Petrov","Ivan",
                "Ivanovich","1878");

        PassportList passportList = new PassportList();

        passportList.addPassport(p2);
        passportList.addPassport(p1);
        passportList.addPassport(p3);

        passportList.searchPassport(2232432);


    }

}