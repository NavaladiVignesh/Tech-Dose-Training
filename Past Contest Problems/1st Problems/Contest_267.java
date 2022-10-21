package Past Contest Problems.1st Problems;

public class Contest_267 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        while(true){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]==0) continue;
                tickets[i]--;
                count++;
                if(tickets[k]==0) return count;
            }
        }
    }
}
