package CallByReferenceConcepts;

public class TestReg {

	public static void main(String[] args) {
		
		Registration reg=new Registration("Lav","Jaggu",908765,"Chennai","lav.mail.com");
		
		reg.doRegistration(reg);
		
	}

}
