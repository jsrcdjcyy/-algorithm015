﻿学习笔记

week_02学习笔记


哈希表(HashTable)：

哈希表：也叫散列表，是根据关键码值而直接进行访问的数据结构。

散列函数：哈希表通过关键码值映射到表中一个位置来访问记录，以加快查询速度。这个映射函数就是散列函数。通过哈希函数
进行查询的话，时间复杂度是O(1)的。

哈希表在工程上一般都被抽象出来，一般分为Map和Set两类。其中Map是KV键值对，其中key不能重复；Set是不重复元素的集合。



树(Tree)：

链表(LinkedList)是特殊化的树(Tree)，树是特殊化的图(Graph)
。没有环的图就是树。

二叉树的遍历：1、前序：根左右  2、中序：左根右  3、后序：左右根

二叉树遍历的时间复杂度是O(n)的。

二叉搜索树：也称二叉排序树、有序二叉树、排序二叉树。它指的是一颗空树，或者具备如下性质的二叉树：1、左子树上所有结点的值均小于它根节点的值；2、右子树上所有结点的值均小于它根节点的值；3、它的左右子树都是二叉查找树。

二叉搜索树性质：它的中序遍历是升序的。二叉搜索树的查询和插入等操作的时间复杂度都是O(logn)的。



堆(Heap)：

堆(Heap)：可以迅速找到一堆数中的最大或者最小值的数据结构。其中，根结点最大的堆称为大顶堆或者大根堆，根节点最小的堆叫做小顶堆或者小根堆。常见的堆有二叉堆、斐波拉契堆等。

二叉堆性质：通过完全二叉树(并非二叉搜索树)来实现。

大顶二叉堆性质：1、是一颗完全树；2、树中任意结点的值总是大于等于其子结点的值。

二叉堆实现细节：一、二叉堆一般都通过数组来实现；二、假设第一个元素在数组中的索引为0的话，则其父节点和子节点位置关系如下：1、索引为i的左孩子的索引为2*i+1；2、索引为i的右孩子的索引为2*i+2；3、索引为i的父节点的索引为floor((i-1)/2)，即取不大于(i-1)/2的最大整数。



图(Graph)：

图分为无向无权图，无向有权图，有向无权图以及有向有权图。图最常见的算法是DFS和BFS。

老师强调：对于类似于DFS、BFS以及二叉树的遍历等这类代码，一定要死记硬背实现它的代码模版！！！






