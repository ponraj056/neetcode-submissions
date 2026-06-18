class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
           int[] freq=new int[26];
           for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char ch=t.charAt(i);
            freq[c-'a']++;
            freq[ch-'a']--;
           }
           for(int n:freq){
            if(n!=0) return false;
           }
           return true;
    }
}
