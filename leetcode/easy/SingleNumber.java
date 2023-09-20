public class SingleNumber {

        public int singleNumber(int[] nums) {
//            Arrays<Integer> res=new Arrays();
//
//            for(int n:nums){
//                if(res.contain(n)){
//                    res.pop(n)
//                }else
//                    res.add(n)
//            }
//
//            return res[0];



            int ans=0;
            for(int n:nums)
                ans ^=n;
            return ans;

        }
}
