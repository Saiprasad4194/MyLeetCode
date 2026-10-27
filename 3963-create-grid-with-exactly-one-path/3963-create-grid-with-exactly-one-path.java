class Solution {
    public String[] createGrid(int m, int n) {
        String[][] grid=new String[m][n];
        String[] result = new String[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]="#";
            }
        }
        for(int i=0;i<m;i++){
            grid[i][0]=".";

        }
        for(int j=1;j<n;j++){
            grid[m-1][j]=".";
        }

        for(int i=0;i<m;i++){
            result[i]=String.join("",grid[i]);
        }

        return result;
    }
}