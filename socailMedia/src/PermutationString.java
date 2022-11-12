import java.util.HashMap;

public class PermutationString {
    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "sett";
        boolean ans = method(s1,s2);
        System.out.println(ans);

    }
    public static boolean method(String s1,String s2){
        HashMap<Character,Integer> hashmap = new HashMap<>();
        int count = 1;
        if(s1.length()!=s2.length()){
            return false;
        }
        for(Character c : s1.toCharArray()){
            if(!hashmap.containsKey(c)){
                hashmap.put(c,count);
            }
            else{
                hashmap.put(c,count+1);
            }
        }
        for(Character c: s2.toCharArray()){
            if(!hashmap.containsKey(c)){
                return false;
            }
            else{
                hashmap.put(c,count-1);
            }
        }
        for(Character c: hashmap.keySet()){
            if(hashmap.get(c)!=0){
                return false;
            }
        }
        return true;
    }

}
