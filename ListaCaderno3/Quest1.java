//incompleta
import java.util.Scanner;
public class Quest1{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      byte IDADES[] = new byte[3];
      String NOMES[] = new String[3];
      double ALTURAS[] = new double[3];
      double PESOS[] =  new double[3];
      int pessoas = 0;
      int soma = 0;
      double media = 0;
      byte aux;
      String temp;
      byte old = IDADES[0];
      String old1 = NOMES[0];
      String aux1; 
      // FOR usuario digitat dados 
         for(int i = 0 ; i<IDADES.length;i++){
         leia.nextLine();
         System.out.println("Pessoa " +(i+1));
         System.out.println("Digite o nome");
         NOMES[i] = leia.nextLine();
         System.out.println("Digite a idade");
         IDADES[i] = leia.nextByte();
         System.out.println("Digite a altura");
         ALTURAS[i] = leia.nextDouble();
         System.out.println("Digite o peso");
         PESOS[i] = leia.nextDouble();
               
         }
         //For calcular e imprimir o IMC> IMC medio
         for(int i = 0 ; i<IDADES.length;i++){
               double imc = PESOS[i]/Math.pow(ALTURAS[i],2);
               pessoas++;
               soma += imc;
               media = soma/pessoas;
               if(imc> media)
               {
               System.out.println("o IMC de " + NOMES[i] + " com a altura " + ALTURAS[i] + " e peso " + PESOS[i] +" esta acima da media ");
               }
         }
         //For para colocar a idade em ordem crescente
         for(int i = 0 ; i<IDADES.length;i++){
         for(int j = 0 ; j<IDADES.length;j++){
            if(IDADES[i] < IDADES[j]){
               aux = IDADES[i];
               IDADES[i] = IDADES[j];
               IDADES[j] = aux;
               aux1 = NOMES[i];
               NOMES[i] = NOMES[j];
               NOMES[j] = aux1;
            }
         }
       }
       // For Para pessoa mais velha
       System.out.println("A ordem crescente das idades");
       for(int i = 0 ; i<IDADES.length;i++){
         System.out.print(IDADES[i] + "  ");
       }  
       System.out.println();
       for(int i = 0 ; i<IDADES.length;i++){
            if(IDADES[i] > old){
            old = IDADES[i];
            old1 = NOMES[i];
            }
            
       }
       System.out.println(old1 + " eh a pessoa mais velha com a idade de " + old);
       
       
                //For para colocar os nomes em ordem alfabetica
         for(int i = 0 ; i<IDADES.length;i++){
         for(int j = 0 ; j<IDADES.length;j++){
            if(NOMES[j].compareTo(NOMES[i])>0){
               temp = NOMES[i];
               NOMES[i] = NOMES[j];
               NOMES[j] = temp;
            }
         }
       }
       
              // For Para pessoa mais velha
       System.out.println("A ordem crescente dos nomes");
       for(int i = 0 ; i<IDADES.length;i++){
         System.out.print(NOMES[i] + "  ");
       } 
   }
}