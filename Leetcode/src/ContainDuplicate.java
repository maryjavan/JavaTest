import java.util.HashSet;
import java.util.Set;


public class ContainDuplicate {

	 public static boolean containsDuplicate(int[] nums) {
	     
			Set<Integer> s =new HashSet<Integer>();
			
			for (int i=0; i<nums.length ; i++){
				
				s.add(nums[i]);
			}
			
		if (s.size()== nums.length) return false;
		else return true;
			
			 
		    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l[]= {3,5};
		System.out.println(containsDuplicate(l));
		
	

	}

	

}
