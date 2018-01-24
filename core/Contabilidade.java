package core;

public class Contabilidade {
    // <editor-fold defaultstate="collapsed" desc="Variaveis.">
    private static int lucro = 0;
    private static int totalGasto = 0;
    private static int netWorth = 0;
    private static int stockVendido = 0;
    private static int stockComprado = 0;
    // </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="Métodos de venda e compra.">
    //Método quando executado venda ao cliente
    public void actionVenda(int valor, int quant) {
        int valorTotal = valor * quant;
        this.lucro += valorTotal;
        this.netWorth += valorTotal;
        this.stockVendido += quant;  
    }
    
    //Método quando executado compra ao fornecedor
    public void actionCompra(int valor, int quant) {
        int valorTotal = valor * quant;
        this.totalGasto += valorTotal;
        this.netWorth -= valorTotal;
        this.stockComprado += quant;   
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Gets.">
    public int getLucro() {
        return this.lucro;
    }
    
    public int getTotalGasto() {
        return this.totalGasto;
    }
    
    public int getNetWorth() {
        return this.netWorth;
    }
    
    public int getStockVendido() {
        return this.stockVendido;
    }
    
    public int getStockComprado() {
        return this.stockComprado;
    }
    // </editor-fold>
    
}
