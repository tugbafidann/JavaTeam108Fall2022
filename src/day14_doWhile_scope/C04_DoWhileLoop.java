package day14_doWhile_scope;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16, output: 4


        int input= 36;
        int karekok=1;
        boolean sonuc= false;

        while (karekok*karekok <= input){

            if (karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else{
                karekok++;
            }
        }
        System.out.println(sonuc);

        //**** Do While ile sonuc  *****//
        do {
            if(karekok*karekok==input){
                System.out.println("Girilen sayinin karekoku : " + karekok);
                sonuc=true;
                break;
            }else {
                karekok++;
            }
        }while(karekok*karekok<=input);
        System.out.println(sonuc);
    }
}
