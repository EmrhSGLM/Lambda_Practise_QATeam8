package lambda;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {

        //       "Q01" olarak adlandırılan bir class oluşturun  5 String öğesi içeren bir String list oluşturun.
        //   3 tanesi "A" harfi ile başlayacak

        List<String> list = new ArrayList<String>();
        list.add("Ahmet");
        list.add("Asim");
        list.add("Zekayi");
        list.add("Ali");
        list.add("Ertugrul");

        //      Task ->   "A" harfi  ile baslayan ve karakter sayisi 5'ten kucuk olan
        //      elemanlari konsola buyuk harf olacak sekilde yazdirin


        list.
                stream().
                filter(t-> t.startsWith("A") && t.length() < 5).
                //map(t-> t.toUpperCase()).forEach(System.out::println);
                forEach(t-> System.out.print(t.toUpperCase() + " "));





    }

}
