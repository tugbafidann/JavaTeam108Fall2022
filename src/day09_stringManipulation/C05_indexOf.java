package day09_stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {
        String str="Java ile kodlama cok kolay";

        // str "cok" iceriyor mu
        System.out.println(str.contains("cok"));  // true

        // kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirin
        System.out.println(str.endsWith("cok"));  // false

        System.out.println(str.indexOf('a'));  // 1
        System.out.println(str.indexOf("v"));  // 2

        System.out.println(str.indexOf("cok")); // hangi index ile baslıyorsa onu yazar  ==> 17

        System.out.println(str.indexOf("a",5));  // 13

        //2. o nun indexinin yazdirin
        /*
        once ilk o nun index ini buluruz
        sonra o index ten sonrasindaki o yu aratiriz
        */
        int ilkOindexi=str.indexOf("o");
        int ikinciOindexi=str.indexOf("o",ilkOindexi+1);
        System.out.println(ilkOindexi+" "+ikinciOindexi);








    }
}
