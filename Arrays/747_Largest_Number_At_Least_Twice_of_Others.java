import java.util.Arrays;

class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i] = nums[i];      
        }
        Arrays.sort(ans);
        int num=0;
        if(ans[n-2]*2 <= ans[n-1])
        {
            num = ans[n-1];
            for(int i=0;i<n;i++)
            {
                if(nums[i]==num)
                {
                    return i;
                }
            }
        }
       return -1;

    }
}