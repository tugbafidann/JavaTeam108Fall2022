package day20_constructor;

import day19_arrayList_forEachLoop.Toyota;

public class C01_Constructor {
    public static void main(String[] args) {
        Car car1=new Car();
        Toyota toyota=new Toyota();
        System.out.println(car1);
        //Car{marka='Marka belirtilmemis', model='Model belirtilmemis', yil=1900, km=0, renk='Renk secilmedi'}

        System.out.println(toyota); // day19_arrayList_forEachLoop.Toyota@70177ecd
        // toyota bir obje oldugundan ozelliklerini direk YAZDIRAMAYIZ, referansi yazdirir

        // bir class'dan olusturulan objelerin belirli ozellliklerini kolayca yazdirabilmek icin
        // o class'da istenen ozellikleri kapsayan bir toString() olusturulabilir


        /*
            toString method'undaki yazilanlari istedigimiz sekil ve formata uyarlayabiliriz
            Car{marka='Marka Belirtilmemis'
            , model='Model belirtilmemis'
            , yil=1900
            , km=0
            , renk='Renk secilmedi'}
         */

    }
}
