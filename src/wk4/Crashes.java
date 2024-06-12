package wk4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Crashes {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Help");
        list.add("me");
        list.add("eat");
        String old = list.set(2, "sing");
    }
    public static void main2(String[] args) {
        Path path = Path.of("data/Motor_Vehicle_Collisions_-_Crashes.csv");
        try {
            List<String> lines = Files.readAllLines(path);
            long time = System.nanoTime();
            int mostPopularHour = getMostPopularHour(lines);
            System.out.println(System.nanoTime()-time);
            System.out.println(mostPopularHour);
            time = System.nanoTime();
            int mostPopularMinute = getMostPopularMinute(lines);
            System.out.println(mostPopularMinute);
            System.out.println(System.nanoTime()-time);
        } catch (IOException e) {
            System.err.println("Error reading file");
        }
    }

    private static int getMostPopularHour(List<String> lines) {
        int[] hours = new int[24];
        for (int i = 1; i < lines.size(); i++) {
            String[] elements = csvSplit(lines.get(i));
            if (elements.length > 1) {
                String time = elements[1];
                int hour = Integer.parseInt(time.substring(0, time.indexOf(':')));
                hours[hour]++;
            }
        }
        System.out.println(Arrays.toString(hours));
        return indexOfMax(hours);
    }

    private static int indexOfMax(int[] data) {
        int max = data[0];
        int maxIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int getMostPopularMinute(List<String> lines) {
        int[] minutes = new int[60];
        lines.stream()
                .skip(1)
                .map(line -> csvSplit(line))
                .map(elements -> elements[1])
                .map(time -> time.substring(time.indexOf(":") + 1))
                .map(minute -> Integer.parseInt(minute))
                .forEach(minute -> minutes[minute]++);
        return indexOfMax(minutes);
    }


    public static String[] csvSplit(String line) {
        return line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
    }

    public static int sum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public static int dumb(int[] data) {
        int something = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                something++;
            }
        }
        return something;
    }
    // 3
    public static int sumThing(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        for (int i = 0; i < data.length; i++) {
            sum -= data[i];
        }
        return sum;
    }
    // 4
    public static int dumb2(int[] data) {
        int something = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                something++;
            }
        }
        return something;
    }


}














