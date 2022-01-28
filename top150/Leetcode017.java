class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ret = new ArrayList<>();
        if(digits.length() == 0) {
            return ret;
        }
        StringBuilder sb = new StringBuilder();
        //遍历搜索树，sb和0可以唯一确定在数组中的位置，将叶子节点的值加入ret中
        //将叶子节点的值加入到ret中
        //这道题难点在于构建搜索树和理解递归函数的含义（遍历节点并判断节点）
        //还需要一个map储存 数字 key 字母 v的对应
        String[] num2Char = new String[]{"","","abc","def","ghi","jkl",
        "mno","pqrs","tuv","wxyz"};
        traverseSearchTreeNode(digits, 0, sb, ret, num2Char);
        return ret;
    }

    public void traverseSearchTreeNode(String digits, int index,
        StringBuilder sb, List<String> ret, String[] num2Char) {
        if(index == digits.length()) {
            ret.add(sb.toString());
            return;
        }
        String charStr = num2Char[digits.charAt(index) - '0'];
        for(int i = 0; i < charStr.length(); i++) {
            sb.append(charStr.charAt(i));
            traverseSearchTreeNode(digits, index + 1, sb, ret, num2Char);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
