class Solution {
        public int search(int[] nums, int target) {
        // corner case
        if (nums == null || nums.length == 0) return -1;
        int left = 0;//beginning
        int right = nums.length - 1;//end
        while (left <= right) {// if left have over taken the right, they cant
            int mid = left + (right - left) / 2;//mid is this
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}