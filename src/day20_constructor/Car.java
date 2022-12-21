package day20_constructor;

public class Car {
    /*
    Bir classdan olusturulabilecek objelerin ozelliklerini
    variable veya Methodlarla belirleyebiliriz


     */
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemis";
    int yil=1900; // yil önemli degil 0 yazmasın diye deger verdik
    int km;
    String renk="Renk secilmedi";

    public static void hareket(){  // methodlar olabilir
        System.out.println("Tum arabalar hareket eder");
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", km=" + km +
                ", renk='" + renk + '\'' +
                '}';
    }


}
