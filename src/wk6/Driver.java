package wk6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        Collection<String> stuff = new wk6.LinkedList<>();
        stuff.add("here");
        stuff.add("is");
        stuff.add("some");
        stuff.add("stuff");
        for (String word : stuff) {
            System.out.println(word);
        }
        {
            Iterator<String> itr = stuff.iterator();
            while (true) {
                String word = itr.next();
                System.out.println(word);
            }
        }
    }
}
