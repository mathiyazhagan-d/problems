import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int map1[] = new int[200];
        int map2[] = new int[200];

        if(s.length()!=t.length())
            return false;

        for(int i=0;i<s.length();i++){
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;

            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;

    }
    public boolean isIsomorphics(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))) {
                if (!hm.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            }else{
                if(hm.containsValue(t.charAt(i)))
                    return false;
                else
                hm.put(s.charAt(i),t.charAt(i));

            }
        }
return true;
    }
}
