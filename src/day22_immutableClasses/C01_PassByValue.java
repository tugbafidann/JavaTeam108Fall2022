package day22_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {
        // verilen bir List'de degisiklik yapan 2 method olusturun
        // 1.method list'in elementlerine yeni deger atayip yazdirsin
        // 2.method, list'e yeni bir list degeri atayip, yeni list'e
        //   elementler ekleyip yazdirsin
        // her iki method'u cagirdiktan sonra main method'daki list'i yazdiralim
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(20);


        /*
            Java PassByValue kullanir
            PassByValue, method'a gonderilen variable'in kendisini degil degerini gondermek demektir.
            primitive data turleri veya String gonderdigimizde, method'da yapilan degisiklik method'da kalir.
            main method'da atama yapilmadikca main method'daki variable'in degeri DEGISMEZ
            PassByValue coklu element iceren array ve list gibi yapilar icin de GECERLIDIR
            Ancak coklu elementi value olarak method'a gonderemediginden
            array veya list'in adresini gonderir.
            Eger method'da elementlere atama yapilirsa, main method'daki elementler de degismis olur
            Eger list veya array'e yeni bir list veya array degeri atanirsa bu atama method'da kalir,
            main method'daki list veya array degismez.
            Araba ayni kaldigi muddetce icindekilerin degismesi passByValue'e aykiri degildir.
         */
    }
}
