package Past Contest Problems.1st Problems;

public class Contest_264 {
    static boolean isValid(String str){
        int hypen=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))) return false;
            if(Character.isLowerCase(str.charAt(i))) continue;
            if(str.charAt(i)=='-'){
                if(++hypen>1) return false;
                if(i-1<0||!Character.isLowerCase(str.charAt(i-1))||
                        i+1>=str.length()||!Character.isLowerCase(str.charAt(i+1))) return false;
            }else if(i!=str.length()-1) return false;
        }
        return true;
    }
    public int countValidWords(String sentence) {
        if(sentence.length()==0) return 0;
        String[] str=sentence.trim().split("\\s+");
        int count=0;
        for(String i:str){
            if(isValid(i)) count++;
        }
        return count;
    }
}
