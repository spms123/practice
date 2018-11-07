package stringSamples;

public class IsvalidNumber {

	public static void main(String[] args) {
		String[] s = { "0","0.1","abc","1 a","2e10"," -90e3"," 1e","e3"," 6e-1"," 99e2.5 ","53.5e93"," --6 ","-+3","95a54e53"};
//				"0" => true
//				" 0.1 " => true
//				"abc" => false
//				"1 a" => false
//				"2e10" => true
//				" -90e3   " => true
//				" 1e" => false
//				"e3" => false ===
//				" 6e-1" => true ===
//				" 99e2.5 " => false ===
//				"53.5e93" => true
//				" --6 " => false
//				"-+3" => false
//				"95a54e53" => false
		
		for(int i =0; i<s.length;i++) {
			System.out.println(s[i]+" --> "+isValid(s[i]));
		}
		
	}

	private static String isValid(String s) {
		
		String s1 = s.trim();
		
		if(s1 == null)
			return "fail : 0";
		
		int index =0;
		
//		if(s1.charAt(0)== '+' || s1.charAt(0)== '-' || s1.charAt(0)== '.')
//			index++;
		
		for(int i=index;i<s1.length();i++,index++) {	
			
			if(s1.charAt(index)== '+' || s1.charAt(index)== '-' || s1.charAt(index)== '.')
				break;
			
			if(!((s1.charAt(index) >= '0' && s1.charAt(index) <= '9') || (s1.charAt(index) == 'e')))
				return "fail : 1 for char :"+s1.charAt(index);
						
			if(s1.charAt(index) == '.' && (s1.charAt(index+1) >= '0' || s1.charAt(index+1) <= '9'))
				return "fail : 2 for char :"+s1.charAt(index);

			if(s1.charAt(index) == 'e') {
				if(index+1 == s1.length())
					return "fail : 3 for char :"+s1.charAt(index);
				
				if(!((s1.charAt(index+1) >= '0' && s1.charAt(index+1) <= '9') ||
							s1.charAt(index+1) == '+' || s1.charAt(index+1) == '-' ))
					return "fail : 3 for char :"+s1.charAt(index);
			}
			
			if(s1.charAt(index) == 'e' && s1.charAt(index+1) == '.')
				return "fail : 4 for char :"+s1.charAt(index);
		}
		
		return "true";
		// TODO Auto-generated method stub
		
	}

}
