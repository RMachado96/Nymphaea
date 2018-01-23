package farmacia;
import java.lang.*;

class testarRank extends Exception
{
    testarRank(){super();}
    testarRank(String msg){super(msg);}
}

class Pessoa
{
   private String pnome, unome, posicao;
   private int idade, rank, salario;
       
    Pessoa(String pnome, String unome, int idade, int rank)
    {
        this.pnome = pnome;
        this.unome = unome;
        this.idade = idade;
        this.rank = rank;
        this.salario = rank *880;
        posicao();
        
    } 
    
    public void posicao()
    {
        switch(this.rank)
        {
            case 1: this.posicao = "Farmacêutico de 1 ano";
            break;
            
            case 2: this.posicao = "Farmacêutico de 5 anos";
            break;
            
            case 3: this.posicao = "Farmacêutico de 10 anos";
            break;
            
            case 4: this.posicao = "Gerente de farmácia";
            break;                
        }
    }
    
    public void setPnome(String pnome)
    {
        this.pnome = pnome;
    }
    
    public void setUnome(String unome)
    {
        this.unome = unome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
   
    public void setRank(int rank) //promoção
    {
        try
        {   
            this.rank = rank;
            condRank(rank);
            this.salario = rank * 880;
            posicao();
        }
        catch(testarRank tR) {System.out.println("O rank tem de ser entre 1 e 4");}
       {
                 
       }
    }
    
    static void condRank(int rank) throws testarRank
    {
        if(rank<0 || rank>4){throw new testarRank();}
    }
   
        
    
        
    void Display()
    {
        
        System.out.println(this.pnome +" "+ this.unome +" " + this.posicao +" " +this.idade +" "+ this.salario);
    }
       
}

public class Empregado
{

    
    public static void main(String[] args)
    {
       Pessoa Ricardo = new Pessoa("Ricardo","Machado",19,1);
       Ricardo.Display();
       Ricardo.setRank(5);
       Ricardo.Display();
       
     
    }
   
    
    
}
