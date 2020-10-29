package exercicios.exerciciofinal;

public class Main {

    public static void main(String[] args) {
        Integer x = new Integer(6) * 7;
        if (x != 42) {
            System.out.println("not 42");
        } else if (x.equals(42)) {
            System.out.println("entrada 1");
        } else {
            System.out.println("entrada 2");
        }
    }
}
