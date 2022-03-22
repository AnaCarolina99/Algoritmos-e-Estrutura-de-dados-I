import java.io.*;
import java.util.*;
public class Quest3{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = ler.nextLine();
    System.out.printf("\nConteúdo do arquivo texto:\n");
    int pos = 0;
    int neg = 0;
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine(); 
      while (linha != null) {
        System.out.printf("%s\n", linha);
 
        linha = lerArq.readLine(); 
         if(linha%2== 0){
         pos++;
         }
         else
         neg++;
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
    }
    System.out.println();
    System.out.println("Numero de negativos " + neg);
    System.out.println("Numero de positivos " + pos);
  }
}