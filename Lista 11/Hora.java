class Hora
{
   private byte hh,mm,ss;
   private boolean format;
   
   //Construtora sem parametro
      Hora(){
      hh = 12;
      mm = 00;
      ss = 00;
      }
   //Construtora com os parametros
         Hora(byte horas ,byte minutos ,byte segundos){
      hh = horas;
      mm = minutos;
      ss = segundos;
      }
   //Setters
      public void SetHora(byte hh){
      this.hh = hh;
   }
      public void SetMinuto(byte mm){
      this.mm = mm;
   }
      public void SetSegundo(byte ss){
      this.ss = ss;
   }   
   //Getters
      public byte GetHora(){
      return this.hh;
   }
      public byte GetMinuto(){
      return this.mm;
   }
      public byte GetSegundo(){
      return this.ss;
   }
   //Incrementar 1 segundo
   public void Tick(){
      if(ss>=0 && ss<59)
         ss++;
      else
      {
         if(mm>=0 && mm<59)
         {
         mm++;
         ss = 0;
         }
         else{
            if(hh>=0 && hh<23){
                 hh++;
                 mm = 0;
               ss = 0;
            }
            else {
                 hh = 0;
                 mm = 0;
               ss = 0; 
             }             
         }
      }
   }
   //Decrementar 1 segundo
      public void Tack(){
      if(ss>=0 && ss<59)
         ss--;
      else
      {
         if(mm>=0 && mm<59)
         {
         mm--;
         ss = 0;
         }
         else{
            if(hh>=0 && hh<23){
                 hh--;
                 mm = 0;
               ss = 0;
            }
            else {
                 hh = 0;
                 mm = 0;
               ss = 0; 
             }             
         }
      }
   }
   //Opçao formato americano e brasileiro
   public String Format(boolean format){
      if(format == true)
      return hh+":"+mm+":"+ss;
      else {
         if(hh >=1 && hh<= 12)
            return hh+":"+mm+":"+ss+ " AM";
            else
            {
               if(hh==0)
               return (hh + 12)+":"+mm+":"+ss+ " PM";
               else
               return (hh - 12)+":"+mm+":"+ss+ " PM";
            }
      }      
   }
   
}