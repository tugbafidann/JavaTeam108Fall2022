package day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf girin : ");
        char karakter=scan.next().charAt(0);
        if(karakter>='A' && karakter<='Z'){
            System.out.println("Buyuk Harf");
        }else {
            System.out.println("Kucuk harf");
        }



    }
}
