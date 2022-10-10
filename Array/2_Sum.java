package Array;

import java.util.HashMap;
import java.util.Map;

public class 2_ Sum{public int[]twoSum(int[]nums,int target){Map<Integer,Integer>map=new HashMap<>();for(int i=0;i<nums.length;i++){int need=target-nums[i];if(map.get(need)!=null)return new int[]{map.get(need),i};map.put(nums[i],i);}return null;}}
