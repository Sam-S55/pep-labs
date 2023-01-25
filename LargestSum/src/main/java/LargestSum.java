
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int large = nums.get(0); //largest number
        int large2 = nums.get(0); //2nd largest number
        int li = 0; //index of largest number
        for (int i=1; i<nums.size(); i++) { //find largest number in list + its index
            if (nums.get(i) > nums.get(i-1)) {
                large = nums.get(i);
                li = i;
            }
        }
        for (int i=1; i<nums.size(); i++) { //find 2nd largest number in list
            if (nums.get(i) > nums.get(i-1) && i!=li) {
                large2 = nums.get(i);
            }
        }
        return large+large2;
    }
}