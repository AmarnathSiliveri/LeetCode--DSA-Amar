import java.util.Scanner;
class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder mergedString = new StringBuilder();
        int l1= word1.length();
        int l2=word2.length();
        int maxlength=Math.max(l1,l2);
        for (int i=0;i<maxlength;i++)
        {
            if (i<l1) 
            {
                mergedString.append(word1.charAt(i));
            }
            if (i<l2) 
            {
                mergedString.append(word2.charAt(i));

            }
        }
            return mergedString.toString();
        
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately(word1,word2));

    }
}