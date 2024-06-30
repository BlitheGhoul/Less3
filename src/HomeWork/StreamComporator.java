package HomeWork;

import java.util.Comparator;

public class StreamComporator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.stream.size() - o2.stream.size();
    }
}
