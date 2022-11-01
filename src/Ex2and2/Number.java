package Ex2and2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Number {

    private int num1 = 0;
    private int num2 = 20;

    List<Integer> numbers = new ArrayList<>();




    public void createNumber() {
        for (int i = 0; i < 20; i++) {
            numbers.add(num1 + (int) (Math.random() * num2));
            System.out.println("Создаем случайное число " + numbers.get(i));
        }
    }

    public void removeOddValues() {
        Iterator<Integer> iter = numbers.iterator();

        while (iter.hasNext()) {
            Integer n = iter.next();
            if (n % 2 == 1) {
                System.out.println("Удаляем нечетное число "+ n);
                iter.remove();
            }
        }
        System.out.println(numbers);

//        List<Integer> tmp = numbers.stream().filter(i -> i % 2 == 0).toList();
//        System.out.println(numbers);
//        System.out.println(tmp);
            }
        }





//        ArrayList<Integer> list = new ArrayList<>();
//        Iterator<Integer> iter = numbers.iterator();
//
//        while (iter.hasNext()) {
//            Integer num = iter.next();
//
//            if (num % 2 != 0) {
//                list.add(num);
//            }
//        }
//        numbers.removeAll(list);

//  for (int num : numbers) {
//                if (num % 2 != 0) {
//                    numbers.remove(numbers.get(num));
//                    System.out.println("Удаляем нечетное число "+ num);
//                }
//
//            }
//        for (int i = 0; i < 20; i++) {
//
//            if (numbers.get(i) % 2 != 0) {
//                numbers.remove(numbers.get(i));
//                System.out.println("Удаляем нечетное число "+ numbers.get(i));
//
//            }
//        }
