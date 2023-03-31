package ex__16;

import java.util.Arrays;
import java.util.List;

public class ProcessedName {
    String name;
    List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

    public ProcessedName(String name) {
        this.name = name;
        System.out.println(name);
    }
}
