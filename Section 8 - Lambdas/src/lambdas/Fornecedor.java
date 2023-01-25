package lambdas;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.List;

public class Fornecedor {

    public static void main(String[] args) {

        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
        System.out.println(umaLista.get());
    }
}
