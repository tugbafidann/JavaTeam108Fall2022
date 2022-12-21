package day13_methodOverloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {
        toplam(5.4,6.3);  // Int ve double sayinin toplami  :11.7
        toplam('a','b');   //Double ve int sayinin toplami  :195.0
        // ilk olarak %100 uyumlu parametreleri arar
        // %100 uyumlu yoksa calisabilecek method var mi diye kontrol eder
        // calisacak method birden fazla olursa, min. casting yaparak kullanabilecegini tercih eder

    }
    public static void toplam(double sayi1, int sayi2){
        System.out.println("Double ve int sayinin toplami  :"+(sayi1+sayi2));
    }
    public static void toplam(double sayi1, double sayi2){
        System.out.println("Int ve double sayinin toplami  :"+(sayi1+sayi2));
    }

}
