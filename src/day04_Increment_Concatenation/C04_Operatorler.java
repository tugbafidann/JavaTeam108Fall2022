package day04_Increment_Concatenation;

public class C04_Operatorler {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        boolean c;
        System.out.println(c=a*15==b*10); // true
        System.out.println(c);    // true

        System.out.println("!true= "+ !true); // false
        System.out.println("!(10<15)= "+ !(a<b));  // false

        c=a<=b;

        /*
        int a=10;
       *  Hem 3 e hem 5 e bolunebilen
               a%3==0  && a%5==0

       *  3 veya 5 e bolunebilen
              a&3==0  || a%5==0

       *  0 dan buyuk ve 100 den kucuk
           0<a<100  matematikte 3 lu karsilastirma mumkundur
                    ancak java 3 lu karsilastirma yapmaz 2 li karsilastirmalar yapip
                    mantiksal operatörler ile baglanmalı
              0<a && a<100  Javada boyle yazilir

       *  0 dan kucuk veya 100 den buyuk sayilor
             a<0  || a>100

       *  bir ucgenin 3 kenari a,b,c uzunluklaridir
        bu ucgenin eskenar oldugunu kontrol etmek istersek
            a==b && b==c
         */

    }
}
