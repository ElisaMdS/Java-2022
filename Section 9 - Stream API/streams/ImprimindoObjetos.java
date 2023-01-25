package streams;

//import java.util.*;
//import java.util.stream.Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{100, 200, 100},
                new int[] {50, 100, 100},
                100,
                100));
//        System.out.println(getMappedValue("123=88 24=166 67=138", 123)); // should return 88
//        System.out.println(getMappedValue("123=88 24=166 67=138", 99)); // should return 99
//        System.out.println(getMappedValue("123= 24=166 67=138", 24)); // should return 166
//        System.out.println(getMappedValue("123=;;;88 24=166 67=138", 24)); // should return 166
//        System.out.println(getMappedValue("123-88 24=166", 24)); // should return 266
//        System.out.println(getMappedValue("123-88", 24)); // should return 24

//        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
//
//        System.out.println("Usando o foreach...");
//        for (String nome: aprovados) {
//            System.out.println(nome);
//        }
//
//        System.out.println("\nUsando Iterator...");
//        Iterator<String> iterator = aprovados.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        System.out.println("\nUsando Stream...");
//        Stream<String> stream = aprovados.stream();
//        stream.forEach(System.out::println); //Laço interno!!!
    }

    public static int solution(int[] A, int[] B, int X, int Y) {
        // Implement your solution here

        for (int cont = 0; cont < A.length; cont++) {
            if ((A[cont] - 20 <= X && A[cont] + 20 >= X)
                    &&
                    (B[cont] - 20 <= Y && B[cont] + 20 >= Y)) return cont;
        }
        return -1;
    }

    public static int getMappedValue(String config, int lookupValue) {
        String[] configArray = config.split(" ");
        if(configArray.length == 0) return lookupValue;

        List<String> splitedConfig = Arrays.stream(config.split(" ")).toList();
        HashMap<Integer, Integer> configuration = new HashMap<Integer, Integer>();

        for (String item : splitedConfig) {
            String[] splitted = item.split("=");
            if(splitted.length <= 1) continue;
            if(!isNumeric(splitted[0]) || !isNumeric(splitted[1])) continue;
            configuration.put(Integer.parseInt(splitted[0]), Integer.parseInt(splitted[1]));
        }

        int result = configuration.containsKey(lookupValue) ? configuration.get(lookupValue) : lookupValue;

        return result;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
