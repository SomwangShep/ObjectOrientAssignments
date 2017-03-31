
public class VowelMash implements ICrypto
{
	/*----------------------------------------------------------*/
	private static VowelMash m_instance = null;
	private VowelMash() {}
	// always use the most abstract class, in this case is ICrypto instead of VowelMash
	public static ICrypto getInstance() 
	{
		if (m_instance == null)
			m_instance = new VowelMash();
		return m_instance;
	}
	/*----------------------------------------------------------*/
	
	@Override
	public String encrypt(String message) 
	{
		
		return vowelSwap(message);
	}

	@Override
	public String decrypt(String message) 
	{
		return vowelSwap(message);
		
	}
	private String vowelSwap(String message){
		IMessageParser m=Factory.getInstance().createParser(message);
		String s = "";
		for (int i = 0;i<m.getCharCount();i++)
		{
			char c = m.getChar(i);
			if (c =='A') s = s + 'U';
			else if (c =='U') s = s + 'O' ;
			else if (c =='O') s = s + 'I' ;
			else if (c =='I') s = s + 'E' ;
			else if (c =='E') s = s + 'A' ;
			else s = s + c;
		}		
		return s;	
	}
}
