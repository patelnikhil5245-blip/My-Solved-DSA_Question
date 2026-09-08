class Solution {
    public int lengthOfLongestSubstring(String s) {
      
        // int charIndex[] = new int[128];

        // int max=0, left=0;
        
        // for(int right = 0; right<s.length(); right++){
        //     char ch = s.charAt(right);
        //     left = Math.max(left, charIndex[ch]);

        //     charIndex[ch] = right + 1;

        //     max= Math.max(max,right - left + 1); 
        // }

        // return max;
       int n=s.length();
       int max=0;
        int i=0,j=0;
        Set<Character>st=new HashSet<>();

        while(j<n){
            char c= s.charAt(j);
            while(st.contains(c)){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(c);
            max=Math.max(max,j-i+1);
            j++;

        }
        return max;
    }

}