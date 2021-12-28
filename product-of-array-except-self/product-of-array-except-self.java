class Solution {
    //without devide operator
    public int[] productExceptSelf(int[] nums){
      int len = nums.length;
        int[] result = new int[len];
        int left = 1;
        for (int i = 0; i< len; i++){
            result[i] = left;
            left *=nums[i];
        }
        int right = 1;
        for (int i = len -1; i >=0; i--){
            result[i] *=right;
            right *=nums[i];
        }
        return result;
    }
    //with devide operator
    public int[] productExceptSelf(int[] nums) {
        long count=1;
        int zero=0;
        for(int i:nums)
        {
            if(i!=0)
            {
                count*=i;
            }
            else{
                zero++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                if(zero==0){
                nums[i]=(int)(count/nums[i]);
                }
                else 
                    nums[i]=0;
            }
            else
            {
                if(zero==1)
                {
                    nums[i]=(int)count;
                }
                else {
                    nums[i]=0;
                }
            }
        }
        return nums;
    }
}
