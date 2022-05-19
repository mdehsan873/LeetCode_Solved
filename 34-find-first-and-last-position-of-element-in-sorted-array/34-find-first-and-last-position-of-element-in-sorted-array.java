class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int left=0;
        int ans[]={-1,-1};
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                System.out.println(mid);
                first=mid;
            }
            if (nums[mid]>=target)
                right=mid-1;
            else
                left=mid+1;
            
        }
        if (first==-1)
            return ans;
        right=nums.length-1;
        left=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                last=mid;
            }
            if (nums[mid]<=target)
                left=mid+1;
            else
                right=mid-1;
            
        }
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
}