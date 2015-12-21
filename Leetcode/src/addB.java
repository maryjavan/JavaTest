
public class addB {
	
	 public static String addBinary(String s1, String s2) {
	     
		 if (s1 == null || s2 == null) return "";
		    int first = s1.length() - 1;
		    int second = s2.length() - 1;
		    
		    
		    String result ="";
		    int carry = 0;
		    int sum = 0;
		    
		    while (first >= 0 || second >= 0) {
	        
		        sum = sum + carry;
		        carry=0;
		        
		    	if (first >= 0) {
		    		
		    	 sum = sum + Integer.parseInt(String.valueOf(s1.charAt(first)));
		    		
		            first--;
		        }
		        if (second >= 0) {
		        	
		        	sum = sum + Integer.parseInt(String.valueOf(s2.charAt(second)));
		        	
		            second--;
		        }
		        
		        if (sum == 2) {
		        	
		        	sum = 0;
		        	carry =1;
		        	
		        }
		        
		        if (sum == 3) {
		        	
		        	sum= 1;
		        	carry =1;
		        	
		        }
		        
		       result = Integer.toString(sum) +  result;
		       sum=0;
		        
		    }
		    if (carry > 0)
		        result = "1" + result;

		 return result;
		  
		 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary(args[0],args[1]));
	}

}
