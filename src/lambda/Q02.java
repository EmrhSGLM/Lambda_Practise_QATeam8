package lambda;

import java.util.ArrayList;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {


        //  Bir class oluşturun, 'Q02' olarak adlandırın  5 elemanlı bir tamsayı listesi oluşturun
         List<Integer> list = new ArrayList<Integer>();
         list.add(0);
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);

        //      Task  ->  Elemanlari doğal sıraya koyun Konsoldaki son 3 elemanın karelerinin toplamını bulun.
        //  Konsoldaki toplamı yazdırın 'Fonksiyonel Programlama' kullanın


        System.out.println(list.
                stream().
                sorted().
                skip(2).
                map(t -> t * t).
                reduce(Integer::sum));


    }


}
