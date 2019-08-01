class Solution {
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum,remain;
        while (inLoop.add(n)) {//if this number was seen before, we would konw and the logic would end
            squareSum = 0;
            while (n > 0) {
                remain = n%10;
                squareSum += remain*remain;
                n /= 10;
            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;
        }
        return false;

    }
}
//the key to this question is to figuring out two things, one, loop detection(arguably the harder of the two), two, figuring out how to add the square sum, which is easy, remember to formalize the problem