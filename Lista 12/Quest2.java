import java.io.*;
import java.util.*;
public class Quest2{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = ler.nextLine();
    System.out.printf("\nConte?do do arquivo texto:\n");
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine(); 
      while (linha != null) {
        System.out.printf("%s\n", linha);
 
        linha = lerArq.readLine(); 
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
    }
    System.out.println();
  }
}