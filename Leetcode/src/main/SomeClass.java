

public class SomeClass {
	    
	    public static int compareVersion(String version1, String version2) {
	    
	    
		String[] first = version1.split("//.");
		String[] second = version2.split("//.");
		int i=0;
				
		
		//consider using Integer.compare https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#compare(int,%20int)
		while (i < first.length && i < second.length ){
			if (Integer.parseInt(first[i]) < Integer.parseInt(second[i])) return -1;
			else if (Integer.parseInt(first[i]) > Integer.parseInt(second[i])) return 1; 
			i++;
		}
		
		while (first.length > i) {
			if (Integer.parseInt(first[i])!= 0) return 1;
			i++;
		}
		
		while (second.length > i) {
			if (Integer.parseInt(second[i])!= 0) return -1;
			i++;
		}
		return 0;
	    }
	    
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
	    	System.out.println(compareVersion("1.0","1.1"));
		}	    
	}
