package Passport;

import java.util.*;

public class Passport {

    private int idPassport;
    private String secondName;
    private String firstName;
    private String middleName;
    private String DateOfBorn;

    public Passport(int idPassport, String secondName, String firstName,
                    String middleName, String DateOfBorn) {

        if (idPassport != 0) {
            this.idPassport = idPassport;
        } else throw new RuntimeException("Field id name not correct "+ idPassport );

        if (secondName != null && !secondName.isEmpty() && !secondName.isBlank()) {
            this.secondName = secondName;
        } else throw new RuntimeException("Field second name not correct "+secondName);

        if (firstName != null && !firstName.isEmpty() &&!firstName.isBlank()) {
            this.firstName = firstName;
        } else throw new RuntimeException("Field first name not correct");

        if (middleName != null && !middleName.isEmpty() &&!middleName.isBlank()) {
            this.middleName = middleName;
        } else throw new RuntimeException("Field middle  name not correct");

        if (DateOfBorn != null && !DateOfBorn.isEmpty() &&!DateOfBorn.isBlank()) {
            this.DateOfBorn = DateOfBorn;
        } else throw new RuntimeException("Field second name not correct");

    }

//    public void findPassport(Passport id) {
//
//        for (Passport passport : setOfPassport) {
//            if (passport.getIdPassport()==id.getIdPassport()) {
//
//                System.out.println("Passport{" +
//                        ", idPassport=" + idPassport +
//                        ", secondName='" + secondName + '\'' +
//                        ", firstName='" + firstName + '\'' +
//                        ", middleName='" + middleName + '\'' +
//                        ", DateOfBorn='" + DateOfBorn + '\'' +
//                        '}');
//            }
//        }
//    }


    public int getIdPassport() {
        return idPassport;
    }

    public void setIdPassport(int idPassport) {
        this.idPassport = idPassport;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBorn() {
        return DateOfBorn;
    }

    public void setDateOfBorn(String dateOfBorn) {
        DateOfBorn = dateOfBorn;
    }

//    public Set<Passport> getSetOfPassport() {
//        return setOfPassport;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return idPassport == passport.idPassport && Objects.equals(secondName, passport.secondName) && Objects.equals(firstName, passport.firstName) && Objects.equals(middleName, passport.middleName) && Objects.equals(DateOfBorn, passport.DateOfBorn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPassport, secondName, firstName, middleName, DateOfBorn);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "idPassport=" + idPassport +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", DateOfBorn='" + DateOfBorn + '\'' +
                '}';
    }
}
