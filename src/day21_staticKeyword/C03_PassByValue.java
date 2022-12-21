package day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {
        int s=20;
        System.out.println(s); // 20
            // int sayi=30;
        // Bir scope da tanimlanan variable 'in yeniden tanimlama imkani yoktur

            // String sayi="Hasan";
        /*
          Data turunu degistirerek yeniden tanimalak da mumkun degildir
          cunku kullanilirken variable'in ismini yazdigimizda hangi sayi variable'ini
          kullanacağı mechul olur
         */
        method1();
    }
    public static void method1(){
        method2(5);
        String s="Hasan";
        System.out.println(s.toLowerCase()); // hasan
    }
    public static void method2(int s){
        s=s*s;
        System.out.println(s);

    }
}
