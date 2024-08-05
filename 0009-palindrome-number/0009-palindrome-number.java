import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {

        String num = Integer.toString(x);
        int left = 0;
        int right = num.length() - 1;


        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(x));
    }
}
