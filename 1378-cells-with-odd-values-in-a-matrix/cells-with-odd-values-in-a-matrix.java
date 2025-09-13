class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int oddCells = 0;
        int[][] newMatrix = new int[m][n];

        for(int i = 0; i < indices.length; i++){
            int rowCount = indices[i][0];
            int colCount = indices[i][1];

            for(int j = 0; j < n; j++){
                newMatrix[rowCount][j] += 1;
            }

            for (int j = 0; j < m; j++){
                newMatrix[j][colCount] += 1;
            }
        }

        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(newMatrix[i][j] % 2 != 0){
                    oddCells++;
                }
            }
        }
        
        return oddCells;
    }
}