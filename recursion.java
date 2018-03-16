
public class recursion {
	
	
	public static void main(String[] args) {

//		System.out.println(minChar("hlp|apppeo"));
		System.out.println(moneyDay(29));
		
		
	}
	
	
	public static int sumInts(int start, int end) {	
		if(end == start ) 
			return start;
		else 
			return end + sumInts(start, end-1);
		
	}
	
	
//	returns minimun character in a string. Ex. "hello" returns 'e'
	
	public static char minChar(String s) {
		if(s.length()==1)
			return s.charAt(0);
		if(s.length() == 2 && (s.charAt(0) < s.charAt(1)))
			return s.charAt(0);
		else if(s.length() == 2 && (s.charAt(0) > s.charAt(1)))
			return s.charAt(1);
		
		
		//if the second to last letter is smaller than the last letter,
		//return the string w/o the last letter
		else if(s.charAt(s.length()-2) < s.charAt(s.length()-1)) 
			return minChar(s.substring(0, s.length()-1));
		
		
		//if the last letter is smaller than the second to last letter,
		//return the string w/o the second to last letter
		else if(s.charAt(s.length()-1) < s.charAt(s.length()-2)) 
			return minChar(s.substring(0, s.length()-2) + s.charAt(s.length()-1));
		
		
		//if the last letter is the same as the second to last letter
		//return the string w/o the last letter
		else if(s.charAt(s.length()-1) == s.charAt(s.length()-2)) 
			return minChar(s.substring(0, s.length()-1));
		
		
		//in theory it should never get here
		else { 
			System.out.println("i don't know how you got this message");
			return minChar(s.substring(0, s.length()-1));
		}
		
		
	}
	
	
	//Double Your Pay, Everyday! Format answer in dollars and cents e.g. $ddd.cc
	
			public static double moneyDay(int day) {
				
				if(day <= 1)
					return .01;
				else
					return moneyDay(day-1)*2;
				
				
			}
	
	
	
	

}
