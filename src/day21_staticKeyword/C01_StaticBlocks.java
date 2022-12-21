package day21_staticKeyword;

public class C01_StaticBlocks {
   // bir tane constructor olusturalim
   C01_StaticBlocks(){
       System.out.println("Constructor calisti");
   }
   // bir tane de main method olusturalim
   public static void main(String[] args) {
       System.out.println("Main method calismaya basladi");
   }

   // bir tanede static blok olusturalim
    static {
       /*
         - Static blocklar class'daki tum yapilardan, hatta main method'dan bile önce calisir
         - Static blockda istedigimiz bir variable a baslangic degerinin atanmasi
      kullanicidan yetki sorgulamasi gibi islemler yapilabilir
         - Main method calismadan once yapilmasi gereken islem oldugunda kullanilir
         - Methodlarin ve static block'larin siralamasi java acisindan onemli degildir
       ancak birden fazla static block varsa, kendi aralarinda önce ustteki calisir
        */
       System.out.println("Yukaridaki static block calisti");
   }
   static {
       System.out.println("Altdaki static block calisti");
   }
    // Ekran ciktisi :
    //Yukaridaki static block calisti
    //Altdaki static block calisti
    //Main method calismaya basladi
}
