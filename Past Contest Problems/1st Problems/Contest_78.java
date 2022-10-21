package Past Contest Problems.1st Problems;

public class Contest_78 {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int len = s.length();
        int n = len%k==0?0:len%k;
        int count=0,val=0;
        for(int i=0;i<=len-k;i++){
            val = Integer.parseInt(s.substring(i,i+k));
            if(val!=0)
            if(num%val==0)
                count++;
        }
        return count;
    }
}
