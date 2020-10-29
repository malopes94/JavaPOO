package exercicios.exercicio02;

public class Main {

    public static void main(String[] args) {
	Janela j1 = new Janela();
	j1.pinta("Vermelho");
	j1.setDimensaoX(7);
	j1.setDimensaoY(9);
	j1.setDimensaoZ(3);
	j1.abre();
	j1.fecha();

				System.out.println(j1.estaAberta());
    }
}
