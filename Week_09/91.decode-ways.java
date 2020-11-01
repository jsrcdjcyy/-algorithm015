public int numDecodings(string s) {
    if (s.charAt(0) == '0') return 0;
    char[] arr = s.toCharArray();
    int pre = 1, curr = 1;
    for (int i = 1; i < s.length(); i++) {
        int tmp = curr;
        if (arr[i] == '0'){
            if (arr[i - 1] == '1' || arr[i - 1] == '2') curr = pre;
            else return 0;
        }
        else if (arr[i - 1] == '1' || (arr[i - 1] == '2' && arr[i] >= '1' && arr[i] <= '6')){
            curr = curr + pre;
        }
        pre = tmp;
    }
    return curr;
}
