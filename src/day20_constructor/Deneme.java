package day20_constructor;
public class Deneme {

    private int sayi;

    boolean bl;



    public Deneme() {

        this.sayi = 11;

        bl= false;

    }



    public Deneme(int sayi) {

        this.sayi = sayi;

        this.bl = true;

    }

    public static void main(String[] args) {
        Deneme deneme = new Deneme(7);

        System.out.println(deneme.bl);



    }

}



