package exercicios.exercicio03;

public class Casa {
    String cor;
    Janela janela1 = new Janela();
    Janela janela2 = new Janela();
    Janela janela3 = new Janela();

    void pinta (String s){
        cor = s;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Janela getJanela1() {
        return janela1;
    }

    public void setJanela1(Janela janela1) {
        this.janela1 = janela1;
    }

    public Janela getJanela2() {
        return janela2;
    }

    public void setJanela2(Janela janela2) {
        this.janela2 = janela2;
    }

    public Janela getJanela3() {
        return janela3;
    }

    public void setJanela3(Janela janela3) {
        this.janela3 = janela3;
    }

    int quantidadejanelasAbertas(){

        int janelasAbertas = 0;

        if (janela1.estaAberta() == true){

            janelasAbertas = janelasAbertas  + 1;
        }

        if (janela2.estaAberta() == true){

            janelasAbertas = janelasAbertas  + 1;
        }

        if (janela3.estaAberta() == true){

            janelasAbertas = janelasAbertas  + 1;
        }

        return janelasAbertas;

    }






}
