package day10_stringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {
        // input olarak verilen sayidan baslayip
        // 7 ser 7 eser arttirarak input olarak vireln bitis sayisina kadar
        // -tum sayilari
        // -kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin
        int inputBas=34;
        int inputBit=563;
        int toplam=0;
        int sayac=0;
        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.print(i+" ");
            sayac ++;
            toplam+=i;

        }
        System.out.println("");
        System.out.println(sayac + "kadar sayi vardir");
        System.out.println("Bu sayilarin toplami = "+toplam);

    }
}
