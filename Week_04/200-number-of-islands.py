class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if len(grid) == 0: return 0
        row, column, count = len(grid), len(grid[0]), 0
        def dfs(grid, row, column, i, j):
            if i < 0 or j < 0 or i >= row or j >= column or grid[i][j] == '0': return
            grid[i][j] = '0'
            dfs(grid, row, column, i + 1, j)
            dfs(grid, row, column, i - 1, j)
            dfs(grid, row, column, i, j + 1)
            dfs(grid, row, column, i, j - 1)
        for i in range(row):
            for j in range(column):
                if grid[i][j] == '1':
                    count += 1
                    dfs(grid, row, column, i, j)
        return count
        