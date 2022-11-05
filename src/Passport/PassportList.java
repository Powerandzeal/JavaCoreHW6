package Passport;

import Product.Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PassportList {

    public Map<Integer, Passport> listOfPassport = new HashMap<Integer,Passport>();

    public void addPassport(Integer id,Passport newPassport) {

        if (!listOfPassport.containsKey(id)) {

            listOfPassport.put(id,newPassport);

        }else throw new RuntimeException("Passport already add");
    }

//    public void addPassport(Integer id,Passport newPassport) {
//        if (!listOfPassport.put() {
//            throw new RuntimeException("Passport already add");
//        }
//    }

//    public void searchPassport(int number) {
//        for (Passport passport : listOfPassport) {
//            if (passport.getIdPassport() == number) {
//                System.out.println(
//                        "Passport{" +
//                                "idPassport=" + passport.getIdPassport() +
//                                ", secondName='" + passport.getSecondName() + '\'' +
//                                ", firstName='" + passport.getFirstName() + '\'' +
//                                ", middleName='" + passport.getMiddleName() + '\'' +
//                                ", DateOfBorn='" + passport.getDateOfBorn() + '\'' +
//                                '}');
////                System.out.println(passport.getIdPassport());
//            }
//        }
//
//    }


    @Override
    public String toString() {
        return "PassportList{" +
                "listOfPassport=" + listOfPassport +
                '}';
    }

    //    public Passport searchPassport(int number) {
//        for (Passport passport : listOfPassport) {
//            if (passport.getIdPassport()==number) {
//                return passport;
//            }
//        }
//        return null;
//    }


}
