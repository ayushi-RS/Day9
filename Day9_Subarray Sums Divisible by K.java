class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int count=0;
        int rem=0;
        HashMap<Integer,Integer> hm=new HashMap();
        hm.put(0,1);
        for(int val:nums){
            sum+=val;
            rem=sum%k;
            if(rem<0){
                while(!(rem>=0)){
                    rem+=k;
                }
            }
            if(hm.containsKey(rem)){
                count+=hm.get(rem);
                hm.put(rem,hm.get(rem)+1);
            }
            else{
                hm.put(rem,1);
            }
        }
        return count;
    }
}