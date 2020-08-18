class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        for i in range (0, len(matrix)):
            for j in range(i+1, len(matrix[i])):
                temp = matrix[i][j]
                matrix[i][j]= matrix[j][i]
                matrix[j][i]=temp
            matrix[i].reverse()