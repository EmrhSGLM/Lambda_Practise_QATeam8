package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        // {12, 9, 13, 4, 6, 2, 4, 12, 15} listesini olusturun
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15));

        // Task 01 -> Tüm tek sayıları yazdırın
        System.out.print("Listedeki tek sayilar ==> ");
        list.
                stream().
                filter(t-> t %2 == 1).
                forEach(t-> System.out.print(t + " "));
        // Task 02 -> 6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
        System.out.print("\n6 ile 14 arasında sayi kareler toplami ==> ");
        System.out.print(list.
                stream().
                filter(t -> t > 6 && t < 14).
                //mapToInt(t-> t * t).sum();
                map(t -> t * t).reduce(Integer::sum).orElse(0));

        // Task 03 ->  Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz

        System.out.print("\nTek tamsayilar kare toplami ==> ");
        System.out.println(list.
                stream().
                filter(t -> t % 2 != 0).
                mapToDouble(Math::sqrt).
                sum());
    }
}
