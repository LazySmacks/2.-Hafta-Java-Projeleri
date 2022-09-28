public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(5,9));
        //sayi 1 + sayi2 dediğimizde altta 5 ve 7 yi topladı sayi 3 de eklersek sonuç değişecektir.
        System.out.println(dortIslem.topla(5,7,9));
    }
}