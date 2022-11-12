package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PosisbleCombination
{
     static String combination = "";
     static int count = 0;
    public static void main(String[] args) {
        String input = "abcd";
        init(input,count);
    }
    public static void backTracking(String input, int bCount, int cCount, List<List<String>>result,int count)
    {

        if(combination.length()==3)
        {
            List<String> temp = new ArrayList<>();
            temp.add(combination);
            result.add(temp);
            count++;
            return;
        }
        for(int i = 0; i  < input.length(); i++)
        {
            if(i==1)
            {
                if(bCount>=1)
                    continue;
                else
                    bCount++;
            }
            if(i==2)
            {
                if(cCount>=2)
                    continue;
                else
                    cCount++;
            }
            combination+=input.charAt(i);
            backTracking(input,bCount,cCount,result,count);
            combination=combination.substring(0,combination.length()-1);
        }
    }
    static void init(String input,int count)
    {
        List<List<String>> result = new ArrayList<>();
        backTracking(input,0,0,result,count);
        System.out.println(result);
        System.out.println(result.size());
    }
}
