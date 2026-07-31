class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> m1 = new HashMap<>();

        for(int num:nums)
        {
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
        for(int num:nums)
        {
            if(m1.get(num)==1)
            {
                return num;
            }
        }
        return -1;
    }
}