package ArbitrarVvalues;

import java.util.HashMap;
import java.util.Map;

public class ArbitraryValues {

   public Map<String, Integer> values = new HashMap<>();


    public void addKeyAndValues(String key, Integer value) {

        if (values.containsKey(key) && values.get(key).equals(value)){
         throw new RuntimeException("value already add");
         }
         values.put(key,value);

    }

    public void check(String key, Integer value) {   /// its working
        System.out.println("Проверка значения");
        if (!values.get(key).equals(value)) {
            values.put(key, value);
        }
        System.out.println(values.get(key) + " = " + value);
    }

    @Override
    public String toString() {
        return "ArbitraryValues{" +
                "values=" + values +
                '}';
    }
}

// if (values.containsKey(key) && values.get(key).equals(value)){
//         throw new RuntimeException("");
//         }
//         values.put(key,value);


//        values.get(key).equals(value);


//    public void addKeyAndValues(String key, Integer value) {
//
////        values.get(key).equals(value);
//
//        if (!values.containsKey(key)&&!values.containsValue(value)) {
//            values.put(key,value);
//        } else throw new RuntimeException("Value and key is added");
//
//        if (!values.get(key).equals(value)) {
//            values.put(key,value);
//        }
//
//    }

//    public void check(String key,Integer value) {   /// its working  Она проверяет  значение которое находиться
//        System.out.println("Проверка значения");      под ключом которое я передал в аргумент метода
//                                                 если if выбрасывает тру тогда он перезаписывает значение
//        if (!values.get(key).equals(value)) {
//            values.put(key,value);
//        }
//        System.out.println(values.get(key)+ " = " + value);
//    }


//    public void addKeyAndValues(String key, Integer value) {
//        if (!values.containsKey(key)&&!values.containsValue(value)) {
//            values.put(key,value);
//        } else throw new RuntimeException("Value and key is added");
//    }
//
//}
