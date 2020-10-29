package exercicios.exercicio03;

public class Main {

    public static void main(String[] args) {
	Casa casa = new Casa();

	casa.pinta("Amarelo");
	Janela janela1 = new Janela();
	Janela janela2 = new Janela();
	Janela janela3 = new Janela();
	casa.setJanela1(janela1);
	casa.setJanela2(janela2);
	casa.setJanela3(janela3);
	janela1.abre();
	janela2.abre();
	janela3.fecha();
        System.out.println(casa.quantidadejanelasAbertas());

    }
}
