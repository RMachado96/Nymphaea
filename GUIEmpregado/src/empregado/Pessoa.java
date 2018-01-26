package empregado;
import java.lang.*;


class testarRank extends Exception {
    
    testarRank(){super();}
    testarRank(String msg){super(msg);}
}

public class Pessoa {
    
    // <editor-fold defaultstate="collapsed" desc="Variaveis.">
    private String pNome;
    private String uNome;
    private String posicao;
    private String estado;
    private int idade; 
    private int rank; 
    private int salario;
    private final int SALARIO_BASE = 880;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Construtor.">
    public Pessoa(String pNome, String uNome, String estado, int idade, int rank) throws testarRank
    {
        this.pNome = pNome;
        this.uNome = uNome;
        this.idade = idade;
        this.estado = estado;
        if (rank<0 || rank>4) {
            throw new testarRank();
        }
        else {
            this.rank = rank;
        }
        this.salario = rank * SALARIO_BASE;
        this.posicao = posicao();     
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setup da posicao.">
    public String posicao() {
        switch (this.rank) {
            case 1: 
                return("Farmacêutico de 1 ano");                      
            case 2: 
                return("Farmacêutico de 5 anos");           
            case 3: 
                return("Farmacêutico de 10 anos");            
            case 4: 
                return("Gerente de farmácia");                    
        }
        return null;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Sets.">
    public void setPnome(String nome) {
        this.pNome = nome;
    }
    
    public void setUnome(String nome) {
        this.uNome = nome;
    }
    
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public void setRank(int rank) {
        try {   
            condRank(rank);
            this.rank = rank;
            this.salario = rank * SALARIO_BASE;
            this.posicao = posicao();
        }
        catch (testarRank tR) {
            System.out.println("O rank tem de ser entre 1 e 4");
        }
    }
    
    static void condRank(int rank) throws testarRank {
        if (rank<0 || rank>4) {
            throw new testarRank();
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Gets.">
    public String getPnome() {
        return this.pNome;
    }
    
    public String getUnome() {
        return this.uNome;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public String getPosicao() {
        return this.posicao;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public int getRank() {
        return this.rank;
    }
    
    public int getSalario() {
        return this.salario;
    }
   // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="Display.">
    public String display()
    {    
        return(this.pNome + "|" + this.uNome + "|" + this.posicao + "|" +this.idade + "|" + this.salario + "|" + this.estado);
    }
    // </editor-fold>
       
}