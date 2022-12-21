package day12_methodCreation;

public class C06_MethodKullanimi {
    public static void main(String[] args) {
        System.out.println(C03_AsalSayi.asalSayiMi(5));

        C04_Faktoryel.faktoryelYazdir(5);
        C04_Faktoryel.faktoryelYazdir(7);

        System.out.println(C05_HesapMakinesi.hesapMakinesi(4.5, 2.0, '*'));

    }
}
