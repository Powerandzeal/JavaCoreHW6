package ArbitrarVvalues;

import javax.swing.*;
import java.util.*;

public class Hw2Ex1 {

    private static final  Map<String, List<Integer>>mapFrom =new HashMap<>();
    private static final  Map<String,Integer>mapTo =new HashMap<>();


    private static void check() {

        Random random =new Random();

        List<Integer> list = new ArrayList<>(List.of(2, 6, 3));
        for (int i = 0; i < 15; i++) {
            list.add( random.nextInt(10));
        }
        List<Integer> list1 = new ArrayList<>(List.of(2, 6, 3));
        for (int i = 0; i < 15; i++) {
            list.add( random.nextInt(10));
        }
        List<Integer> list2 = new ArrayList<>(List.of(2, 6, 3));
        for (int i = 0; i < 15; i++) {
            list.add( random.nextInt(10));
        }

        mapFrom.put("List 1 ",list );
        mapFrom.put("List 2 ",list1 );
        mapFrom.put("List 3 ",list2 );

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

    }



}
