public class SignOfTheProductOfAnArray {
    class Solution {
        public int arraySign(int[] nums) {
            int res=0;
            for(int n:nums){
                if(n<0)
                    res++;
                if(n==0)
                    return 0;
            }
            if(res%2!=0)
                return -1;
            else
                return 1;
        }
    }
}
