public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int n = x;
        while (n != 0) {
            int l = n % 10;
            rev = rev * 10 + l;
            n = n / 10;
        }
        if (rev == x) {
            return true;
        } else {
            return false;
        }

    }
}
