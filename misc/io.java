package misc;

import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


class sysIO
{   
    // <editor-fold defaultstate="collapsed" desc="Variaveis.">
    String defaultPath;
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date currentDate = new Date();
    String lastSave;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Construtor.">
    public sysIO(String path)
    {
        this.defaultPath = path;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Gravar sessão.">
    public void saveState(String info)
    {
        BufferedWriter fos = null;
        try
        {
            //Abrir o ficheiro
            File ficheiroOutput = new File(this.defaultPath);
            
            fos = new BufferedWriter(new FileWriter(ficheiroOutput));
            
            if (!ficheiroOutput.exists())
            {
                ficheiroOutput.createNewFile();
            }
            
            fos.write(info);
            fos.flush();
            fos.close();
            
            this.lastSave = dateFormat.format(currentDate);
                        
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }   
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Dár load da sessão.">
    public List<String> loadState(String info, List<String> toLoad)
    {
        BufferedReader fis = null;
        try
        {
            //Abrir o ficheiro
            File ficheiroInput = new File(this.defaultPath);
            
            fis = new BufferedReader(new FileReader(ficheiroInput));
            
            int a = 0;
            int b = 0;
            //String line = "";
            while(a != -1)
            {
                a = fis.read();
                if(a!=-1)
                {
                    if (a==10)
                    {
                        b += 1;
                    }
                    else
                    {
                        toLoad.get(b).concat(String.valueOf((char)a));    
                    }
                }
            }
            fis.close();
            this.lastSave = dateFormat.format(currentDate);
            return toLoad;               
        }
        catch (IOException e) 
        {
            e.printStackTrace();
            return null;
        }   
    }
    // </editor-fold>
}
