package exercicios.exercicio02;

public class Janela {
    private String cor;
    private int dimensaoX, dimensaoY, dimensaoZ;
    private boolean aberta;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void abre(){
        aberta = true;
    }
    public void fecha(){
        aberta = false;
    }

    public void pinta (String s){
        cor = s;

    }

    public boolean estaAberta(){
        if (aberta == true){
            return true;
        } else {
            return false;
        }

    }


}
