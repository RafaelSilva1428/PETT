//File end.
package Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
 
 
public class FileUtil {
       
       private static final String filePath = "pett\\intercept.log";
       
       public static String getConteudo(){
             StringBuilder conteudoExistente = new StringBuilder();             
             String linhaAtual;         
             BufferedReader br;
             try {
                    br = new BufferedReader(new FileReader(filePath));
                    while ((linhaAtual = br.readLine()) != null) {
                           conteudoExistente.append(linhaAtual);
                    }
                    
                    return conteudoExistente.toString();
             } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
             } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
             }
             return null;
 
             
       }
 
       public static void escreverTexto(String texto){
    	   
             try {
                    
                    File file = new File(filePath);
                    String conteudoAntigo="";
                    if (file.exists()){
                           conteudoAntigo = getConteudo();
                    }else{
                           file.createNewFile();
                    }                                       
                    
                    FileWriter filewt = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(filewt);
                    String textoFinal = texto;
                    bw.write(conteudoAntigo + "\n");
                    bw.write(textoFinal);
                    bw.close();
             } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
             }
             
       }
       
}
