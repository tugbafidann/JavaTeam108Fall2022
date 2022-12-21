package day11_ForLoop;

public class C12_MethodOlusturma {
    public static void main(String[] args) {
        // 5 in faktöriyelini hesaplayin

        faktoryelyazdir(5);

        // kodun ilerleyen asamalarinda 7! de lazim oldu
        faktoryelyazdir(7);

        //// kodun ilerleyen asamalarinda 3! de lazim oldu
        faktoryelyazdir(3);


    }

    public static void faktoryelyazdir(int i) {
        int carpim=1;
        for (int j = 1; j <=i ; j++) {
            carpim*=j;
        }
        System.out.println(i+" ! : "+carpim);
    }

    /*
    Regex (Regular Expressions)
\\s : space \\S : space olmayan hersey
\\s+ : yanyana birden fazla space
\\d : digits \\D : digit olmayan hersey
\\w : harf veya rakam \\W : harf veya rakam olmayan hersey
     */
}
