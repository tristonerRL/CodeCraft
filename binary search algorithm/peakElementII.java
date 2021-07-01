class Solution {
    public int[] findPeakGrid(int[][] A) {
        int[] res = new int[2];
        if(A == null || A.length == 0 || A[0].length == 0) {
            return res;
        }
        int low = 0, high = A.length - 1;
        while(low + 1 < high) {
            //consider mid row and find peak element in it
            int mid = low + (high - low) / 2;
            int col = findPeak(mid, A);
            //
            if(A[mid][col] < A[mid - 1][col]) {
                high = mid - 1;
            } else if(A[mid][col] < A[mid + 1][col]) {
                low = mid + 1;
            //mid row peak is a global peak
            } else {
                res[0] = mid;
                res[1] = col;
                return res;
            }
        }
        int m1 = findPeak(low, A);
        int m2 = findPeak(high, A);
        if(A[high][m2] > A[low][m1]) {
            res[0] = high;
            res[1] = m2;
        } else {
            res[0] = low;
            res[1] = m1;
        }
        return res;
    } 

    public int findPeak(int row, int[][] A) {
        int max = A[row][0];
        int col = 0;
        for(int i = 1; i < A[row].length; i++) {
            if(A[row][i] > max) {
                max = A[row][i];
                col = i;
            }
        }
        return col;
        
    }   
}