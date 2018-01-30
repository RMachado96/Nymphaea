
package GUI;
import java.lang.*;

public class Vendas {
    
    private String pNome;
    private String uNome;
    private int nifCliente;
    private String funcNome;
    private int funcID;    
    
    public Vendas(String pNome, String uNome, int nifCliente, String funcNome, int funcID)
    {
        this.pNome = pNome;
        this.uNome = uNome;
        this.nifCliente = nifCliente;
        this.funcNome = funcNome;
        this.funcID = funcID;
    }
    
    public String getPnome() {
        return this.pNome;
    }
    
    public String getUnome() {
        return this.uNome;
    }
    
    public int getnifCliente() {
        return this.nifCliente;
    }
    
    public String getfuncNome() {
        return this.funcNome;
    }
    
    public int getfuncID() {
        return this.funcID;
    }
    
}
