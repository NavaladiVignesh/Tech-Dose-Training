package Past Contest Problems.1st Problems;

public class Contest_270 {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list=new ArrayList<>();
        int[] count=new int[10];
        for(int i=0;i<digits.length;i++) count[digits[i]]++;
        for(int i=1;i<=9;i++){
            count[i]--;
            for(int j=0;j<=9;j++){
                count[j]--;
                for(int k=0;k<=8;k+=2){
                    count[k]--;
                    if(count[i]>=0&&count[j]>=0&&count[k]>=0)
                        list.add(i*100+j*10+k);
                    count[k]++;
                }
                count[j]++;
            }
            count[i]++;
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
