import java.util.HashMap;

public class OccuranceOfWords {

    public static void main(String[] args) {
        String str = "I I love java java programming";
        OccuraceOfWordInSentence(str);
    }

    private static void OccuraceOfWordInSentence(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = str.split(" ");
        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}
