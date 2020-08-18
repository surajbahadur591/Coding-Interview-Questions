class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def sinkIsland(grid, row, col):
            if grid[row][col] == '1':
                grid[row][col] = '0'
            else:
                return
            if row+1<len(grid):
                sinkIsland(grid, row+1, col)
            if row-1>=0:
                sinkIsland(grid, row-1, col)
            if col+1<len(grid[0]):
                sinkIsland(grid, row, col+1)
            if col-1>=0:
                sinkIsland(grid, row, col-1)
        counter = 0
        for i in range (len(grid)):
            for j in range (len(grid[0])):
                if grid[i][j] == '1':
                    counter +=1
                    sinkIsland(grid, i , j)
        return counter