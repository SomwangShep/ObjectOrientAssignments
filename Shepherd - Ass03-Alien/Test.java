
public class Test 
{
	public static void main(String[] args)
	{
		String msg1 = "MY FEVUROTI THONG EBUAT IERTH OS FRINCH FROIS";
		String msg2 = "KCIR DLEIFGNIRPS SI YM ETIROVAF GNIDROCER TSITRA";
		String msg3 = "WE ARE PEACEFUL ALWAYS WEAR YOUR SUNGLASSES AT NIGHT";
		
		System.out.println(vowelMash2(msg1)); 
		System.out.println(worldReverse2(msg1));
		System.out.println("----------------------------------------------");
		
		System.out.println(vowelMash2(msg2)); 
		System.out.println(worldReverse2(msg2));
		System.out.println("----------------------------------------------");
		
		System.out.println(vowelMash2(msg3)); 
		System.out.println(worldReverse2(msg3));
		
	}
	/*-------------------------------------------------------------*/
	/*  replace vowel
	 * A = E, E = I, I=O, O=U, U=A
	 */
	/*-------------------------------------------------------------*/
	private static String vowelMash2(String msg)
	{
		String s = "";
		for (int i = 0;i<msg.length();i++)
		{
			char c = msg.charAt(i);
			if (c =='A') s = s + 'U';
			else if (c =='U') s = s + 'O' ;
			else if (c =='O') s = s + 'I' ;
			else if (c =='I') s = s + 'E' ;
			else if (c =='E') s = s + 'A' ;
			else s = s + c;
		}
		return s;
	}
	/*-------------------------------------------------------------*/
	/* reverse the letters
	/*-------------------------------------------------------------*/
	
	private static String worldReverse2(String msg)
	{
		String[] s = msg.split(" ");
		String res = "";
		for (int i = 0;i< s.length;i++)
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
