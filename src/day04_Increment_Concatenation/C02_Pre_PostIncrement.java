package day04_Increment_Concatenation;

public class C02_Pre_PostIncrement {
    public static void main(String[] args) {


        int a=10;
        int b=a++;  // b=10  a=11
        int c=++a;  // c= 12  a=12
        System.out.println(a+ ", "+b+", "+c);  // 12, 10 ,12

        int x=20;
        int y=++x; // y= 21  x=21
        int z=y++; // z=21   y=22
        System.out.println(x+ ", "+y+", "+z); //21,22,21

        int k=30;
        System.out.println(k++);    // yazan = 30          k= 31
        System.out.println(++k);    // yazan = 32           k= 32
        System.out.println(k++);   // yazan =  32           k= 33
        System.out.println(k);    // yazan =  33            k= 33

        int sayi1=40;
        int sayi2=sayi1++;  // sayi2=40    sayi1=41
        int sayi3=--sayi2;  // sayi3= 39  sayi2=39
        int sayi4=--sayi1;  // sayi4= 40  sayi1=40
        System.out.println(sayi1+", "+sayi2+","+sayi3+", "+sayi4);  // 40, 39,39, 40

    }
}
