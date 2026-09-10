class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(Integer i:nums){
            if(a.containsKey(i)){
                return i;
            }
            else{
                a.put(i,0);
            }
        }
        return 0;
    }
}
