// StudentScoreStorage.java
import java.util.*;
import java.util.stream.*;

public class StudentScoreStorage {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Anu", 85);
        scores.put("Ally", 92);
        scores.put("Raj", 78);

        scores.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .ifPresent(e -> System.out.println("Top scorer: " + e.getKey() + " with " + e.getValue()));
    }
}
