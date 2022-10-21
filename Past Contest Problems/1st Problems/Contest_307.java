package Past Contest Problems.1st Problems;

public class Contest_307 {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int n = energy.length;
        int sum = 0;
        int res = 0;
		 
        for (int i : energy) {
            sum += i;
        }
        res += sum - initialEnergy >= 0 ? sum - initialEnergy + 1: 0;
        
        for (int i : experience) {
            if (initialExperience <= i) {
                res += i - initialExperience + 1;
                initialExperience = i + 1;
            }
            initialExperience += i;
        }
        return res;
    }
}
