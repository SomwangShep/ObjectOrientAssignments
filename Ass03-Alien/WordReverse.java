
public class WordReverse implements ICrypto
{
	/*----------------------------------------------------------*/
	private static WordReverse m_instance = null;
	private WordReverse() {}
	// always use the most abstract class, in this case is ICrypto instead of WordReverse
	public static ICrypto getInstance() 
	{
		if (m_instance == null)
			m_instance = new WordReverse();
		return m_instance;
	}
	/*----------------------------------------------------------*/
	@Override
	public String encrypt(String message) 
	{

		return worldSwap(message);
	}

	@Override
	public String decrypt(String message) 
	{
		return worldSwap(message);
	}
	
	private String worldSwap(String message){
		IMessageParser m=Factory.getInstance().createParser(message);
		String[] s = message.split(" ",-1);
		String res = "";
		
		for (int i = 0;i< m.getWordCount();i++)
		{
			for (int j = s[i].length()-1;j>=0;j--)
			{
				res = res + s[i].charAt(j);
			}
			res =res + " ";
		}
		return res;
	}
}
