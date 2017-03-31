import java.util.ArrayList;
import java.util.List;

public class MessageParser implements IMessageParser
{
	private List<String> m_words = new ArrayList<String>();
    private String m_message = "";    
 	
	public MessageParser(String msg) 
	{
		this.m_message=msg;
		String[] s = msg.split(" ",-1);
		for (int i = 0;i<s.length;i++)
		{
			m_words.add(s[i]);
		}

	}
	/*=====================================================*/
	@Override
	public int getCharCount() {
		
		return m_message.length();
	}

	@Override
	public int getWordCount() {
		
		return m_words.size();
	}

	@Override
	public char getChar(int i) {

		return m_message.charAt(i);
	}

	@Override
	public String getWord(int i) {
		
		return m_words.get(i);
	}

}
