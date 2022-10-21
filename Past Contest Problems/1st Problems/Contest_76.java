package Past Contest Problems.1st Problems;

public class Contest_76 {
    public int countPrefixes(String[] words, String s) {
        int len=s.length(),count=0;
        int len1=words.length;
        String arr[] = new String[len];
        for(int i=0;i<len;i++){
            arr[i]=s.substring(0,i+1);
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len1;j++){
                if(words[j].equals(arr[i])){
                    count++;
                }
            }
        }
        return count;
    }
}
