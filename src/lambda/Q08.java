package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Q08 {
    public static void main(String[] args) {

        // 7 ile bolunebilen ilk 10 tamsayinin toplamini ekrana yazdiriniz.

       int sonuc = IntStream.
                                iterate(1, t -> t + 1).
                                filter(t -> t % 7 == 0).
                                limit(10).
                                reduce(Integer::sum).orElse(0);
        System.out.println(sonuc);


    }

}
