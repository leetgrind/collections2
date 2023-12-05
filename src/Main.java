import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        numList();
    }

    public static void arrayList() {

        List<String> stringList = new ArrayList<>();

        stringList.add("ABC");
        stringList.add("DEF");
        stringList.add("random");


        for(int i=0; i<stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        for (String element : stringList) {
            System.out.println(element);
        }

    }

    public static void numList() {
        List<Integer> numList = Arrays.asList(14, 8 , 13, 4);

        Collections.sort(numList);

        System.out.println(numList);
    }
}