学习笔记

高级动态规划
1.动态规划和递归或者分治没有根本上的区别（关键看有无最优子结构）
2.和递归分治的共性：找到重复子问题
3.和递归分治的差异：最优子结构，中途可以淘汰次优解

DP 递推模板
function DB():
    dp=[][] #二维情况

    for i=0...m {
        for i=0...n{
            dp[i][j] = _Function(dp[i'][j'])
        }
    }

    return dp[m][n]

高级dp复杂度来源
1.状态拥有更多的维度（二维，三维或更多，甚至需要压缩）
2.状态方程更加复杂

字符串算法遍历字符串

c++：

string x("abc")
for (int i = 0; i<x.lenght();i++){
    Cout << x[i]
}

Go：

x:="abc"
for i:=0; i<len(x);i++ {
    fmt.Println(x[i])
}


字符串匹配算法
1.暴力法
2.RabinKMP算法
3.Boyer-Moore算法
4.Sunday算法
5.Karp算法


Rabin-Karp算法思想
1.假设子串长度为M（pat）目标字符串长度为N（txt)
2.计算子串的hash值hash_pat
3.计算目标字符串txt中每个长度为M的子串的hash值（共需要计算N-M+1次）
4.比较hash值，如果hash值不同则必然不匹配；如果相同则需要使用朴素算法进行进一步判断
