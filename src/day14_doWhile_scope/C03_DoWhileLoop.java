package day14_doWhile_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        // verilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri yazdirin

        char baslangic='d';
        char bitis='m';
        do {
            System.out.println(baslangic);
            baslangic=(char)(baslangic+1);
        }while (baslangic<=bitis);

    }
}
