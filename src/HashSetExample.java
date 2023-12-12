import java.util.HashSet;
import java.util.Set;

public class HashSetExample {


    public static void main(String[] args) {

        String input = "abcfrkkgutydgdadadffafdadafdddadfa";

        Set<Character> set = new HashSet<>();

        for(Character ch : input.toCharArray()) {
            set.add(ch);
        }

        System.out.println(set);
    }

}
