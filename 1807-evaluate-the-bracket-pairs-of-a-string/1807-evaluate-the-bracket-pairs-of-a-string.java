class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        HashMap<String, String> map = new HashMap<>();

        // Store knowledge in map
        for (List<String> k : knowledge) {
            map.put(k.get(0), k.get(1));
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == '(') {

                i++; // skip '('

                StringBuilder key = new StringBuilder();

                // Get key until ')'
                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }

                // Check key in map
                if (map.containsKey(key.toString())) {
                    ans.append(map.get(key.toString()));
                } else {
                    ans.append("?");
                }

                i++; // skip ')'

            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }

        return ans.toString();
    }
}