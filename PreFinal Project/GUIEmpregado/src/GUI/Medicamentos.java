
package GUI;
import java.lang.*;



public class Medicamentos {   
    // <editor-fold defaultstate="collapsed" desc="Variaveis.">
    private String mNome;
    private String mDesc;
    private float mPreco;
    private int mQuantidade;
    private int mID;
    static int total_stock;
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Constructores.">
    public Medicamentos(String mNome, String mDesc, float mPreco, int mQuantidade, int mID) {
        this.mNome = mNome;
        this.mDesc = mDesc;
        this.mPreco = mPreco;
        this.mQuantidade = mQuantidade;
        this.mID = mID;
        total_stock += mQuantidade;
    }
    
    public Medicamentos(String mNome, float mPreco, int mQuantidade, int mID) {
        this.mNome = mNome;
        this.mDesc = "This is a debug String";
        this.mPreco = mPreco;
        this.mQuantidade = mQuantidade;
        this.mID = mID;
        total_stock += mQuantidade;
    }
    
    public Medicamentos(String mNome, float mPreco, int mID) {
        this.mNome = mNome;
        this.mDesc = "This is a debug String";
        this.mPreco = mPreco;
        this.mQuantidade = 0;
        this.mID = mID;
    }
    
    public Medicamentos(String[] meds)
    {
        this.mNome = meds[1];
        this.mDesc = meds[2];
        this.mPreco = Float.parseFloat(meds[3]);
        this.mQuantidade = Integer.parseInt(meds[4]);
        this.mID = Integer.parseInt(meds[0]);
    }
    
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Sets.">
    public void setNomeItem(String inputValue) {
        this.mNome = inputValue;
    }
    
    public void setDescItem(String inputValue) {
        this.mDesc = inputValue;
    }
    
    public void setValorItem(float inputValue) {
        this.mPreco = inputValue;
    }
    
    public void setQuantItem(int inputValue) {
        this.mQuantidade = inputValue;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Gets.">
    public String getNomeItem() {
        return this.mNome;
    }
    
    public String getDescItem() {
        return this.mDesc;
    }
    
    public float getValorItem() {
        return this.mPreco;
    }
    
    public int getQuantItem() {
        return this.mQuantidade;
    }
    
    public int getmID() {
        return this.mID;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Adicionar e Retirar items de stock.">
    public void adicionarItem(int quant) {
        this.mQuantidade += mQuantidade;
    }
    
    public void eliminarItem(int quant) {
        this.mQuantidade -= mQuantidade;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Mudar valor items.">
    public void mudarValor(float mPreco) {
        this.mPreco = mPreco;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Listagens e Displays.">
    public void listarStock() {
        System.out.println("Nome do objecto: " + this.mNome 
                + " | Descrição: " + this.mDesc + " | Preço: " 
                + this.mPreco+ "| Stock disponivel: " + this.mQuantidade);   
    }  
    // </editor-fold>           
}