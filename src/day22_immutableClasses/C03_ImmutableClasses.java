package day22_immutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java";
        str.replace("J","H");
        System.out.println(str); // Java---- atama yapilmadigi icin degistirmedi
        str=str.replace("J","H");
        System.out.println(str);   // Hava -- atama yapıldıgı icin degisti

        str=str.toLowerCase();
        System.out.println(str); // hava

        // Asagidaki kod calisirsa Java kac obje olusturur
        String a="ABC";               // 1 Obje olustu
        for (int i = 0; i < 10; i++) {
            a=a+i;                      // 10 tane Obje olustu
        }
        System.out.println(a); //ABC0123456789

        // Toplam 11 obje olusturuldu ama biz sadece son olani kullandik digerleri cop oldu

    }
}
