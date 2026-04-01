class Solution {
   public int reverseExponentiation(int n) {
        int rev = reverse(n);
        return power(n, rev);
    }

  
    int reverse(int n) {
        int rev = 0;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // ✅ defined at class level
    int power(int base, int exp) {
        if(exp == 0) return 1;
        return base * power(base, exp - 1);
    }
}