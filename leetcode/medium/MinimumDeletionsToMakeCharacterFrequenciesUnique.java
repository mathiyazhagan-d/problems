import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        int deletion=0;

        int[] freq=new int[26];


        for(char c: s.toCharArray())
            freq[c-'a']++;

        Set<Integer> uniqueFrequencies = new HashSet<>();

        for(int count: freq){
            while(count !=0 && !uniqueFrequencies.add(count)){
                deletion++;
                count--;
            }
        }

        return deletion;
    }
}
