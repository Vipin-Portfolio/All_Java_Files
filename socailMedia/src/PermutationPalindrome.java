import java.util.*;

public class PermutationPalindrome {
    public static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
//       String input1 = "abcd";
//        int len = input1.length();
//        permutationMethod(input1, 0, len);
//        boolean output = validation();
//        System.out.println(output);
        String str = "aa";
        System.out.println(breakPalindrom(str));
    }
    public static boolean validation(){
        String input2 = "dcba";
        String output = palin(input2);
        for(String str : arrayList){
        if(str.equals(output))
            return true;
        else
            return false;
        }
        return false;
    }
        public static String swapMethod(String str, int i, int j) {
            char[] input =str.toCharArray();
            char ch;
            ch = input[i];
            input[i] = input[j];
            input[j] = ch;
            return String.valueOf(input);
        }
        public static void permutationMethod(String str, int start, int end)
        {
            if (start == end -1)
                arrayList.add(str);
            else
            {
                for (int i = start; i < end; i++)
                {
                    str = swapMethod(str, start,i);
                    permutationMethod(str, start +1, end);
                    str = swapMethod(str, start,i);
                }
            }
        }
        public static String palin(String str){
            StringBuilder sb = new StringBuilder();
            for (int i = str.length()-1; i >=0; i--) {
                sb.append(str.charAt(i));
            }
            return sb.toString();
        }
    public static String breakPalindrome(String palindrome) {
        char[] ch = palindrome.toCharArray();

        if(palindrome.length()==1||palindrome.length()==0)
            return "";
        boolean flag = false;
        for(int i = 0; i < ch.length;i++){
            if(ch[i]=='a')
                flag=true;
            else {
                flag = false;
                break;
            }
        }
        if(flag==true){
            ch[ch.length-1]='b';
            return String.valueOf(ch);
        }
        for(int i = 0; i < ch.length;i++){
            if(ch[i]=='b'){
                flag=true;
            }
            else {
                flag = false;
                break;
            }
        }
        if(flag==true){
            ch[ch.length-1]='a';
            return String.valueOf(ch);
        }
        for(int i = 0; i < palindrome.length()/2;i++){
            if(ch[i]!='a'){
                ch[i]='a';
                return String.valueOf(ch);
            }

        }
        return String.valueOf(ch);
    }

    public  static String breakPalindrom(String p) {
        int len = p.length();
        if(len==1)
            return "";
        char[] ch = p.toCharArray();
        char a = 'a';
        boolean loop = true;
        while(loop){
            for(int i = 0; i < len/2;i++){
                if(ch[i]>a){
                    ch[i]=a;
                    loop=false;
                    break;
                }
                else if(ch[i]!=a){
                    ch[len-i-1] = a;
                    loop=false;
                    break;
                }
            }
            a++;
        }
        return new String(ch);
    }

}







