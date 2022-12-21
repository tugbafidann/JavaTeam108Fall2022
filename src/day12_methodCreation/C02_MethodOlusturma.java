package day12_methodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        // Verilen iki sayiyi carpip sonucu yazdiran bir method olusturun

        carpYazdir(45,2); // 45,2= argument denir paremetrelere uygun degerler olmalidir
        carpYazdir(7.9,5.2);

        // carpYazdir("Ali,"Can") argument ve paremetre uyumlu degilse CTE verir

    }
   public static void carpYazdir(double sayi1, double sayi2){
       System.out.println("İki sayinin carpimi : "+(sayi1*sayi2));
   }
}
