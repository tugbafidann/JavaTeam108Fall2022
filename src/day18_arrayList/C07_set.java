package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {
         /*
         java'da bir cok yapida get ve set method'lari bulunur
         get method'lari bilgiyi bize getirirken
         method'lari bilgiyi update eder

          */
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler); //[A, Z, T]

        // 2. index e Felemanini ekleyin
        /*
               add methodu varolan listedeki herhangi bir elementi degistirmeden
               istedigimiz elementi ekler, kalanlari kaydirir
         */
        harfler.add(2,"F");
        System.out.println(harfler);  // [A, Z, F, T]

        harfler.set(2,"M");
        System.out.println(harfler); // [A, Z, M, T]
        /*
            set methodu var olan elementin degerini gunceller
            eleman sayisini arttirmaz
         */

    }
}
