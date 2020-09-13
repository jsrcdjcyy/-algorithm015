学习笔记



week_03学习笔记


树的面试题解法一般都是递归。原因：1、树的节点的定义本身就是递归的 2、树在定义其自身数据结构和算法特性的时候，采用的也是递归的方式来定义。

递归的本质就是循环。它通过调用函数的函数体来进行循环。

递归思维要点：
    1、不要进行人肉递归
    2、寻找最近子问题
    3、数学归纳法思维
    4、超哥强调的：对于一些典型的递归，比如树的遍历等，要把代码模版背下来！

解递归题的一般步骤：
    1、recursion terminator,先写退出条件
    2、process logic incurrent level,处理本层逻辑
    3、drill down，下探到下一层
    4、reverse the current level status if needed，退出时清理本层


分治和回溯：本质上都是递归问题。

分治：把复杂问题拆分成子问题，分开处理。最后合并子问题得到的结果。

分治法解题步骤：
    1、recursion terminator，先写退出条件
    2、prepare data，准备数据
    3、conquer subproblems，处理子问题
    4、process and generate the final result,组装最终结果
    5、reverse the current level states if needed，清理当前层


回溯：通过不断试错找到正确的解。当搜索时遇到了无效解，则退回过程中要清理之前的无效状态。


