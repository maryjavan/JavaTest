
public class paranthesis {

	
public static boolean isValid(String s) {
    
	int i=0;
	char[] list=new char[s.length()];
	int top=0;
	
	
	while (i < s.length()){
		
		if ( s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ) {
			list[top]= s.charAt(i);
			top++;
			i++;
		}
		
		else if (top > 0) {
			
			if (s.charAt(i)== ')') {
			
			if (list[top-1] == '('){ 
				top = top-1;
				i++;
			}
			else return false;
		}
			
		
			
		else if (s.charAt(i)== ']') {
			
			if (list[top-1] == '['){ 
				top = top-1;
				i++;
			}
			else return false;
		}

		else if (s.charAt(i)== '}') {
	
			if (list[top-1] == '{'){ 
				top = top-1;
				i++;
			}
			else return false;
		}
	} else return false;
	
	} 
	
	if (top == 0) return true;
		else return false;
	
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()]"));
	}

}
