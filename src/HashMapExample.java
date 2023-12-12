import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        String s1 = "sheet";
        String s2 = "abckd";

        System.out.println(anagram(s1, s2));


    }

    public static void integerMap() {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(5, "Ciara");
        map.put(5, "Random");
        map.put(4, "Dre");

        if(map.containsKey(89)) {
            String name =  map.get(89);

            System.out.println(name);
        }
        else {
            System.out.println("Key doesn't exist");
        }

        for(Integer key: map.keySet()) {
            System.out.println("key: " + key + "Value: " + map.get(key));
        }

        System.out.println(map);

    }

    public static void stringMap() {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 45);
        map.put("A", 565);
        System.out.println(map);
    }

    public static boolean anagram(String s1, String s2) {

        //  sheet, aeehs

        if (s1.length() != s2.length()) {
            return false;
        }

        // Map <Character, Integer>
        // s -> 1, h -> 1, e- > 2, t -> 1
        // Map <Character, Integer>
        // s-> 1, h -> 1, e-> 2 , t -> 1

        // Map<Character, Integer>
        // s-> 1, h-> 1. e-> 2, t -> 1
        // s-> 1, h-> 1. e-> 2, t -> 0
        // s-> 0, h -> 0, e-> 0, t-> 0
        //

        int[] store = new int[26];

        // store[0] = count of 'a'
        // store[1] = count of 'b';
        // store[25] = count of 'z';

        for (int i=0; i <s1.length(); i++) {
            store[s1.charAt(i) - 'a']++;
            store[s2.charAt(i) - 'a']--;
        }


        for(int num : store) {
            if(num!=0) {
                return false;
            }
        }

        return true;
    }

}
