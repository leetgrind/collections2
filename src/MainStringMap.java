import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStringMap {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("ciara", "josh", "chen", "lee");

        List<String> filteredList = stringList.stream()
                        .filter(name -> name.startsWith("c"))
                                .collect(Collectors.toList());


        boolean result = stringList.stream()
                        .anyMatch(name -> name.startsWith("a"));

        System.out.println(filteredList);

        System.out.println(result);
    }

}
