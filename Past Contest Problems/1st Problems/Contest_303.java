package Past Contest Problems.1st Problems;

public class Contest_303 {
    public char repeatedCharacter(String s) {
        int[] hash=new int[26];
        char ch='a';
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
            if(hash[s.charAt(i)-'a']>1){
                ch=s.charAt(i);
                break;
            }
        }
        return ch;
    }
}
