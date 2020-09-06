# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        ls = []
        def wrapper(node):
            if node:
                wrapper(node.left)
                ls.append(node.val)
                wrapper(node.right)
        wrapper(root)
        return ls