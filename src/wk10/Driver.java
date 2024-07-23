package wk10;

import javafx.scene.paint.Color;

import java.util.Map;
import java.util.TreeMap;

public class Driver {
    public static void main(String[] args) {
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
