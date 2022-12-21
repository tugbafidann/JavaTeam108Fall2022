package day11_ForLoop;

 public class C15_FibonacciSerisi {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........

        fibonaccidenSayiYazdir(16);
    }

    public static void fibonaccidenSayiYazdir(int adet) {

        // Kullanicinin girdigi sayi 0 veya negatifse
        if (adet<=0){
            System.out.println("Gecersiz giris");
        } else if (adet==1) {

            System.out.println("0");
        } else if (adet==2) {
            System.out.println("0 1");
        }else{
            int sayi1=0;
            int sayi2=1;
            int toplam=0;
            System.out.print("0 1 ");

            //0 1 1 2 3 5 8 13 21 34

            toplam=1;

            for (int i = 3; i <=adet ; i++) {
                toplam = sayi1 + sayi2;  //0+1==1
                System.out.print(toplam + " ");
                sayi1 = sayi2; // sayi1=1
                sayi2 = toplam; // sayi2=1

                // toplam=sayi1+sayi2  ==> 1+1=2
                // sout(2 +" ")
                // 0 1 1 2 sonuna 2 ekledi
                // sayi1=1
                // sayi2=2



                // toplam=sayi1+sayi2  ==> 1+2=3
                //  sout(3 +"")
                // 0 1  1 2 3
                // sayi1= 2
                // sayi2= 3



                // toplam=sayi1+sayi2  ==> 2+3=5
                // sout(5 + " ")
                // 0 1 1 2 3 5
                // sayi1= 3
                // sayi2=5

            }
        }
    }
}