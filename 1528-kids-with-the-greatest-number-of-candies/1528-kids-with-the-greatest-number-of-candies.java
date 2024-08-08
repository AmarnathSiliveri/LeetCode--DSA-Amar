import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      
        int maxCandies = Arrays.stream(candies).max().orElse(0);
        
        
        List<Boolean> result = new ArrayList<>();
        
        
        for (int i = 0; i < candies.length; i++) {
            
            if (candies[i] + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}