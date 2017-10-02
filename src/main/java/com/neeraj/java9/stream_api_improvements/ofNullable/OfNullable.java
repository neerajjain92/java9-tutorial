package com.neeraj.java9.stream_api_improvements.ofNullable;

import java.util.stream.Stream;
import static com.neeraj.java9.stream_api_improvements.ofNullable.Book.*;

public class OfNullable {

    public static void main(String[] args) {

        long zero = Stream.ofNullable(null).count();
        long one = Stream.ofNullable(getBook()).count();
        System.out.printf("zero %d, one %d",zero, one);
        System.out.println();


        // Before ofNullable i.e Before Java9
        Book book = getPossiblyNull(false);
        Stream<String> authors = book == null ? Stream.empty() : book.authors.stream();
        authors.forEach(System.out::println);

        //With ofNullable Since java9
        Stream.ofNullable(getPossiblyNull(false))
                .flatMap(b -> b.authors.stream())
                .forEach(System.out::println);
    }

    private static Book getPossiblyNull(boolean isNull){
        return isNull ? null : getBook();
    }
}
