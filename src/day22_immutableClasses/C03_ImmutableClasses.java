package day22_immutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java";
        str.replace("J","H");
        System.out.println(str); // Java---- atama yapilmadigi icin degistirmedi
        str=str.replace("J","H");
        System.out.println(str);   // Hava -- atama yapıldıgı icin degisti

    }
}
