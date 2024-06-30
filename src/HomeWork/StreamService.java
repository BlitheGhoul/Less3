package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StreamService extends StreamComporator{
    ArrayList<Stream> streams = new ArrayList<>();

    public StreamService(ArrayList<Stream> streams){
        this.streams = streams;
    }

    public ArrayList<Stream> SortDescending (){
        Collections.sort(streams, new StreamComporator());
        return streams;
    }
    public ArrayList<Stream> SortAscending (){
        Collections.sort(streams, new StreamComporator().reversed());
        return streams;
    }

    }

