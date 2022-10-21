package Past Contest Problems.1st Problems;

public class Contest_80 {
    public boolean strongPasswordCheckerII(String password) {
        int ucount=0,lcount=0,ncount=0,sccount=0;
        int len=password.length();
        if(len<8){
            return false;
        }
        if(password.charAt(0)==password.charAt(1))
            return false;
        for(int i=0;i<len;i++){
            if(i!=0){
                if(password.charAt(i)==password.charAt(i-1))
                    return false;
            }
            if(password.charAt(i) >='A' && password.charAt(i) <='Z'){
                ucount++;
            }
            else if(password.charAt(i) >='a' && password.charAt(i) <='z'){
                lcount++;
            }
            else if(password.charAt(i) >='0' && password.charAt(i) <='9'){
                ncount++;
            }
            else{
                sccount++;
            }
        }
        if(ucount >0 && lcount >0 && ncount>0 && sccount>0 && len>=8){
            return true;
        }
        else{
            return false;
        }
    }
}
