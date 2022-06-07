package JavaSessions;

public class Array_Concepts {

	public static void main(String[] args) {
//Static Array
		//size is fixed.
	
		///Integer array
		int p[]=new int[3];
		p[0]=10;
		p[1]=20;
		p[2]=30;
		
		
		System.out.println(p[2]);
		//System.out.println(p[4]);//this throw array index out of bound exception
		
		
		//To Print all values using for loop 
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
		
		//using for each loop
		for(int e:p) {
			System.out.println(e);
		}
		
		
		
		//double array:
		double d[]=new double[2];
		d[0]=12.33;
		d[1]=2;
		
		//using for loop 
		for(int m=0;m<d.length;m++) {
			System.out.println(d[m]);
		}
		
		//for each loop 
		for(double e: d) {
			System.out.println(e);
		}
		
		System.out.println("==================================");
		
	///Char Array	
		
		char c[]=new char[2];
		c[0]='a';
		c[1]='b';
		
		//using for loop 
		for(int o=0;o<c.length;o++) {
			System.out.println((int)c[o]);
		}
		
		//using foreach
		for(char e:c) {
			System.out.println((int)e);
		}
		System.out.println("==================================");
		
		//Object Array --for dissimilar datatypes
		
		Object t[]=new Object[3];
		 t[0]="Jaggu";
		 t[1]=22;
		 t[2]="Hi";
		 
		 //usinf for loop 
		 for(int l=0;l<t.length;l++) {
			 System.out.println(t[l]);
		 }
		 
		 //using for Each:
		 
		 for(Object e:t) {
			 System.out.println(e);
		 }
				 
		
		 
		
		
		
		
	}

	
}
