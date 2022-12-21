package day03_DataCasting_MatematikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        /*
        Eger genis kapasiteli data turundan dar kapasiteli data turune casting yapmak isterek :
        Java bunu otomatik olarak yapmaz sizden sorumluluk almanizi ister
        islemin gerceklesmesi icin cast yapmak istedigimiz degerin onune
        (degistirmek istedigimiz data turu) yazilmalidir

        Bu islem yapildiginda
                - Data kayiplari
                - Datanin beklenmedik bir sonuca donusmesi
        mumkundur
         */
        double dbl=23.5;
        int sayi=(int)dbl;
        System.out.println(sayi); // 23

        byte byt=(byte) sayi;
        System.out.println(byt);  // 23

        sayi=130;
        // byt=sayi;   int daha kapsamli old. icin otomatik atama yapmaz, bizden mudahale ister
        byt=(byte) sayi;
        System.out.println("int 130 un byte hali : " + byt);  //-126

        sayi=256;
        byt=(byte) sayi;
        System.out.println("int 130 un byte hali : " + byt);  // 0


    }
}
