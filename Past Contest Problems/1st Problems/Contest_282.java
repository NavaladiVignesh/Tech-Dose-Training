package Past Contest Problems.1st Problems;

public class Contest_282 {
    public int prefixCount(String[] words, String pref) {
        int lwords=words.length;
        int lpref=pref.length();
        int count=0,count1=0;
        String str;
        for(int index=0;index<lwords;index++){
            str=words[index];
            if(str.indexOf(pref)==0) count++;
        }
        return count;
    }
}
