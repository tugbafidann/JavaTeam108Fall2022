package day18_arrayList;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_soru {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
        List<String > isimlerListesi=isimListesiOlustur();
        System.out.println(isimlerListesi);
    }
    public static @NotNull List<String> isimListesiOlustur(){
        List<String> isimListesi=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        String girilenIsim="";
        while (!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("Listeye eklemek icin bir isim giriniz." +
                    "\n Bitirmek istediginizde Q ya basiniz");
            girilenIsim=scan.nextLine();
            if(!girilenIsim.equalsIgnoreCase("q"))
                isimListesi.add(girilenIsim);
        }
        return isimListesi;
    }
}
