public class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int low = 0, high = A.length - 1;
        while(low + 1 < high) {
            //find index of the middle element
            int mid = low + (high - low) / 2;
            /**
                if middle element is not peak and its right neighbour 
                is smaller than it, then left hand must have a peak element 
            */
            if(A[mid] > A[mid+1]) {
                high = mid;
            /**
                if middle element is not peak and it right neighbor 
                is greater than it, then right hand must have a peak element
            */
            } else {
                low = mid + 1;
            }
        }
        return (A[low] > A[high]) ? low : high; 
    }
}