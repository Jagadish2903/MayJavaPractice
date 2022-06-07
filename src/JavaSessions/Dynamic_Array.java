package JavaSessions;

import java.util.ArrayList;

public class Dynamic_Array {

	public static void main(String[] args) {

		ArrayList<Object> ar=new ArrayList<Object>();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		ar.add(2000);
		//ar.remove(4);
		
				System.out.println(ar.size());
		//using for loop 
				
				for(int i=0;i<ar.size();i++) {
				System.out.println(ar.get(i));
				}
				
			
			
	}

}
