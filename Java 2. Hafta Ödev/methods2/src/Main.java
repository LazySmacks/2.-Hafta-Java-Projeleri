public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yenimesaj = sehirVer();
        System.out.println(yenimesaj);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        int toplam1 = toplam2(9,12);
        System.out.println(toplam1);
        int toplam= topla2(2,3,5,68,7,8,10,5,6);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }
public static int toplam2(int sayi3, int sayi4){
        return sayi3+sayi4;
}
public static int topla2(int... sayilar){
        int toplam =0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
}
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}