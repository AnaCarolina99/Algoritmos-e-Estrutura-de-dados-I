class Data{
   private byte dia, mes;
   private int ano;
   //Construtor sem parametro.
      Data(){
         dia = 8;
         mes = 2;
         ano = 1999;
      }  
   //Setters
   // Setter considerar os dias 28,29,30 e 31 
   private void SetDia(byte dia){
      if(this.mes == 2){
         if(dia>=1 && dia <= 29)
         this.dia = dia;
      }
            if(this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12){
         if(dia>=1 && dia <= 31)
         this.dia = dia;
      }
      
               if(this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11){
         if(dia>=1 && dia <= 30)
         this.dia = dia;
      }
      
   }
      private void SetMes( byte mes){
      if(this.mes>=1&&this.mes<=12)
         this.mes = mes;
   }
      private void SetAno(int ano){
         this.ano = ano;
   
   }
      // Getters
   public byte GetDia(){
      return this.dia;
   }
   public byte GetMes(){
      return this.mes;
   }
   public int GetAno(){
      return this.ano;
   } 
   public String Status(){
      
         return dia+ "/"+mes+"/"+ano; 
       
   }
      //Construtor com parametro. 
         Data(byte day, byte month, int year){
          dia = day;
         mes = month;
         ano = year;
         }
}