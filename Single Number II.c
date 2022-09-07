class Main {
public:
    int singleNumber(vector<int>& nums) {
        int N = nums.size();
        
        int ans = 0;
        
        for(int i=0; i<=31; i++){
            int ctr = 0;
            for(int j : nums){
                if(j&(1<<i)){
                    ctr++;
                }
            }
            if(ctr%3) ans |= 1<<i;
        }
        return ans;
    }
};
