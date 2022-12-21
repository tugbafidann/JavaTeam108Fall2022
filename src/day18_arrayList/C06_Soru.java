package day18_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {
    public static void main(String[] args) {
        // Verilen bir array'deki tekrar eden elementleri silip
        // array'i unique degerlerden olusan bir array haline getirin

        int[] arr = {4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};
        List<Integer> benzersizElement=new ArrayList<>(); // uzunluk bilmedigim icin kullaniyoruz
        // arraydeki tum elementleri alip listede var mi diye kontrol edelim olmayani ekleyelim
        for (int i = 0; i < arr.length; i++) {
            if(!benzersizElement.contains(arr[i])){
                benzersizElement.add(arr[i]);
            }
        }
        System.out.println(benzersizElement);
        // soruda bu degerleri arrey atamamiz isteniyor
        arr=new int[benzersizElement.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= benzersizElement.get(i);
        }
        System.out.println("Arrayin son hali : "+Arrays.toString(arr));


    }
}
