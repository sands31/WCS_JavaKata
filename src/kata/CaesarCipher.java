public class CaesarCipher {

    public static String ceasarCipher(String word, int shift) {
    	String encrypt = "";
    	int encryptInt;
    	for (int i = 0; i < word.length(); i++) {
    		encryptInt = word.charAt(i) + shift;
    		if (encryptInt < 97)
    			encryptInt += 26;
    		if (encryptInt > 122)
    			encryptInt -= 26;
    		
    		encrypt += (char) encryptInt;
    	} 	  	
		return encrypt; 	
    }
}
