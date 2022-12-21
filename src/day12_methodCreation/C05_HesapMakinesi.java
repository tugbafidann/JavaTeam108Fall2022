package day12_methodCreation;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {
        // kullanicidan 2 sayi ve istedigi islemi alin (+/*-)
        // bir method olusturup sayilara istenen islemi uygulayip
        // sonucu bize dondurun
        // kullanici yanliss girmisse sonucu 0 dondurun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz : ");
        double girilenSayi1=scan.nextDouble();
        double girilenSayi2=scan.nextDouble();
        System.out.println("Lutfen yapmak istediginiz islemi secin +, -, *, /");
        char istenenIslem=scan.next().charAt(0);
        System.out.println(hesapMakinesi(girilenSayi1,girilenSayi2,istenenIslem));

       // double sonuc=hesapMakinesi(6.5,4.2,'-');
       // System.out.println("islem sonucu : "+sonuc); islemi bu sekildede yapabiliriz
                   // ama soruda bu sekilde sormamıs ornek olarak verdik

    }
    public static double hesapMakinesi(double sayi1,double sayi2,char islem){
        switch (islem){
            case '+':
                return sayi1+sayi2;
            case '-':
                return sayi1-sayi2;
            case '*':
                return sayi1*sayi2;
            case '/' :
                return sayi1/sayi2;
            default:
                return 0;
        }

    }
}
