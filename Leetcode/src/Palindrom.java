
public class Palindrom {

	 public static boolean isPalindrome(String s) {
	     
		 int i=0;
		 int j=s.length()-1;
		 char ch1;
		 char ch2;
		
		 
		 s = s.toLowerCase();
		 
		 if (s.length()<2) return true;
		 
		 while ( i<j) {
			 ch1 = s.charAt(i);
			 ch2 = s.charAt(j);
			 
			while ( (ch1 < 'a' || ch1 > 'z') && (i < j-1)) {
				i++;
				ch1= s.charAt(i);
			}
			
			while (( ch2 < 'a' || ch2 > 'z') && (j >0)) {
				j--;
				ch2= s.charAt(j);
			}
					
			if ( ch1 != ch2 ) return false;
			else {
				i++;
				j--;
			}
			
		 }
		 
		 return true;
		 
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("///m...i;;;;m"));

	}

}
