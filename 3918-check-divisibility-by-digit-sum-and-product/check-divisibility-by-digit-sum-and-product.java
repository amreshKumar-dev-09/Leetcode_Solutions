class Solution {
    public boolean checkDivisibility(int n) {

        int original = n;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int last = n % 10;

            sum = sum + last;
            product = product * last;

            n = n / 10;
        }

        if (original % (sum + product) == 0) {
            return true;
        }

        return false;
    }
}