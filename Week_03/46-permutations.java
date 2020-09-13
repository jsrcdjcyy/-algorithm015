//说明：本题解法和第77题类似，都用递归回溯
//布尔数组isUsed用来标记int数组nums内对应位置被使用过的元素;被使用过的元素不能被再使用
//变量index是用来标记递归level的
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0 || nums == null) return res;
        boolean[] isUsed = new boolean[nums.length];
        recursion(nums, 0, isUsed, res, new ArrayList<Integer>());
        return res;
    }
    private void recursion(int[] arr, int index, boolean[] mark, List<List<Integer>> ls, List<Integer> obj){
        if (index == arr.length) {
            ls.add(new ArrayList<Integer>(obj));
            return;
        }
        for (int j = 0; j < arr.length; j++){
            if (!mark[j]){
                obj.add(arr[j]);
                mark[j] = true;
                recursion(arr, index + 1, mark, ls, obj);
                obj.remove(obj.size() - 1);
                mark[j] = false;
            }
        }
    }
}