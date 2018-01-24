package core;

public class item
{   
    // <editor-fold defaultstate="collapsed" desc="Variaveis.">
    private String nomeItem;
    private String descItem;
    private int valorItem;
    private int quantItem;
    static int total_stock;
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Constructores.">
    public item(String nome, String desc, int valor, int quant)
    {
        this.nomeItem = nome;
        this.descItem = desc;
        this.valorItem = valor;
        this.quantItem = quant;
        total_stock += quant;
    }
    
    public item(String nome, int valor, int quant)
    {
        this.nomeItem = nome;
        this.descItem = "This is a debug String";
        this.valorItem = valor;
        this.quantItem = quant;
        total_stock += quant;
    }
    
    public item(String nome, int valor)
    {
        this.nomeItem = nome;
        this.descItem = "This is a debug String";
        this.valorItem = valor;
        this.quantItem = 0;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Sets.">
    public void setNomeItem(String inputValue)
    {
        this.nomeItem = inputValue;
    }
    
    public void setDescItem(String inputValue)
    {
        this.descItem = inputValue;
    }
    
    public void setValorItem(int inputValue)
    {
        this.valorItem = inputValue;
    }
    
    public void setQuantItem(int inputValue)
    {
        this.quantItem = inputValue;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Gets.">
    public String getNomeItem()
    {
        return this.nomeItem;
    }
    
    public String getDescItem()
    {
        return this.descItem;
    }
    
    public int getValorItem()
    {
        return this.valorItem;
    }
    
    public int getQuantItem()
    {
        return this.quantItem;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Adicionar e Retirar items de stock.">
    public void adicionarItem(String item, int quant)
    {
        this.quantItem += quant;
    }
    
    public void eliminarItem(String item, int quant)
    {
        this.quantItem -= quant;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Mudar valor items.">
    public void mudarValor(String item, int valor)
    {
        this.valorItem = valor;
    }
    // </editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Listagens e Displays.">
    public void listarStock()
    {
        System.out.println("Nome do objecto: " + this.nomeItem + " | Descrição: " 
                + this.descItem + " | Preço: " + this.valorItem + "| Stock disponivel: " + this.quantItem);   
    }  
    // </editor-fold>           
}
