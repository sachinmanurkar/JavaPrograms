import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {

    public static void main(String[] args) {
        String str = "SachinRamya working in IT";
        char ch = 'i';
        OccuranceOfCharacterInASentence(str, ch);
    }
    private static void OccuranceOfCharacterInASentence(String str, char key) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        String finalString = str.replaceAll(" ", "").toLowerCase();
        System.out.println(finalString);
        char[] ch = finalString.toCharArray(); /// [S,a,c,.h,i,n.......]
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == key) {
                count++;
            }

        }
        System.out.println(key + " is repeating for " + count + " number of times");
        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        System.out.println("Size of map : " + map.size());
    }
}
