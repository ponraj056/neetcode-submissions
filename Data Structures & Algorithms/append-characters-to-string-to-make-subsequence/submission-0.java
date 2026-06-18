class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        while(s.length()>i && t.length()>j){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return t.length()-j;
    }
}