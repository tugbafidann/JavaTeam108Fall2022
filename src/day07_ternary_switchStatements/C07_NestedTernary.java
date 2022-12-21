package day07_ternary_switchStatements;

public class C07_NestedTernary {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi alin.
             //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
            //Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayi=23;
        System.out.println(sayi>0
                            ?
                            sayi%2==0 ? "Cift sayi" : "Cift sayi degil"
                            :
                            -100>=sayi && sayi>=-999 ?"3 basamakli" : "3 basamakli degil"
                            );
        int yas=67;
       if(yas>65){
           System.out.println();
        }
    }
}
