package exercicios.exercicio01;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Goku");
        p1.setIdade(45);
        p1.fazAniversario();
        p1.fazAniversario();
        System.out.println(p1.toString());
    }
}
