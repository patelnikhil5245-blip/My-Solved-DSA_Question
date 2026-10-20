import java.util.*;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Hashtable<Integer, String> tb = new Hashtable<>();
        for (int i = 0; i < heights.length; i++) {
            tb.put(heights[i], names[i]);
        }
    TreeMap<Integer, String> map =new TreeMap<>(Collections.reverseOrder());
    map.putAll(tb);
   return map.values().toArray(new String[0]);
    }
}