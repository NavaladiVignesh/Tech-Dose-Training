package Past Contest Problems.1st Problems;

public class Contest_263 {
    public boolean areNumbersAscending(String s) {
        int prev=0;
        for(String str:s.split(" ")){
            try{
                int num=Integer.parseInt(str);
                if(num<=prev) return false;
                prev=num;
            }catch(Exception e){}
        }
        return true;
    }
}
