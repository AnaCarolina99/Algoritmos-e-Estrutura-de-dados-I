import java.util.Scanner;
public class Quest8{
   public static void main(String[] args){
   Scanner leia = new Scanner(System.in);
   System.out.println("Digite o primeiro nome");
   String nome1 = leia.next();
   System.out.println("Digite a primeira nota");
   byte nota1 = leia.nextByte();
   System.out.println("Digite 0 segundo nome");
   String nome2 = leia.next();
   System.out.println("Digite a segunda nota");
   byte nota2 = leia.nextByte();
   if(nota1>nota2)
   {
   System.out.println("O aluno(a) " +nome1+ " tem a maior nota");
   }
   else
   {
   System.out.println("O aluno(a) " +nome2+ " tem a maior nota");
   }
   
   }
}