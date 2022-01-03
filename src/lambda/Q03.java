package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q03 {

    public static void main(String[] args) {
        // String isimlerden olusan bir list olusturun

        List<String> list = new ArrayList<String>();
        list.add("Ahmet");
        list.add("Asim");
        list.add("Asim");
        list.add("Zekayi");
        list.add("Ali");
        list.add("Ali");
        list.add("Ertugrul");

        // Task 01 -> Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
        System.out.println("    Task 01 ");
        list.
                stream().
                distinct().
                forEach(t-> System.out.println("Isim -> " + t + " Uzunluk -> " + t.length()));

        // Task 02 -> Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
        System.out.println("    Task 02 ");
        list.
                stream().
                distinct().
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.println("Isim -> " + t + " Uzunluk -> " + t.length()));


        // Task 03 -> Konsoldaki farklı öğeleri son karakterlerine göre sıralayıp konsola yazdırın
        System.out.println("    Task 03 ");
        list.
                stream().
                distinct().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.println("Isim -> " + t ));


        // Task 04 -> List deki ogeleri tekrarsiz sekilde , uzunluga gore buyukten kucuge  siralayip yazdırın.
        System.out.println("    Task 04 ");
        list.
                stream().
                distinct().
                sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                forEach(t-> System.out.println("Isim -> " + t +  " Uzunluk -> " + t.length()));


        // Task 05 -> Uzunluğu 7'den küçük olan farklı öğeleri alfabetik olarak ters sırada konsolda büyük harflerle yazdırın.
        System.out.println("    Task 05 ");
        list.
                stream().
                filter(t->t.length() < 7).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.println("Isim -> " + t));





    }

}
