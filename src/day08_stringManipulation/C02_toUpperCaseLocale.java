package day08_stringManipulation;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class C02_toUpperCaseLocale {
    public static void main(String[] args) {
        String str="JAVA CANDIR";
        System.out.println(str.toUpperCase()); //java candir
        str=str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

        str="sevgi insani hayata baglar";
        System.out.println(str.toUpperCase());  // SEVGİ İNSANİ HAYATA BAGLAR
        str=str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
    }
}
