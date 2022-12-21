package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Verilen bir String'in palindrome olup olmadigini yazdirin
        // Palindrome : duz okunusu ile tersten okunusu birbirine ayni olan
         String str="madam";

         String tersStr=C07_TerseCevirme.TersCevirme(str);

        System.out.println(str);
         if(str.equals(tersStr)){
             System.out.println("Verilen metin palindrome");

         }else{
             System.out.println("Verilen metin palindrome degil");
         }




    }
}
