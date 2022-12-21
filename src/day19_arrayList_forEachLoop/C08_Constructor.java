package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C08_Constructor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<Integer> sayilar=new ArrayList<>();
        /*
         sayilar ArrayList class'ındaki olusturduğumuz bir objedir
         ve olusturuldugu class'daki özelliklere(method ve variable) sahiptir
         */
        /*
        Bir class dan bir obje olusturduğumuzda o classdaki tum inctance variable
        ların bir kopyasını olusturup objemizle iliskilendirilir
        ayrıca o classda bulunan tum methodlari objemizle iliskilendirilir
        Bu islemleri saglayan java yapısı CONSTRUCTOR dir
        bu isleme de initialice (ilk deger atamasi) denir

        new keyword ile obje ılusturulurskn esitligin saginda new
         ile birlikte classIsmi() yazilir
         iste bu classIsmi() o classsın constructor idir.
         Constructor bugune kadar gordugumuz yapilardan farklidir
         CONSTRUCTOR: bir obje olusturmak istedigimizde devreye girer ve
         ilgili sinifin tom özellikelrini obje ile iliskilendirir(initialize)
         */

    }
}
