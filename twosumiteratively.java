class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        int n= nums.length;
        int [] storing=new int[2];
        
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++){
                if((nums[i] + nums[j])== target){
                storing[0]=i;
                storing[1]=j;
                }
            }
        return storing;
    }
}
