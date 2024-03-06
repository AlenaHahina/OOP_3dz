package DZ_3_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stream stream1 = new Stream(
                new ArrayList<>(List.of(
                                new Group("A1"),
                                new Group("A2"),
                                new Group("A3"),
                                new Group("A4")
                        )
                )
        );
        Stream stream2 = new Stream(new ArrayList<>(List.of(
                                new Group("B1"),
                                new Group("B2"),
                                new Group("B3"),
                                new Group("B4")
                        )
                )
        );

        ArrayList<Stream> faculty = new ArrayList<>(List.of(stream2, stream1));
        faculty.sort(new StreamComparator());
        System.out.println(faculty);

    }
}