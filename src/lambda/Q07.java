package lambda;

import java.util.ArrayList;
import java.util.List;

public class Q07 {

    public static void main(String[] args) {

        //  String isimlerden olusan bir list olusturunuz
        List<String> list = new ArrayList<String>();
        list.add("Ahmet");
        list.add("Asi");
        list.add("Zekayi");
        list.add("Ali");
        list.add("Hasan");
        list.add("Erhan");
        list.add("Ertugrul");

        //      Task 01 -> List'deki isimlerden "a" ve "n" icerenlerin harf
        //   sayilarinin toplamini ekrana yazdiriniz
        System.out.print("Task 01 ==> ");
        System.out.print(list.
                stream().
                filter(t -> t.contains("a") && t.contains("n")).
               //mapToInt(t -> t.length()).sum());
                map(t->t.length()).reduce(Integer::sum));

        //      Task 02 -> List'deki isimlerden ilk harfi son harfinden alfabetik
        //   olarak onde olan isimleri ekrana yazdirin
        System.out.print("\nTask 02 ==> \n");
        list.
                stream().
                filter(t-> t.toLowerCase() .charAt(0)< t.charAt(t.length() - 1)).
                forEach(t-> System.out.println(t));

    }

}
