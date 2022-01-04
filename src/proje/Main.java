package proje;

import java.util.*;

public class Main {
    static List<Ogrenci> list=new ArrayList<Ogrenci>();
    static List<Ogrenci> list1=new ArrayList<Ogrenci>();

    public static void main(String[] args) {
        ekleme();
        System.out.println("Task 03 -> Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin\n");
        ogrNotlariAltUstSınırSırala(75,91);
        System.out.println("\nTask 04 -> Öğrencileri yaşlarına göre sıralayark yazdırin\n");
        ogrYasSıra();
        System.out.println("\nTask 05 -> Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin\n");
        ogrYasCinsiyetGoreSirala(49,"e");
        System.out.println("\nTask 06 -> Öğrencileri isimlerine göre yazdırın\n");
        ogrIsimSıralaYazdir();
        System.out.println("\nTask 07 -> Öğrencileri soyisimlerine göre yazdırin\n");
        ogrSoyAdSiralaYazdir();
        System.out.println("\nTask 08 -> Öğrencileri cinsiyetlerine göre yazdıran\n");
        ogrCinsiyetGoreYazdir("k");
        System.out.println("\nTask 09 -> listeyi yazdırırken içinde veri var mı diye kontrol edin\n");
        listeBosDoluKontrol();
        System.out.println("\nTask 10 -> reduce metoduyla ortalama hesaplayin\n");
        ogrDiplomaNotOrtHesaplama();
        ogrDiplomaNotOrtHesaplama1();
        System.out.println("\nTask 11 -> Girilen ogrenci ismini sil\n");
        girilenOgrAdiSil();

    }



    private static void girilenOgrAdiSil() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name which wanna delete ");
        String name=scan.next();

        // Bir Collection'daki veriler stream'e çevirmeksizin removeIf() metoduyla silinebilir.
        // removeIf bir lamba fonksiyonunu parametre olarak alabilir.
        // removeIf bir ArrayList metodudur ve listeyi kalıcı olarak günceler.

        boolean silindiMi = list.removeIf(t-> t.getAd().equalsIgnoreCase(name));
        System.out.println( silindiMi ? "Basarili" : "Basarisiz");

    }

    private static void ogrDiplomaNotOrtHesaplama1() {
        System.out.println("2. Yontem => "+list.
                stream().
                mapToDouble(t -> t.getDiplomaNotu()).
                average());
    }

    private static void ogrDiplomaNotOrtHesaplama() {
        Double toplam =list.
                stream().
                map(t->t.getDiplomaNotu()).
                reduce(Double::sum).orElse(0.0);

        System.out.println("1. Yontem => "+toplam / list.size());

    }
    private static void listeBosDoluKontrol() {
        // class level da olusturdugum static elemanlı ve elemansiz iki listeyi
        // ternary kullanarak bos olup olmadigini kontrol ettim
        System.out.println(list.isEmpty() ? "Liste Bos" : list.toString());
        System.out.println(list1.isEmpty() ? "Liste Bos" : list1.toString());
    }

    private static void ogrCinsiyetGoreYazdir(String cinsiyet) {
        list.
                stream().
                filter(t->t.getCinsiyet().equalsIgnoreCase(cinsiyet)).
                forEach(System.out::println);
    }

    private static void ogrSoyAdSiralaYazdir() {
        list.
                stream().
                sorted(Comparator.comparing(Ogrenci::getSoyAd)).
                forEach(System.out::println);
    }

    private static void ogrIsimSıralaYazdir() {
        list.
                stream().
                sorted(Comparator.comparing(Ogrenci::getAd)).
                forEach(System.out::println);
    }

    private static void ogrYasCinsiyetGoreSirala(int yas, String cinsiyet) {
        list.
                stream().
                filter(t-> t.getYas() == yas && t.getCinsiyet().equalsIgnoreCase(cinsiyet)).
                forEach(System.out::println);

    }

    private static void ogrYasSıra() {
        list.
                stream().
                sorted(Comparator.comparing(Ogrenci::getYas)).
                //forEach(System.out::println);
                forEach(t-> System.out.println(t.toString()));
    }

    private static void ogrNotlariAltUstSınırSırala(int alt , int ust) {
        list.
                stream().
                filter(t-> t.getDiplomaNotu() > alt && t.getDiplomaNotu() < ust).
                sorted(Comparator.comparing(t->t.getDiplomaNotu())).
                //sorted(Comparator.comparing(Ogrenci::getDiplomaNotu)).
                forEach(t-> System.out.println(t.toString()));
    }


    public static List<Ogrenci> ekleme() {

        list.add(new Ogrenci("Hacer", "Turmak", 30, 92, "k"));
        list.add(new Ogrenci("Zuhal", "Eren", 32, 90, "k"));
        list.add(new Ogrenci("Emrah", "Saglam", 34, 70, "e"));
        list.add(new Ogrenci("Hadi", "Arici", 45, 85, "e"));
        list.add(new Ogrenci("Hikmet", "Ertem", 49, 82, "e"));
        list.add(new Ogrenci("Emre", "Gul", 32, 90, "e"));

        return list;
    }

}
