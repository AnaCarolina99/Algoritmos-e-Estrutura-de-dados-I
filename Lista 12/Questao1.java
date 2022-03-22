import java.io.*;
public class Questao1 {
   public static void main(String[] args) { 
   PrintWriter arquivo = null; 
   try {
      FileWriter arq = new FileWriter("numeros.txt");
      arquivo = new PrintWriter(arq);
      for (int i = 0; i < 100; i++) {
         arquivo.println(Math.round(Math.random() * 100));
      }
  }catch(Exception e) {
      System.out.println(e);
  } finally {
      arquivo.close();
    }
 }
}