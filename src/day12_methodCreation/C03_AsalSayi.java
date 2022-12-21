package day12_methodCreation;

public class C03_AsalSayi {
    public static void main(String[] args) {
        // verilen bir sayinin asal olup olmadigini true/ false olarak donduren
        // bir method olusturun
        System.out.println(asalSayiMi(8));
        boolean asalMiSonuc=asalSayiMi(59);
        System.out.println("59 sayisi icin sonuc : "+asalMiSonuc);
    }
    public static boolean asalSayiMi(int sayi){
        boolean asalKontrol=true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                asalKontrol=false;
                break;
            }

        }
        return asalKontrol;
    }



}

