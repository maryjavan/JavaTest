
public class SomeClass {
	    
	    public int compareVersion(String version1, String version2) {
	    
	    int cursor = 0;
		String[] first = version1.split(".");
		String[] second = version2.split(".");
		int i=0;
				
		while (i < first.length && i < second.length ){
			if (version1.charAt(cursor)== '.') {
				first[i] = Integer.parseInt(version1.substring(j,cursor));
				i++;
				j=cursor+1;
				}
		cursor++;
		}
		
		cursor = 0;
		i=0;
		j=0;
		
		while (cursor < version2.length()){
			if (version2.charAt(cursor)== '.') {
				second[i] = Integer.parseInt(version2.substring(j,cursor));
				i++;
				j=cursor+1;
				}
		cursor++;
		}
		
		i=0;
		while (i<5) {
			if (first[i] < second[i]) return -1;
			else if (first[i] > second[i]) return 1;
		}
		return 0;
	    }
	}
