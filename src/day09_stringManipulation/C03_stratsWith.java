package day09_stringManipulation;

public class C03_stratsWith {
    public static void main(String[] args) {
        String str="Java mutluluktur";
        System.out.println(str.startsWith("Java"));  // true
        System.out.println(str.startsWith("j"));   // false
        System.out.println(str.startsWith("Java mutluluktur"));  // true
        System.out.println(str.startsWith(""));  // true

        System.out.println(str.contains("mutlu")); // mutlu iceriyor mu        ==>true
        System.out.println(str.startsWith("mutlu")); // mutlu ile basliyor mu ==>false

        System.out.println(str.startsWith("mutlu",5));
        System.out.println(str.startsWith("va",2));





    }
}
