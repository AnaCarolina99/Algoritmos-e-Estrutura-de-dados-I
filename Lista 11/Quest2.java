import java.util.Scanner;
public class Quest2{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      System.out.println("Digite a hora");
      byte hour = leia.nextByte();
      System.out.println("Digite os minutos");
      byte minutes = leia.nextByte();
      System.out.println("Digite os segundos");
      byte seconds = leia.nextByte();
      boolean formato = true;
      System.out.println("Digite 1 para formato de horario brasileiro\nDigite 2 para formato americano");
      byte op = leia.nextByte();
         if(op == 1)
         formato = true;
         else if(op == 2)
         formato = false;
         else 
         System.out.println("Opcao inexistente");
         
      Hora h = new Hora(hour,minutes,seconds); 
      System.out.println("Digite 1 para incrementar 1 segundo\nDigite 2 para decrementar 1 segundo");
      byte crono = leia.nextByte(); 
         if(crono == 1)
         h.Tick();
         else if(crono == 2)
         h.Tack();
         else
         System.out.println("Opcao inexistente"); 
      System.out.println(h.Format(formato));
      
      
      
      

   }
}