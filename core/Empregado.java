package core;
import java.lang.*;

class testarRank extends Exception
{
    testarRank(){super();}
    testarRank(String msg){super(msg);}
}

public class empregado
{
    // <editor-fold defaultstate="collapsed" desc="Variaveis.">
    private String pnome;
    private String unome;
    private String posicao;
    private String estado;
    private int idade; 
    private int rank; 
    private int salario;
    private final int salarioBase = 880;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Construtor.">
    public empregado(String pnome, String unome, String estado, int idade, int rank) throws testarRank
    {
        this.pnome = pnome;
        this.unome = unome;
        this.idade = idade;
        this.estado = estado;
        if(rank<0 || rank>4){throw new testarRank();}
        else{this.rank = rank;}
        this.salario = rank * salarioBase;
        this.posicao = posicao();
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setup da posicao.">
    public String posicao()
    {
        switch(this.rank)
        {
            case 1: return("Farmacêutico de 1 ano");           
            
            case 2: return("Farmacêutico de 5 anos");
            
            case 3: return("Farmacêutico de 10 anos");
            
            case 4: return("Gerente de farmácia");
                            
        }
        return null;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Sets.">
    public void setPnome(String pnome)
    {
        this.pnome = pnome;
    }
    
    public void setUnome(String unome)
    {
        this.unome = unome;
    }
    
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public void setRank(int rank) //promoção
    {
        try
        {   
            condRank(rank);
            this.rank = rank;
            this.salario = rank * salarioBase;
            this.posicao = posicao();
        }
        catch(testarRank tR) {System.out.println("O rank tem de ser entre 1 e 4");}
       {
                 
       }
    }
    
    static void condRank(int rank) throws testarRank
    {
        if(rank<0 || rank>4){throw new testarRank();}
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Gets.">
    public String getPnome()
    {
        return this.pnome;
    }
    
    public String getUnome()
    {
        return this.unome;
    }
    
    public String getEstado()
    {
        return this.estado;
    }
    
    public String getPosicao()
    {
        return this.posicao;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public int getRank()
    {
        return this.rank;
    }
    
    public int getSalario()
    {
        return this.salario;
    }
   // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="Variaveis.">
    public String Display()
    {    
        return(this.pnome + "|" + this.unome + "|" + this.posicao + "|" +this.idade + "|" + this.salario + "|" + this.estado);
    }
    // </editor-fold>
       
}
