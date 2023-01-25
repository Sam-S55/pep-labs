

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
        int place = -1;
        for (int i=0; i<nums.length; i++) {
            if (i==0 && target<nums[i]) {
                place = 0;
            } else if (i!=0 && nums[i-1]<target && target<nums[i]) {
                place = i;
            } else if (i==nums.length-1 && nums[i]<target) {
                place = i+1;
            }
        }
        return place;
    }
}
