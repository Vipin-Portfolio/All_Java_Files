import java.util.HashMap;
import java.util.HashSet;

public class UniqueCharacter {
    public static void main(String[] args) {
        String unique = "vipin";
        boolean ans = method(unique);
        System.out.println(ans);
    }
    public static boolean method(String unique){
        HashSet<Character> hashSet = new HashSet<>();
        for(Character c: hashSet){
            if(!hashSet.contains(c)){
                return true;
            }
            else
                return false;
        }
        return false;
    }

}

