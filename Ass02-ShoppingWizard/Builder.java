public class Builder {
	/*----------------------------------------------------------*/
	private static Builder m_instance;
	public static String buildWizard;
	
	public static Builder getInstance(){
		if (m_instance == null)
			m_instance = new Builder();
		return m_instance;
	}
	private Builder() {};
	/*----------------------------------------------------------*/
	
	/*-------------------------------------------------------------------------------------------------------------*/
	/*	method below is building the map for program to follow										
	/*	need to start from decision that doesn't require any other decision, in this case either d4 or d8
	/*-------------------------------------------------------------------------------------------------------------*/
	public IDecision buildWizard() {
		
		IDecision d4 = new Decision("Do you like to go fast?",null,null,"Buy the XG300 model","Buy the XG200 model");
		IDecision d3 = new Decision("Are you an expert?",d4,null,null,"Buy the XG200");
		IDecision d2 = new Decision("Have you snowboard before?",d3,null,null,"Buy the XG100 model");
		IDecision d8 = new Decision("Do you like to jump?",null,null,"By the ZR300 model","Buy the ZR200 model");
		IDecision d7 = new Decision("Are you an expert?",d8,null,null,"Buy the ZR200 model");
		IDecision d6 = new Decision("Have you gone skiing before?",d7,null,null,"Buy the ZR100 model");
		IDecision d5 = new Decision("Do you want to buy downhill skis?",d6,null,null,"Recommend they try skiing someday");
		IDecision d1 = new Decision("Do you want to buy a snowboard?",d2,d5,null,null);
				
		return d1;//return the first question that you want program to start with
	}
	
	
	

}
