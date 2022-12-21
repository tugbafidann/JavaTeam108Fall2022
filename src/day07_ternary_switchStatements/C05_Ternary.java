package day07_ternary_switchStatements;

public class C05_Ternary {
    public static void main(String[] args) {
        /*
        Ternary isleminin sonucunu yazdiracaksak
        boolean sartin true veya fales olmasi durumunda yazdiracagimiz datalar fakli data
        turunde olabilir
           Ancak atama yapacaksak
           True veya False olmasi durumunda alacagi degerler atayacagı variale degerine uygun olmalidir
         */

        int sayi= 12;
        System.out.println(sayi>10 ? "Buyuk sayi" : sayi+2);

        // int b=sayi>10 ?"Buyuk sayi" : sayi+2;
       // String c=sayi>10 ?"Buyuk sayi ": sayi+2;
        //!!! int String uymadigi icin hata verir ve bu islemi yapmamiz mümkün olmaz
    }
}
