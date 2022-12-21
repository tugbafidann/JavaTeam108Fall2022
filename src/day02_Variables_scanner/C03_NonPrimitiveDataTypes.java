package day02_Variables_scanner;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {
        /*
        NON-PRİMİTİVE : Buyuk harfle baslar
        PRİMİTİVE     : Kucuk harfle baslar
         */
        String str="Java candir";
        int sayi=10;
        /*
            PRİMİTİVE data türlerinin hazir methodlari yoktur
            NON-PRİMİTİVE data turlerinin onceden hazirlanmis, bizim
        kullanabilecegimiz methodlari olur
         */

        System.out.println(sayi); // 10;

        System.out.println(str.toLowerCase());// java candir
        // !!!! sadece bu satirda degisiklik yapar diger satirlarda Java candir seklinde algilar
        System.out.println(str.toUpperCase()); // JAVA CANDİR

        System.out.println(str);   //Java candir
        System.out.println(str.isEmpty());  // false
        //  !!! isEmpty::: Bu string bos mu
    }
}
