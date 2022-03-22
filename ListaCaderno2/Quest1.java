import java.util.Scanner;
public class Quest2{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite  numero positivo para ordem crescente e negativo para ordem decrescente");
      byte op = leia.nextByte();
      int VET[] = new int[5];
      Vet(op,VET);
        
   }
  public static void Vet(byte op, int VET[])
  {
  Random r = new Random();
   for(int i = 0; i< VET.length; i++)
   {
      VET[i] = r.nextInt(10);  
   }
      if(op >= 0)
      {
            for(int i = 0; i < VET.length; i++)
   {
          System.out.print(VET[i] + " ");   
   }

      }
      else
         for(int i = VET.length - 1; i >=0; i--)
   {
          System.out.print(VET[i] + " ");   
   }
   
  }
}