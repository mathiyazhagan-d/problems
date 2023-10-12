public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            if(hm.containsKey(n)){
                return true;
            }
            hm.put(n,n);

        }
        return false;
    }
}
