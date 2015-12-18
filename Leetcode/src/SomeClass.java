
public class SomeClass {
	    
	    public int compareVersion(String version1, String version2) {
	    
	    
		String[] first = version1.split(".");
		String[] second = version2.split(".");
		int i=0;
				
		while (i < first.length && i < second.length ){
			if (Integer.parseInt(first[i]) < Integer.parseInt(second[i])) return -1;
			else if (Integer.parseInt(first[i]) > Integer.parseInt(second[i])) return 1; 
			i++;
		}
		
		while (first.length >= i) {
			if (Integer.parseInt(first[i])!= 0) return 1;
			i++;
		}
		
		while (second.length >= i) {
			if (Integer.parseInt(second[i])!= 0) return -1;
			i++;
		}
		return 0;
	    }
	}
