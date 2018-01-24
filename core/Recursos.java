package core;


public class Recursos {
    // <editor-fold defaultstate="collapsed" desc="Variaveis.">
    private String edificio;
    private int capacidadeMaxima;
    private int ocupacaoAtual;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Construtor.">
    public Recursos(String edificio, int capMax) {
        this.edificio = edificio;
        this.capacidadeMaxima = capMax;
        this.ocupacaoAtual = 0;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Gets.">
    public int getCapMax() {
        return this.capacidadeMaxima;
    }
    
    public int getOcupacaoAtual() {
        return this.ocupacaoAtual;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Sets.">
    public void setCapMax(int x) {
        this.capacidadeMaxima = x;
    }
    
    public void setOcupacaoAtual(int x) {
        this.ocupacaoAtual = x;
    }
    
    public void adiOcupacaoAtual(int x) {
        this.ocupacaoAtual += x;
    }
    
    public void subOcupacaoAtual(int x) {
        this.ocupacaoAtual -= x;
    }
    // </editor-fold>
}
