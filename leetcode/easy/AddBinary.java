public class AddBinary {

    class Solution {
        public String addBinary(String a, String b) {
            StringBuffer result=new StringBuffer();
            int legA = a.length()-1;
            int legB = b.length()-1;
            int carry = 0 ;
            int res=0;
            while(legA >= 0 || legB >= 0){

                int A= (legA>=0)?a.charAt(legA)-'0':0;
                int B= (legB>=0)?b.charAt(legB)-'0':0;

                res=A+B+carry;
                carry=res/2;
                result.insert(0,res%2);


                legA--;
                legB--;
            }
            if(carry>0)
                result.insert(0,carry);

            return result.toString();
        }
    }
}
