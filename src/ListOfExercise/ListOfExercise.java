package ListOfExercise;

import java.util.HashSet;
import java.util.Set;

public class ListOfExercise {

    private Set<Integer> exercise = new HashSet<>();
    private Set<String> exercise1 = new HashSet<>();


    Integer value1;
    Integer value2;


//    public String expression = value1.toString() +"*"+ value2.toString();


    public void createExercise() {

        for (int i = 1; i <= 15; ) {
            value1 = (int) (1+ Math.random()*9);
            value2 = (int) (1+ Math.random()*9);


//            String expression = value1.toString() +" * "+ value2.toString();
            if (exercise.contains(value1 * value2)) {
                continue;
            }

            System.out.println("Пример №"+ i+" : " +value1.toString() +"*"+ value2.toString()  );
            exercise.add(value1*value2);
            i++;
        }
        System.out.println(exercise);
    }

    public void createExercise1() {

        for (int i = 1; i <= 15; ) {
            value1 = (int) (1+ Math.random()*9);
            value2 = (int) (1+ Math.random()*9);

//            System.out.println("Пример №"+ i+" : " +value1.toString() +"*"+ value2.toString()  );
            String expression = value1.toString() +" * "+ value2.toString();
            String expressio1 = value2.toString() +" * "+ value1.toString();

            if (!exercise1.contains(expression) && (!exercise1.contains(expressio1))) {
                exercise1.add(expression);
                System.out.println("Пример №"+ i+" : " + expressio1  );
                i++;

            }

        }
    }

//    public void createExercise() {   Рабочий вариант
//
//        for (int i = 1; i <= 15; ) {
//            value1 = (int) (1+ Math.random()*9);
//            value2 = (int) (1+ Math.random()*9);
//
////            String expression = value1.toString() +" * "+ value2.toString();
//            if (exercise.contains(value1 * value2)) {
//                continue;
//            }
//
//            System.out.println("Пример №"+ i+" : " +value1.toString() +"*"+ value2.toString()  );
//            exercise.add(value1*value2);
//            i++;
//        }
//        System.out.println(exercise);
//    }
//
//


//    public void createExercise() {
//
//        for (int i = 1; i <= 15; i++) {
//            value1 = (int) (1+ Math.random()*9);
//            value2 = (int) (1+ Math.random()*9);
//
//            System.out.println("Пример №"+ i+" : " +value1.toString() +"*"+ value2.toString()  );
//
//            String expression = value1.toString();
//
////            Exercise.add()
//        }
//
//
//
//    }
//


    @Override
    public String toString() {
        return "ListOfExercise{" +
                "Exercise=" + exercise +
                ", value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
