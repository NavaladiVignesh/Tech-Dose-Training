package Past Contest Problems.1st Problems;

public class Contest_85 {
    public int minimumRecolors(String blocks, int k) {
        int len=blocks.length(),ind=0,count=0,max=0;
        for(int i=0;i<=len-k;i++){
            count=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='B'){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ind=i;
            }
        }
        if(k<max){
            return 0;
        }
        else{
            int val=k-max;
            return val;
        }
    }
}
