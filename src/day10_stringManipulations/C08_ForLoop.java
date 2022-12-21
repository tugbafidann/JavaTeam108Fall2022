package day10_stringManipulations;

public class C08_ForLoop {
    public static void main(String[] args) {
        // 1-1000 arasindaki sayilari yan yana yazdirin
        // yazdirma islemi bittiginde
        // "Tum bu sayilarin toplami =" seklinde sonucu yazdirin

        int toplam=0;
        for (int i = 1; i <=1000 ; i++) {
            System.out.print(i+" ");
           // toplam=toplam+i;
            toplam +=i;

        }
        System.out.println("");
        System.out.println("Tum bu sayilarin toplami = "+toplam);
    }
}
