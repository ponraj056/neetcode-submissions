class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        int l=0;
        int max=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          while(set.contains(c)){
            set.remove(s.charAt(l++));
          }
          set.add(c); 
          max= Math.max(max,i-l+1);
         
        }
        return max;
    }
}
