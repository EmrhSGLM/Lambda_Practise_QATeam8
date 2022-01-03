package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q04 {

    public static void main(String[] args) {
        //         "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" öğelerini içeren
        //            bir Dize listesi oluşturun

        String[] isimler = {"Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson"};

        //  ISTEKLER :
        //          "J" ile baslayan olan öğeleri almayın
        //          Farklı öğeleri seçin
        //          Karakter sayısına göre doğal sıraya koyun
        //          Tüm öğeleri büyük harfe dönüştürün
        //          Konsoldaki öğeleri yazdırın
        //          Fonksiyonel Programlama'yı kullanın

        Arrays.stream(isimler).
                filter(t-> !t.startsWith("J")).
                distinct().
                sorted(Comparator.comparing(t-> t.length())).
                //map(t-> t.toUpperCase()).
                forEach(t-> System.out.println(t.toUpperCase() + " "));
    }


}
