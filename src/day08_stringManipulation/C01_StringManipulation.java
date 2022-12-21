package day08_stringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Gun Ismi Giriniz : ");
        String girilenGun= scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();

        /*
           string ifadeler case sensitive'dir
           kullanicinin Pazar, PAzar, PazaR, PAZAR ... gibi 32 farkli sekilde yazma ihtimali

           Kullanicinin girdigi degeri direk kalici olarak degistirmek tercih edilmez
           bunun yerine kullanicinin girdigi degeri degistirip yeni bir variable atama yapar ve
           kodlarimizda yeni variable kullaniriz

           Konsola yazdiracagimiz zaman istersek kullanicinin girdigi orjinal metni yazdiririz
           istersek de bizim cevirdigimiz hali yazabiliriz
         */
        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println(girilenGun+"  calisma zamani, tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girilenGun+"  calisma zamani, tatile 5 gun var");
                break;
            case "carsamba":
                System.out.println(girilenGun+"  calisma zamani, tatile 5 gun var");
                break;
            case "persembe":
                System.out.println(girilenGun+"  calisma zamani, tatile 5 gun var");
                break;
            case "cuma":
                System.out.println(girilenGun+"  calisma zamani, tatile 5 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis gun ismi girdiniz");

        }


    }
}
