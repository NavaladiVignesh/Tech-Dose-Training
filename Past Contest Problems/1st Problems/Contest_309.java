package Past Contest Problems.1st Problems;

public class Contest_309 {
    public boolean checkDistances(String s, int[] distance) 
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),i);
            }
            else
            {
                int prev=map.get(s.charAt(i));
                int index=s.charAt(i)-'a';
                if(distance[index]!=i-prev-1)
                    return false;
            }
        }
        return true;
}
