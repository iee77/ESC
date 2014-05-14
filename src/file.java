
public class file {

	static int[] Ascii = new int[Main.toCrypt.length()];
	static char[] Chars = new char[Main.toCrypt.length()];
	
	public static int CharToASCII(char character){
		return (int)character;
	}
	
	public static char ASCIIToChar(int ascii){
		return (char)ascii;		
	}

	
	public static void crypt() {
		int[] Ascii = new int[Main.toCrypt.length()];
		char[] Chars = new char[Main.toCrypt.length()];
		
		for(int q=0;q<Main.toCrypt.length();q++) {
			Ascii[q] = CharToASCII(Main.toCrypt.charAt(q));
			Ascii[q] += 10;
			Chars[q] = ASCIIToChar(Ascii[q]);
		}
		
		String s = new String(Chars);
		Main.getjTextArea1().setText(s);
		
	}
	public static void deCrypt() {
		
		for(int q=0;q<Main.toCrypt.length();q++) {
			Ascii[q] = CharToASCII(Main.toCrypt.charAt(q));
			Ascii[q] -= 10;
			Chars[q] = ASCIIToChar(Ascii[q]);
		}
		String s = new String(Chars);
		Main.getjTextArea1().setText(s);
		
	}
	
}
