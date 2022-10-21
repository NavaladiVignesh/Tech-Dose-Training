package Past Contest Problems.1st Problems;

public class Contest_274 {
    public boolean checkString(String s) {
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)=='b' && s.charAt(i)=='a')
                return false;
        }
        return true;
    }
}
