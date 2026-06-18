class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int res=0;
        for(int i=0;i<s.length()-1;i++){
          res=((int)s.charAt(i+1))-((int)s.charAt(i));
          int val=Math.abs(res);
          sum+=val;
        }
        return sum;
    }
}