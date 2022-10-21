package Past Contest Problems.1st Problems;

public class Contest_79 {
    public boolean digitCount(String num) {
        int freq[] = new int[10];
        int len=num.length();
        for(int i=0;i<len;i++){
            freq[(int)(num.charAt(i)-'0')]++;
        }
        for(int i=0;i<len;i++){
            if((int)(num.charAt(i)-'0')!=freq[i]){
                return false;
            }
        }
        return true;
    }
}
