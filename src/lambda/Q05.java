package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05 {

    static List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "D", "C", "B", "A", "A", "B", "B"));
    public static void main(String[] args) {

        //         {"A", "B", "D", "C", "B", "A", "A", "B", "B"} gibi bir array oluşturun;


        //     Tekrarlanan öğeleri konsolda yazdırın
        System.out.print("Listede tekrarlanan elemanlar ==> ");
        list.
                stream().
                filter(Q05::tekrarBul).
                distinct().
                forEach(t-> System.out.print(t + " "));
                //forEach(System.out::println);

    }

    public static boolean tekrarBul(String t) {
        boolean varMi=false;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (t.equals(list.get(i))) {
                count++;
            }
            if (count > 1) {
                varMi = true;
                break;
            }
        }
        return varMi;
    }
}
