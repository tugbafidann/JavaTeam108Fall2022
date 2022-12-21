package day08_stringManipulation;

import java.util.Random;

public class C06_lenght {
    public static void main(String[] args) {
        String str="Java her gecen gun daha da guzellesiyor";
        // sondan 3. karakteri yazdirin
        System.out.println(str.charAt(str.length()-3));  // y

        System.out.println(str.length());  // 50
        // rastgele bir karakteri yazdiramlim

        Random rnd=new Random(); // rnd degeri icin 0-1 arasinda rastgele sayilar olusur
        int index=rnd.nextInt(str.length()); // str. length den kucuk rastgele bir int verir
        System.out.println(str.charAt(index));
    }
}
