package Past Contest Problems.1st Problems;

import java.util.HashSet;
import java.util.Set;

public class Contest_275 {
    public boolean checkValid(int[][] matrix) {
        int sum,count=0,mount=0;
        int n=matrix.length;
        sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            int rsum=0;
            for(int j=0;j<n;j++)
                rsum=rsum+matrix[i][j];
            if(rsum!=sum)
                return false;
        }
        for(int i=0;i<n;i++){
            int csum=0;
            for(int j=0;j<n;j++)
                csum=csum+matrix[j][i];
            if(csum!=sum)
                return false;
        }
        for(int i=0;i<n;i++){
            Set<Integer> set1=new HashSet<>();
            for(int j=1;j<=n;j++){
                if(set1.contains(matrix[i][j-1]))
                    return false;
                set1.add(matrix[i][j-1]);
            }
        }
        for(int i=1;i<n;i++){
            Set<Integer> set2=new HashSet<>();
            for(int j=0;j<n;j++){
                if(set2.contains(matrix[j][i-1]))
                    return false;
                set2.add(matrix[j][i-1]);
            }
        }
        return true;
    }
}
