//本题是我在做了第46题后，在第46题基础上修改而成的
//和第46题不同的是，本题加了一个HashSet集合用来过滤ArrayList中可能存在的重复list
//和第46题相比，本题解法在处理全排列问题时更通用
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> hs = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0 || nums == null) return res;
        boolean[] isUsed = new boolean[nums.length];
        recursion(nums, 0, isUsed, new ArrayList<Integer>(), hs);
        Iterator<List<Integer>> lt = hs.iterator();
        while(lt.hasNext()){
            res.add(lt.next());
        }
        return res;
    }
    private void recursion(int[] arr, int index, boolean[] mark, List<Integer> obj, Set<List<Integer>> hs){
        if (index == arr.length) {
        hs.add(new ArrayList<Integer>(obj));
        return;
        }
        for (int j = 0; j < arr.length; j++){
            if (!mark[j]){
            obj.add(arr[j]);
            mark[j] = true;
            recursion(arr, index + 1, mark, obj, hs);
            obj.remove(obj.size() - 1);
            mark[j] = false;
            }
        }
    }
}