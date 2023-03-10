package day09_stringManipulation;

import java.util.Scanner;

public class C04_endWith {
    public static void main(String[] args) {
        String str="Java ogrenenen issiz kalmaz";
        System.out.println(str.endsWith("kalmaz"));  // true
        System.out.println(str.endsWith("Java ogrenenen issiz kalmaz")); // true
        System.out.println(""); // true

        // SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir mail adresi giriniz : ");
        String girilenMail= scan.nextLine();

        if(!girilenMail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!girilenMail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!girilenMail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }

    }
}
