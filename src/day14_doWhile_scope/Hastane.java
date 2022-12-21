package day14_doWhile_scope;

public class Hastane {
    static String hastahaneisim="Yildiz Hastahanesi";
    static String hastahaneAdresi="Cankaya/ANKARA";

    String personelIsmi;
    String personelAdresi;
    String personelTel;
    public static void main(String[] args) {
        Hastane p1=new Hastane(); //personel isim adres tel olustu degerleri null
        p1.personelIsmi="Kemal";

        Hastane p3=new Hastane();
        p3.personelTel="32456546";


    }
}
