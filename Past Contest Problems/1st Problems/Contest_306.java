package Past Contest Problems.1st Problems;

public class Contest_306 {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] maxLocal = new int[n-2][n-2];
        for(int i=0;i<n-2;i++)
            for(int j=0;j<n-2;j++)
                maxLocal[i][j]=maxVal(i,j,grid);
        return maxLocal;
    }
    static int maxVal(int i,int j, int[][] grid){
        int ans=0;
        for(int k=i;k<=i+2;k++)
            for(int l=j;l<=j+2;l++)
                ans=Math.max(grid[k][l],ans);
        return ans;
    }
}
