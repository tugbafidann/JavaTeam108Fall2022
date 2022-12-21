package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        /*
            Eger çoklu element içeren bir yapıdaki tum elementlere
        ayni islemi yapmak istiyorsak
        indexten bagımsız olarak for each loop kullanilabilir
              for each loop da 3 şeyi belirtmemiz gerekir :
          1- Getirilecek elementlerin data turu
          2- Getirilen elemente verilen isim(genelde each/ w kulanilir)
          3- nereden getirilecegi (arr)
         */

        int[] arr={2,4,6,8,1};
        // bu arrayin tum elementlerini yazdiralim
        for (int each:arr
             ) {
            System.out.print(each+" ");
        }

        System.out.println("");
        // tum elementleri toplayalim
        int toplam=0;
        for (int each:arr
             ) {
            toplam +=each;
        }
        System.out.println("Sayilarin toplami : "+toplam);

        // tum sayilarin karelerini toplayalim
        toplam=0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("Sayilarin kareleri toplami : "+toplam);
    }
}
