import java.util.ArrayList;
import java.util.List;

public class GroupthePeopleGiventheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<groupSizes.length;i++){
            if(groupSizes[i]>0){
                int size=groupSizes[i];
                List<Integer> temp=new ArrayList<>();
                for(int j=0;j<groupSizes.length && temp.size()<size;j++){
                    if(groupSizes[j]==size){
                        temp.add(j);
                        groupSizes[j]=0;
                    }
                }
                if(temp.size()>0)
                    result.add(temp);
            }
        }
        return result;
    }
}
