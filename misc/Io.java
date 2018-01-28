package GUI;

import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class IO {   
    // <editor-fold defaultstate="collapsed" desc="Variaveis.">
    private String defaultPath;
    private static String historySavePath = "";
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date currentDate = new Date();
    private String lastSave;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Construtor.">
    public IO(String path) {
        this.defaultPath = path;
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Gravar sessão.">
    public void saveState(String info, int totalLines, String ficheiroModificado) {
        // <editor-fold defaultstate="collapsed" desc="Gravar ficheiro CSV com objectos.">
        BufferedWriter fos = null;
        try {
            //Abrir o ficheiro
            File ficheiroOutput = new File(this.defaultPath);
            fos = new BufferedWriter(new FileWriter(ficheiroOutput));
            if (!ficheiroOutput.exists()) {
                ficheiroOutput.createNewFile();
            }
            fos.write(info);
            fos.flush();
            fos.close();
            this.lastSave = dateFormat.format(currentDate);
                        
        }
        catch (IOException e) {
            e.printStackTrace();
        }  
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Gravar ficheiro CSV de histórico de gravação.">
        BufferedWriter historicoFos = null;
        try {
            //Abrir o ficheiro
            File historicoOutput = new File(this.historySavePath);
            historicoFos = new BufferedWriter(new FileWriter(historicoOutput, true));
            if (!historicoOutput.exists()) {
                historicoOutput.createNewFile();
            }
            String novaEntrada = ficheiroModificado + ";" + totalLines + ";" 
                    + this.lastSave + "\n";
            historicoFos.write(novaEntrada);
            historicoFos.flush();
            historicoFos.close();               
        }
        catch (IOException e) {
            e.printStackTrace();
        }  
        // </editor-fold>
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Dár load da sessão.">
    public List<String> loadState() {
        
        List<String> toLoad = new java.util.ArrayList<String>();
        BufferedReader fis = null;
        try {
            int a = 0;
            int b = 0;
            File ficheiroInput = new File(this.defaultPath);
            fis = new BufferedReader(new FileReader(ficheiroInput));
            while (a != -1) {
                a = fis.read();
                if (a!=-1) {
                    if (a==10) {
                        b += 1;
                    }
                    else {
                        toLoad.get(b).concat(String.valueOf((char)a));    
                    }
                }
            }
            fis.close();
            this.lastSave = dateFormat.format(currentDate);
            return toLoad;               
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }   
    }
    // </editor-fold>
}
