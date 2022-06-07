package AccessModifiers;

public class MSC extends Company{
	
	
	
	
	public static void main(String[] args) {
      
		MSC m=new MSC();
		
		m.place();
		//m.name();//private not accessible 
		m.empCount();
		m.avgSalary();
		
	}

}
