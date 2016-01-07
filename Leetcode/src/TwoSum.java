import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class TwoSum {

public int[] twoSum(int[] nums, int target) {
	
	int[] res = new int[2];
	Map<Integer, Integer> entry = new HashMap<Integer, Integer>();
	int val=0;
	
	
	for (int i=0; i<nums.length; i++)
			entry.put(i+1, nums[i]);
			
	for (int i=0; i<nums.length; i++){
		
		if (entry.containsValue(target - nums[i])){
			
			res[0] = i+1;
			val= target - nums[i];
		}
	}
	
	for (Entry<Integer,Integer> n : entry.entrySet()) {
		
		if (n.getValue()==val) res[1]= n.getKey();
	}
	
	
	return res;
     
	
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
