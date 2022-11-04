import ArbitrarVvalues.ArbitraryValues;
import ArbitrarVvalues.Hw2Ex1;
import Ex2and2.Number;
import ListOfExercise.ListOfExercise;
import Passport.Passport;
import Passport.PassportList;
import Product.Product;
import Reciepe.BookOfReciepesList;
import Reciepe.Recipe;
import Product.ProductList;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    private static final  Map<String, List<Integer>>mapFrom =new HashMap<>();
    private static final  Map<String,Integer>mapTo =new HashMap<>();
    public static void main(String[] args) {

        Number numbers = new Number();
        //numbers.createNumber();
        System.out.println("---------------------------------");
       // numbers.removeOddValues();

        //ListOfExercise listOfExercise = new ListOfExercise();

       // listOfExercise.createExercise();

        System.out.println();

        //listOfExercise.createExercise1();


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
// Maps новое дз "Урок про мапы  задание 1.1"

        System.out.println("--------------------------------------");
        Map<String,Integer> booksPhone = new HashMap<>();
        booksPhone.put("Anatoly Ivonov",2378434);
        booksPhone.put("Dmirty Evgenev",6788559);
        booksPhone.put("Sergey Kim",585994);
        booksPhone.put("Anatoly Kik",8854954);
        booksPhone.put("Anatoly Panin",377484);
        booksPhone.put("Denis Duntsev",899203);
        booksPhone.put("Anatoly Medvev",758594);
        booksPhone.put("Vladimir Petrov",5466464);
        booksPhone.put("Fig Ignatme",80876655);
        booksPhone.put("Jemy Jokov",434343);
        booksPhone.put("Andtey Rublev",323232);
        booksPhone.put("Anatoly Tsicipas",7636363);
        booksPhone.put("Novak Djokovich",3636363);
        booksPhone.put("Karen Chachanov",53334546);
        booksPhone.put("Rafael Nadal",6373464);
        booksPhone.put("Oleg Kizary",543737);
        booksPhone.put("Simon Ouyasim",765488);
        booksPhone.put("Franchesko Pidrilio",536373);
        booksPhone.put("Gustav Engyls",6363364);
        booksPhone.put("Van Gogechvili",6363934);
        System.out.println(booksPhone);

        System.out.println(booksPhone.size());

        booksPhone.get(7);
        System.out.println(booksPhone.get("Van Gogechvili"));
        // Exercise 2------------------------------------------------------------------------------

        ProductList list = new ProductList();

        Product garlick = new Product("Чеснок", 12, 1);
        Product egs = new Product("Яйца", 33, 1);
        Product meat = new Product("Мясо", 105, 1);
        Product cabbage = new Product("Капуста", 11, 8);
        Product cucumber = new Product("Огурец", 12, 1);
        Product camamber = new Product("Камамбер", 32, 1);
        Product parmegano = new Product("Пармезан", 21, 1);


        list.addProduct(egs);
        list.addProduct(cabbage);
        list.addProduct(cucumber);
        list.addProduct(garlick);
        list.addProduct(meat);

        Recipe solanka = new Recipe("Солянка");
        solanka.addProduct(garlick,2);
        solanka.addProduct(meat,3);
        solanka.addProduct(egs,4);
        solanka.addProduct(cabbage,5);

        System.out.println(solanka);

        Recipe messivo = new Recipe("Messivo");
        messivo.addProduct(egs,2);
        messivo.addProduct(cabbage,4);
        messivo.addProduct(garlick,3);
        messivo.addProduct(meat,1);
        System.out.println(messivo);


        BookOfReciepesList book = new BookOfReciepesList();
        book.addReciepe(solanka);

        //Exercise 3 --------------------------------------------------
        ArbitraryValues values = new ArbitraryValues();
        values.addKeyAndValues("Panin Sergey", 34672);
        values.addKeyAndValues("Robert Dayni", 12453);
        values.addKeyAndValues("Ted Lasso", 22421);
        values.addKeyAndValues("Franchesko Pojo", 423324);

        System.out.println(values);
        values.addKeyAndValues("Panin Sergey", 22242);
        System.out.println(values);
        //Exercise 4 -------------------------------------
//        Hw2Ex1 listForNubmer = new Hw2Ex1();



        Random random =new Random();

        List<Integer> list1 = new ArrayList<>(List.of(2, 6, 3));
        for (int i = 0; i < 15; i++) {
            list1.add( random.nextInt(10));
        }

        List<Integer> list2 = new ArrayList<>(List.of(2, 6, 3));
        for (int i = 0; i < 15; i++) {
            list2.add( random.nextInt(10));
        }
        List<Integer> list3 = new ArrayList<>(List.of(2, 6, 3));
        for (int i = 0; i < 15; i++) {
            list3.add( random.nextInt(10));
        }

        mapFrom.put("List 1 ",list1 );
        mapFrom.put("List 2 ",list2 );
        mapFrom.put("List 3 ",list3 );

        System.out.println(mapFrom);

        for (var keyset : mapFrom.keySet()) {
            Integer sum = 0;
            List<Integer> templist = mapFrom.get(keyset);
            for (Integer integerSum: templist) {
                sum += integerSum;
            }
            mapTo.put(keyset,sum);
        }
        System.out.println(mapTo);
        //Exercise 5-----------------------------------------------------------------------
        Map<Integer,String> mapa5 = new LinkedHashMap<>();

        mapa5.put(11,"eleventh");
        mapa5.put(1,"First");
        mapa5.put(2,"Second");
        mapa5.put(3,"Third");
        mapa5.put(4,"fourth");
        mapa5.put(5,"fifth");
        mapa5.put(6,"sixth");
        mapa5.put(7,"seventh");
        mapa5.put(8,"eighth");
        mapa5.put(9,"ninth");
        mapa5.put(10,"tenth");

        System.out.println(mapa5);







    }

}