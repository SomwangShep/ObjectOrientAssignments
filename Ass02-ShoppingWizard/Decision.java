import java.util.Scanner;

public class Decision implements IDecision{

	private String m_question;
	private IDecision m_yes;
	private IDecision m_no;
	private String m_yesTerminate;
	private String m_noTermiate;
	
	private static Scanner keyboard = new Scanner(System.in);
	
	public Decision(String m_question,IDecision m_yes,IDecision m_no,
			String m_yesTerminate,String m_noTermiate){
		this.m_question = m_question;
		this.m_yes = m_yes;
		this.m_no = m_no;
		this.m_yesTerminate = m_yesTerminate;
		this.m_noTermiate=m_noTermiate;
		
	}
	@Override
	public void setYes(IDecision yes) {
		m_yes=yes;
	}
	@Override
	public void setNo(IDecision no) {
		m_no = no;
	}	
	@Override
	public  void setYesTerminal(String terminal){
		m_yesTerminate = terminal;
	}
	@Override
	public void setNoTerminal(String terminal){
		m_noTermiate = terminal;	
	}
	
	@Override
	public IDecision ask(){
		/*-------------------------------------------------------------*/
		// as the user the current question...
		String s = msg(m_question);
		if (s.equalsIgnoreCase("y") && m_yes != null) 
		{
			// if the user answers yes,
			// and there is a decision object set for a yes answer
			// return the yes decision object
			return m_yes;
		}
		else if(s.equalsIgnoreCase("y"))
		{
			// otherwise print the yes terminal string and return null
			System.out.println(m_yesTerminate);
			return null;
		}
		/*-------------------------------------------------------------*/
		else if (s.equalsIgnoreCase("n") && m_no != null)
		{
			// if the user answers no 
			// and there is a decision object set for a no answer
			// return the no decision object		
			return m_no;
		}
		else
		{
			// otherwise print the no terminal string and return null
			System.out.println(m_noTermiate);
			return null;
		}		 
	
	}
	/*--------------------------------------------------------------------------*/
	/*		This method to getting the input from the user						*/
	/*--------------------------------------------------------------------------*/
	private String msg(String s){
		System.out.print(s);
		return (keyboard.next().trim().toUpperCase());	
	}

}
