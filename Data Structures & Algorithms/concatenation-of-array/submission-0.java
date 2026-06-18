class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n+n];
        int ind=0;
       for(int num:nums){
            ans[ind]=num;
            ind++;
        }
        for(int i=0;i<n;i++){
            if(ans[i]==nums[i]){
                ans[ind]=nums[i];
                ind++;
            }
        }
        return ans;
    }
}