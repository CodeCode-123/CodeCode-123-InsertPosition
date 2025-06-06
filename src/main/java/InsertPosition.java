

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        } else if (target < nums[0]) {
            return 0;
        } else if (target > nums[nums.length-1]) {
            return nums.length;
        }
        int l = 0;
        int r = nums.length-1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return l;
    }
}
