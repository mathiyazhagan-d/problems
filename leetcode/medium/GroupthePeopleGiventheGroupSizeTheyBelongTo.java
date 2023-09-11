import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupthePeopleGiventheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> tempGroup = new HashMap<>();
        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<groupSizes.length;i++){
            int size=groupSizes[i];
            tempGroup.putIfAbsent(size,new ArrayList<>());
            tempGroup.get(size).add(i);

            if(tempGroup.get(size).size()==size){
                result.add(new ArrayList<>(tempGroup.get(size)));
                tempGroup.get(size).clear();
            }

        }
        return result;
    }
}
