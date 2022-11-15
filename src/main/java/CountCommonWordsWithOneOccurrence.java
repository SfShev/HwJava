import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public int countWords(String[] words1, String[] words2) {
        int ans = 0;
        Map<String, Integer> map = new HashMap();
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            if (!map.containsKey(word)) continue;
            if (map.get(word) <= 1) {
                map.put(word, map.get(word) - 1);
            }
        }
        for (String word : map.keySet()) {
            if (map.get(word) == 0) ans++;
        }
        return ans;
    }
}
