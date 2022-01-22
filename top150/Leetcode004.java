class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArray = new int[nums1.length + nums2.length];
        int count = 0;
        int index1 = 0;
        int index2 = 0;
        //所以我们要对这两个数组进行合并
        while(index1 < nums1.length && index2 < nums2.length) {
            //做一个判断，如果num1小就取num1，num2小就取num2
            //这样写不合理，有bug，0不可以参与比较,因为0最小，在循环中会被加入结果数组
            // int num1 = (index1 < nums1.length) ? nums1[index1] : 0;
            // int num2 = (index2 < nums2.length) ? nums2[index2] : 0;
            int num1 = nums1[index1];
            int num2 = nums2[index2];
            //两个index不能同时前进，取到了哪个数组的值，哪个数组前进
            if(num1 < num2) {
                mergeArray[count++] = num1;
                index1++;
            } else {
                mergeArray[count++] = num2;
                index2++;
            }
        }
        //when cycle stops，仍有可能存在没有被取完值的数组，需要有兜底逻辑
        while(index1 < nums1.length) {
            mergeArray[count++] = nums1[index1++];
        }
        while(index2 < nums2.length) {
            mergeArray[count++] = nums2[index2++];
        }
        //判断数组长度，奇数取中间，偶数取两个数的平均值
        // count = 4
        // 0 1 2 3
        // count = 5
        // 0 1 2 3 4
        return (mergeArray[(count-1)/2] + mergeArray[count/2]) * 0.5;
    }
}
