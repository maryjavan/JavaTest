import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class produceParanthesis {

public static List<String> generateParenthesis(int n) {
     
	List<String> l = new ArrayList<String>();
	List<String> temp = new ArrayList<String>();

	if ( n == 2) l.add("()");
	
	else {
		
		temp = generateParenthesis(n-1);
		Iterator<String> it= temp.iterator();
		
		while (it.hasNext()){
			String s = it.next();
			String left = "()"+ s;
			String right = s + "()";
			if (left.equals(right) ) l.add(right);
			else {
			l.add("()"+ s);
			l.add(s + "()");
			}
			l.add("("+s+")");
		}
	
	return l;
		
			
	}
	
	return l;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(6));
	}

}
