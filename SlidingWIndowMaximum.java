public class Solution {
    /**
     * @param nums: A list of integers.
     * @param k: An integer
     * @return: The maximum number inside the window at each moving.
     */
    public List<Integer> maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) {
            return new ArrayList<Integer>();
        }
        List<Integer> res = new ArrayList<>();
        // write your code here
        Deque<Integer> Qi =  new LinkedList<Integer>();
        int i = 0;
        for(i = 0; i < k; i++) {
            //The previous smaller elements are useless so remove them from Qi
            while(!Qi.isEmpty() && nums[i] >= nums[Qi.getLast()]) {
                Qi.removeLast();
            }
            //add index
            Qi.addLast(i);
        }
        //Process rest of the elements
        for(i = k; i < nums.length; i++) {
            //The element at front is the largest element of previous window, so add
            //it to the result
            res.add(nums[Qi.getFirst()]);
            //remove the elements which are out of the current window
            while(!Qi.isEmpty() && Qi.getFirst() <= i - k) {
                Qi.removeFirst();
            }
            //remove all elements smaller than current being added element
            while(!Qi.isEmpty() && nums[i] >= nums[Qi.getLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }
        res.add(nums[Qi.getFirst()]);
        return res;
    }
}