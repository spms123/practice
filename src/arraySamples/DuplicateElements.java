package arraySamples;

import java.util.HashSet;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"Struts", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		findDuplicates(strArray);
	}

	private static void findDuplicates(String[] strArray) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		
		for (String string : strArray) {
			if(!set.add(string))
				System.out.println("The duplicate element is: "+ string);
		}
		
	}
	

}
