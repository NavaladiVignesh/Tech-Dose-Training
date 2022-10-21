package Past Contest Problems.1st Problems;

public class Contest_314 {
    public int hardestWorker(int n, int[][] logs) {
        int time = Integer.MIN_VALUE, temp=0 , count = 0;
        for(int[]i : logs){
            
            if((i[1]-temp)>time){
                time = i[1] - temp;
                count = i[0];
            }
            
            if((i[1]-temp)==time){
                time = i[1]-temp;
                if(count>i[0]){
                    count = i[0];
                }
            }
            
            temp = i[1];
        }
        return count;
    }
}
