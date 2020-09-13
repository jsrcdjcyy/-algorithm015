//说明：本题解法和第46题类似，都用递归回溯
//变量index是用来标记递归level的
//变量i不可缺少，因为每次递归进入更深一层时，需要变量i把[1，2，3，4]渐次带入
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k == 0 || n == 0) return res;
        recursion(n, k, 1, 0, res, new ArrayList<Integer>());
        return res;     
    }
    private void recursion(int n, int k, int i, int index, List<List<Integer>> ls, List<Integer> obj){
        if (index == k) {
            ls.add(new ArrayList<Integer>(obj));
            return;
            }
        for (int j = i; j <= n; j++){
            obj.add(j);
            recursion(n, k, j + 1, index + 1, ls, obj);
            obj.remove(obj.size() - 1);
        }
    }
}