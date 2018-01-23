package projeto;

import java.io.*;

class teste
{   
    static String stringteste1;
    static String stringteste2;
    static int valorteste1;
    }

public class Projeto {

    public static void main(String[] args) {
        
        teste test = new teste();
        
        //FileOutputStream fos = null;
        BufferedReader fis = null;
        BufferedWriter fos = null;
        
        teste.stringteste1 = "Ola";
        teste.stringteste2 = "o meu nome e David e a minha idade e";
        teste.valorteste1 = 22;
        
        try 
        {
            File ficheiro = new File("C:\\Users\\David\\Desktop\\projeto.csv");
            //fos = new FileOutputStream(ficheiro);
            
            fos = new BufferedWriter(new FileWriter(ficheiro));
            // if file doesnt exists, then create it
	    if (!ficheiro.exists()) {ficheiro.createNewFile();}
            fos.write(teste.stringteste1);
            fos.write(",");
            fos.write(teste.stringteste2);
            fos.write(",");
            fos.write(String.valueOf(teste.valorteste1));
            fos.write(",\n");
             
            fos.write(teste.stringteste1);
            fos.write(",");
            fos.write(teste.stringteste2);
            fos.write(",");
            fos.write(String.valueOf(teste.valorteste1));
            fos.write(",\n");
            fos.flush();
            
            
            fis = new BufferedReader(new FileReader(ficheiro));
            
        } 
        catch (IOException e) 
        {e.printStackTrace();

    }
    
}
