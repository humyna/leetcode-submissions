package info.zoio.array;

public class V0001TwoSum {
	 public static int[] twoSum(int[] nums, int target) {
	        for(int i = 0;i<nums.length;i++){
	            for(int j = 0;j<nums.length;j++){
	                if(i!= j && (nums[i]+nums[j] == target)){
	                    return new int[]{i,j};
	                }  
	            }
	        }
	        return null;
	    }
	    
	    public static void main(String [] args){
	        int[] intArr= new int[]{-1,-2,-3,-4,-5};
	        int target =-8;
	        int[] sum = twoSum(intArr,target);
	        System.out.println(sum);
	    }
}
