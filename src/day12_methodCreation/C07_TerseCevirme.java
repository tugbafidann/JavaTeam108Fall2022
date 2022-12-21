package day12_methodCreation;

public class C07_TerseCevirme {
    public static void main(String[] args) {
        // verilen bir stringi terse cevirip
        // o halini bize donduren bir method olusturun
        System.out.println(TersCevirme("Java candir"));

    }
    public static String TersCevirme(String str){
        String strTersi="";
        for (int i = str.length()-1; i >=0; i--) {
            strTersi +=str.charAt(i);
        }
        return strTersi;
    }
}
