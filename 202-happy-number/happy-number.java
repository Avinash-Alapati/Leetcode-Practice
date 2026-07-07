import java.util.HashSet;
import java.util.Set;

class Solution {
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum = sum + (temp * temp); 
            n = n / 10;                
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        
        while (true) {
            if (!s.contains(n)) {
                s.add(n);
                n = this.sumOfDigits(n);
            } else {
                if (n == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
