package farmacia;
import java.util.*;

class Pessoa
{
   private String pnome, unome;
   private int idade, rank, salario;
    
    
    Pessoa(String pnome, String unome, int idade, int rank)
    {
        this.pnome = pnome;
        this.unome = unome;
        this.idade = idade;
        this.rank = rank;
        this.salario = rank *880;
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
        this.rank = rank;
        this.salario = rank * 880;
    }
       
}

public class Empregado
{

    
    public static void main(String[] args)
    {
       
    }
    
}
