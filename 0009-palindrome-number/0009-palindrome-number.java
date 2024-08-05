import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) 
    {
        String num=Integer.toString(x);
        StringBuilder num2=new StringBuilder();
        
        for (int i=num.length()-1;i>=0;i--)
        {
            
            num2.append(num.charAt(i));

        }
        
        if(num.equals(num2.toString()))
        {
            return true;
        }
        else 
        {
            return false;
        }

    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
    
        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(x));

    }
}