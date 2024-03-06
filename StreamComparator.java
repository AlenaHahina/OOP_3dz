package DZ_3_OOP;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream, Stream t1) {
        return Integer.compare(stream.getGroups().size(), t1.getGroups().size());
    }
}