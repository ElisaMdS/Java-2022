package lambdas;

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b); //esse aqui é o método abstrato, qualquer método criado em Java é, por padrão, público e abstrato

    default String legal() { //método default
        return "legal";
    }

    static String muitoLegal() { //método estático
        return "muito legal";
    }

}

//Interface funcional: Interface que tem apenas um único método abstrato