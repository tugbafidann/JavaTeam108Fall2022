package day24_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        System.out.println(sb.capacity()); // 20
        System.out.println(sb.length());  // 4

        sb.trimToSize(); // kapasite ve lenght'i esitledi
        /*
        atama yapmadigimiz halde bu degisiklik kalici olur mu?
        StringBuilder mutable oldugundan method'larla yapilan degisiklikler kalici olur
         */
        System.out.println(sb.capacity());  // 4

        System.out.println(sb.toString().toUpperCase());
        System.out.println(sb);
        /*
        StringBuilder'i String'e cevirirseniz veya String dondurecek method'lar kullanirsak
        String'in immutable ozelligi devreye girer ve yapilan degisiklikler kalici olmaz
         */
    }
}
