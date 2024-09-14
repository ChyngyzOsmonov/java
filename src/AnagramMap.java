import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnagramMap {
    private Map<Integer, List<String>> map;

    public AnagramMap(Map<Integer, List<String>> map) {
        this.map = map;
    }

    public void addToMap(String s) {
        int hash = calculateHash(s);
        if (map.containsKey(hash)) {
            map.get(hash).add(s);
        } else {
            List<String> arr = new ArrayList<>();
            arr.add(s);
            map.put(hash, arr);
        }
    }

    private  int calculateHash(String s) {
        char[] c = s.toCharArray();
        int res = s.length();
        for (char value: c) {
            res+= value;
        }
        return res;
    }
}
