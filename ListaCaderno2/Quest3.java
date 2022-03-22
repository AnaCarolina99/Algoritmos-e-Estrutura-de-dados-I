import java.util.Random;
public class Quest3{
   public static void main(String[] args){
      int VET[] = new int[5];
      Vet(VET);  
   }
   
  public static void Vet(int VET[])
  {
   Random r = new Random();
   int aux;
      for(int i = 0 ; i< VET.length ; i++)
      {
            VET[i] = r.nextInt(10);
      }
      
       for(int i = 0 ; i< VET.length ; i++)
      {
            for(int j = 0 ; j< VET.length ; j++)
            {
                  
               if(VET[i] < VET[j])
               {
               aux = VET[i];
               VET[i] = VET[j];
               VET[j] = aux;
               }
            }
      }
      
      for(int i = 0 ; i< VET.length ; i++)
      {
            System.out.print(VET[i] + "  ");
      }     
             
  }
}