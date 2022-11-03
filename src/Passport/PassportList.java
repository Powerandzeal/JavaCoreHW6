package Passport;

import Product.Product;

import java.util.HashSet;
import java.util.Set;

public class PassportList {

    private Set<Passport> listOfPassport = new HashSet<Passport>();

    public void addPassport(Passport newPassport){
        if (!listOfPassport.add(newPassport)) {
            throw new RuntimeException("Passport already add");
        }
    }
    public void searchPassport(int number) {
        for (Passport passport : listOfPassport) {
            if (passport.getIdPassport()==number) {
                System.out.println(
                "Passport{" +
                        "idPassport=" + passport.getIdPassport() +
                        ", secondName='" + passport.getSecondName() + '\'' +
                        ", firstName='" + passport.getFirstName() + '\'' +
                        ", middleName='" + passport.getMiddleName() + '\'' +
                        ", DateOfBorn='" + passport.getDateOfBorn() + '\'' +
                        '}');
//                System.out.println(passport.getIdPassport());
            }
        }

    }

    public void printPassport() {
        System.out.println();
    }

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
