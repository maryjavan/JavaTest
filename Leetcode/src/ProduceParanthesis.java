import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProduceParanthesis {

public static List<String> generateParenthesis(int n) {
     
	List<String> l = new ArrayList<String>();
	List<String> temp = new ArrayList<String>();
	Set<String> hs = new HashSet<String>();

	if (n<1) return null;
	
	for (int i=1; i <= n; i++){
		if ( i == 1) l.add("()");
		
		else {
			temp.clear();
			temp.addAll(l);
			Iterator<String> it= temp.iterator();
			l.clear();
			
			while (it.hasNext()){
				String s = it.next();
				l.add("("+s+")");
				String left = "()"+ s;
				String right = s + "()";
				l.add(left);
				l.add(right);
				
			}
						
		}
    }

	
	hs.addAll(l);
	l.clear();
	l.addAll(hs);	
	return l;	
	}
	/*
	
	if ( n == 1) l.add("()");
	
	else {
		
		temp = generateParenthesis(n-1);
		Iterator<String> it= temp.iterator();
		
		while (it.hasNext()){
			String s = it.next();
			l.add("("+s+")");
			String left = "()"+ s;
			String right = s + "()";
			if (left.equals(right) ) l.add(right);
			else {
			l.add(left);
			l.add(right);
			}
		}
	
	return l;
		
			
	}
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(4));
	}

}
