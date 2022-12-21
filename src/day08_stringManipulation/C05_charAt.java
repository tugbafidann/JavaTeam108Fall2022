package day08_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {
        String str="Java guzeldir"; // 13 tane karakter barindirir
        /*
            - Javada index 0 dan baslar
            - J==> 0. index r==>12
            -- charAt(index) ile istedigimiz indexdeki char"a ulasabiliriz
         */

        // ilk a ' yı yazdiralim
        System.out.println(str.charAt(1));

        // sondan 2. harfi yazdiralim
        System.out.println(str.charAt(13-2));

        // sondan 4. karakteri buyuk harf olraak yzadirin
        System.out.println(str.toUpperCase().charAt(13-4));
        /*
        charAt metodu bize char döndürdügü icin toUpperCase() calismaz
        String methodlarini charAt() ile kullanmak istersek
        charAt() den once kullanmalisiniz
         */

        // System.out.println(str.charAt(13));  StringIndexOutOfBoundsException
        //Eğer index olarak karakter sayisi veya daha buyuk bir deger girersek
        //calistirdigimizda o index i bulamayacağı icin hata verir
        
    }
}
