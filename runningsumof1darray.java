class Solution {
    public int[] runningSum(int[] nums) {
        int n= nums.length;

        //initialize a new array
        int[] arr=new int[n];
        
        //assign the first element of our new array to the first element of our nums (available) array
        arr[0]=nums[0];

        //our resulting array elements consist of adding the element of our before index(i-1) and the actual element(i) of our old array
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+nums[i];
        }

        return arr;
}
}