package day15_scope_arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3};   // Burada kac element yazildi ise onu lenght olarak kabul eder
        int[] arr2={4,5,6,7,8,9};
        // int arr2[]; şeklinde yazarsak kabul eder ama çok da kullanılmaz

        /*
        array olustururken;
             1-  elementlerin data turlerini yazmalı.
                         array farklı data türlerini barındırmaz
             2- array uzunlugu ilk basta söylememiz gerekir. uzunluk sabittir degistirilemez
         */
        String [] harfler=new String[400];
        System.out.println(arr.length); // 3
        System.out.println(arr2.length); // 6
        System.out.println(harfler.length);  // 4000

        /*
        Stringde kullandigimiz harfler .lenght() bir method iken
        arraydeki lenght method degil variabledir arr.lenght
         */
    }
}
