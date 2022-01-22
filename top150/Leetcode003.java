class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        //start 是 不重复子串的起始坐标
        int start = 0;
        //end 是 不重复子串的结尾坐标
        int end = 0;
        //我穷举 所有不含有重复字符的字符串 然后用一个全局变量maxLength记录他们的长度
        int globalMaxLength = 0;
        // 怎么样确定一个子串里面没有重复的数字呢？
        // 使用hashset
        // 因为hashset里面保存的都是不重复的值
        // 我如果往hashset里面新加入一个数key，可以进行判断
        // set.contains(key)
        // 如果返回true说明set里面有一个重复的数字
        HashSet<Character> numBeforeEnd = new HashSet<>();
        for(end = 0; end < s.length(); end++) {
            //固定end，在每次大循环中，把以end为结尾的最长不重复子串的长度tempMaxLength取出来，
            //然后更新全局globalMaxLength
            int tempMaxLength = 1;
            while(numBeforeEnd.contains(s.charAt(end)) && start < end) {
                numBeforeEnd.remove(s.charAt(start));
                start = start + 1;
            }
            //if 循环 stops,说明 start到end范围内已经完全没有重复的数字了，它一定是以end为结尾最长的子字符串
            numBeforeEnd.add(s.charAt(end));
            tempMaxLength = (end - start + 1);
            globalMaxLength = Math.max(globalMaxLength, tempMaxLength);
        }
        return globalMaxLength;
    }
}
