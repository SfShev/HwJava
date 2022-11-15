import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileinSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] parts = path.split(" ");
            String directoryName = null;
            for (String part : parts) {
                if (directoryName == null) {
                    directoryName = part;
                } else {
                    int bracketIndex = part.indexOf("(");
                    StringBuilder fileName = new StringBuilder();
                    fileName.append(directoryName);
                    fileName.append("/");
                    fileName.append(part.substring(0, bracketIndex));
                    String content = part.substring(bracketIndex + 1, part.length() - 1);
                    map.putIfAbsent(content, new ArrayList<String>());
                    map.get(content).add(fileName.toString());
                }
            }
        }

        List<List<String>> duplicates = new ArrayList<>();
        for (List<String> value : map.values()) {
            if (value.size() > 1) {
                duplicates.add(value);
            }
        }
        return duplicates;
    }
}
