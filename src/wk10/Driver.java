package wk10;

import javafx.scene.paint.Color;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Driver {
    public static void main(String[] ignored) {
        Set<String> words = new HashTable<>();
        "Upset".hashCode();
        words.add("Upset");
        words.add("You're");
        words.add("gazebo");
        words.add("sharing");
        words.add("your");
        words.add("screen");
        System.out.println(words.remove("screen"));
        System.out.println(words.remove("Screen"));

        System.out.println(words.contains("sharing"));
        System.out.println(words.contains("Sharing"));
        System.out.println(words.size());
    }

    public static void main2(String[] args) {
        Map<String, Color> colors = new TreeMap<>();
        colors.put("Red", Color.RED);
        colors.put("Blue", Color.web("#0000FF"));
//        System.out.println(colors.get("Red"));
//        System.out.println(colors.get("Green"));
        for(Map.Entry<String, Color> entry : colors.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
