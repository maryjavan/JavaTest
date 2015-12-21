
public class LastWord {
	
	public int lengthOfLastWord(String s) {
        
        while (s.length() > 0 && s.charAt(s.length()-1) == ' ') {
           s=s.substring(0,s.length()-1);
       }
       // is it not better to use?  s = s.trim();
       
       int cursor = s.length()-1;
       
       
       // is the next line really necessary ? What happens if it is not there ?
       if (s.length() == 0 ) return 0;
       
       
       while (cursor >= 0){
          
          if (s.charAt(cursor) == ' ') return s.length()-cursor-1;
           cursor--;
       }
       
       return s.length();
   }

}
