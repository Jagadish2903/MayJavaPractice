package InheritanceConcept;

public class Test_Hospital {

	public static void main(String[] args) {

		
		Hospital h=new Hospital();
		h.ambulance();
		h.iCU();
		h.billing();
	
		System.out.println("================================================");
		
		ApolloHospital h1=new ApolloHospital();
		h1.ambulance();
		h1.iCU();
		h1.diabetic();
		h1.billing();
		
		//Top Casting
		Hospital h2=new ApolloHospital();
		h2.ambulance();
		h2.billing();
		h2.iCU();
		
		
		
		System.out.println("================================================");
		
		AnnaiArulHospital h3= new AnnaiArulHospital();
		h3.ambulance();
		h3.iCU();
		h3.cardiac();
		h3.billing();
		h3.eNT();
		h3.urinary();
		
		//Top Casting
		Hospital h4=new AnnaiArulHospital();
		h4.ambulance();
		h4.billing();
		h4.iCU();
		
		System.out.println("================================================");
		
		
		HinduMissionHospital h5=new HinduMissionHospital();
		h5.ambulance();
		h5.billing();
		h5.iCU();
		h5.fertility();
		h5.dental();
		h5.sinus();
		
		//Top Casting 
		
		Hospital h6= new HinduMissionHospital();
		h6.ambulance();
		h6.billing();
		h6.iCU();
		
		
		
		
		
		
		
		
		
	}

}
