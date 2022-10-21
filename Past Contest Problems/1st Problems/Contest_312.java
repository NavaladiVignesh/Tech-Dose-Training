package Past Contest Problems.1st Problems;

public class Contest_312 {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = heights.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(heights[i]<heights[j]){
                    int temp1 = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp1;
                    
                    String temp2 = names[i];
                    names[i] = names[j];
                    names[j] = temp2;
                }
            }
        }
        return names;
    }
}
