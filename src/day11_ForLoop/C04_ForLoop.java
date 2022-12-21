package day11_ForLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
        eger sart i'nin hicbir degeri icin true olmuyorsa
        loop calisir ama loop body'si devreye hic girmediginden
        islem yapilmaz
         */

        // input olarak verilen sayidan bire kadar tum sayilari yazdirin

        int input = -23;  // eger kullanicinin pozitif ve negatif girebilecegini ongorup
                         // ona gore kod yazmazsak, loop body'sinin hic calismamasi durumu olabilir

        if(input>1){
            for (int i = input; i >0 ; i--) {
                System.out.println(i+" ");
            }
        }else {
            for (int i = input; i <2 ; i++) {
                System.out.print(i+" ");
            }
        }




      /* 
        eger sart i'nin tum degerleri icin dogru oluyorsa
        teknik olarak sonsuz loop olusur deriz.
        bilgisayarimiz sonsuza kadar calismaz, ram dolar veya int'in sinirina ulasilir
        ama teknik olarak sonsuz loop denir
        for (int i = input; i <=100 ; i--) ==> i++ olacakken yanlislikla -- yaparsak sonsuz loopa donusur
       */
        System.out.println("");
        

        // input olarak verilen sayidan 100'e kadar tum tamsayilari yazdirin
        input=10;
        for (int i = input; i <=100 ; i++) {
            System.out.println(i+" ");
        }
                



    }
}
