package day10_stringManipulations;

import java.sql.SQLOutput;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java ogren, adana ye";
        System.out.println(str.replace('a','A')); // JAvA ogren, AdAnA ye
        System.out.println(str.replace(" ","")); // Javaogren,adanaye
        System.out.println(str.replace("Java","Yazilim")); //Yazilim ogren, adana ye

        String telefon="555 3458545";
        System.out.println(telefon.replace("555","532")); // 532 3458545
        System.out.println(telefon.replace('3','7'));   // 555 7458545

        // asagidaki arama sonucunun 10 binden fazla oldugunu test edin

        String sonuc= "1-16 of over 100,000 results for \"apple\"";

        int indexOver=sonuc.indexOf("over");
        int indexResults=sonuc.indexOf("results");
        String indexSayisiStr=sonuc.substring(indexOver+5,indexResults-1);
        String yeniIndexSayisi=indexSayisiStr.replace(",","");
        int indexSayisiInt=Integer.parseInt(yeniIndexSayisi);
        if(indexSayisiInt>10000){
            System.out.println("Arama sonuc testi PASSED");
        }else {
            System.out.println("Arama sonuc testi FAILED");
        }

    }
}
