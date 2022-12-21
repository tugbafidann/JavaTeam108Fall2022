package day05_ifStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        // Ogrenciden notunu rakam olarak alip harf olarak yazdirin
        // 0- 49,999 DD
        // 50-64,999 CC
        // 65-84,999 BB
        // 85-100 AA

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");
        double girilenNot= scan.nextDouble();
        if (girilenNot>=0 && girilenNot<50){
            System.out.println("Notunuz DD, malesef kaldiniz");
        }if(girilenNot>=50 && girilenNot<65){
            System.out.println("Notunuz CC, tebrikler gectiniz");
        }if(girilenNot>=65 && girilenNot<85){
            System.out.println("Notunuz BB");
        }if(girilenNot>=85 && girilenNot<100){
            System.out.println("Notunuz AA, tebrikler ");
        }
    }
}
