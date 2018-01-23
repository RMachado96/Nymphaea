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
        
        BufferedReader fis = null;
        BufferedWriter fos = null;
        
        test.stringteste1 = "Ola";
        test.stringteste2 = "o meu nome e David e a minha idade e";
        test.valorteste1 = 22;
        
              
        
        try 
        {
            File ficheiro = new File("C:\\Users\\David\\Desktop\\projeto.csv");
                        
            //Escrita de dados no ficheiro            
            fos = new BufferedWriter(new FileWriter(ficheiro));
            //Se o ficheiro não exitir, é criado
	    if (!ficheiro.exists()) {ficheiro.createNewFile();}
            
            //Passagem de valores para o ficheiro
            fos.write(test.stringteste1);
            fos.write(";");
            fos.write(test.stringteste2);
            fos.write(";");
            fos.write(String.valueOf(test.valorteste1));
            fos.write("\n");
            fos.flush();
            
            //Leitura de dados do ficheiro 
            fis = new BufferedReader(new FileReader(ficheiro));
            int a=0;
            while(a != -1)
            {
                a=fis.read();
                if (a==59) 
                System.out.print("\n");
                else
                if(a!=-1)
                System.out.print((char)a);         
            }   
        } 
        catch (IOException e) 
        {e.printStackTrace();

    }
    }
    
}
