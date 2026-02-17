import java.util.HashMap;

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        
        var map1 = new HashMap<Character,Integer>();
        var map2 = new HashMap<Character,Integer>();
        
        for(var i = 0; i < s1.length();i++){
            char c1  = s1.charAt(i) , c2 = s2.charAt(i);
            map1.put(c1,map1.getOrDefault(c1 ,0) + 1);
            map2.put(c2,map2.getOrDefault(c2 ,0) + 1);
        }
        
        
        if(map1.keySet().size() != map2.keySet().size()) return false;
        
        for(var key : map1.keySet()){
            if(!map2.contains(key) && map1.get(key) != map2.get(key)) return false;
        }
        
        return true;
    }
}